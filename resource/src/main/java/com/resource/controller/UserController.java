package com.resource.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.annotation.JsonCreator.Mode;
import com.resource.dto.AddNewProject;
import com.resource.model.AccountDetails;
import com.resource.model.DemandDetails;
import com.resource.model.Interview;
import com.resource.model.Login;
import com.resource.model.ProjectDetails;
import com.resource.model.User;
import com.resource.repository.DemandRepository;
import com.resource.repository.InterviewRepository;
import com.resource.repository.ProjectRepository;
import com.resource.repository.UserRepository;

@Controller
public class UserController {

	@Autowired
	UserRepository userRepository;
	@Autowired
	InterviewRepository interviewRepository;
	@Autowired
	DemandRepository demandRepository;
	
	@Autowired
	ProjectRepository projectRepository;
	@GetMapping("/home")
	public String homePage(Model model) {
		return "login";
	}

	@GetMapping("/register")
	public String viewPage(Model model, @RequestParam(value = "id", required = false) Integer id) {
		User user = new User();
		if (id != null) {
			user = userRepository.findById(id).get();
		}
		model.addAttribute("Form", user);

		return "register";
	}

	@PostMapping("/login")
	public String login(Model model, @ModelAttribute Login login) {
		if (login.getUsername().equals("admin") && login.getPassword().equals("admin")) {
			return "redirect:/register";
		} else {
			return "redirect:/home";
		}
	}

	@PostMapping("/save")
	public String registerSave(Model model, @ModelAttribute User user) {
		userRepository.save(user);
		model.addAttribute("success", "Object Save");
		return "redirect:/register";
	}

	@ModelAttribute("userlist")
	public List<User> studentDisplay(Model model) {
		List<User> list = userRepository.findAll();
		return list;
	}

	@GetMapping("deleteUser")
	public String deleteUser(@RequestParam("id") Integer integer) {
		userRepository.deleteById(integer);
		return "redirect:/register";
	}

	/*
	 * @GetMapping("editUser") public String editUser(Model
	 * model, @RequestParam("id") Integer id, @ModelAttribute User user) {
	 * System.out.println(id); userRepository.save(user); return
	 * "redirect:/register"; }
	 */
	@GetMapping("/interview")
	public String viewInterviewPage(Model model, @RequestParam(value = "id", required = false) Integer id) {
		Interview interview = new Interview();
		if (id != null) {
			interview = interviewRepository.findById(id).get();
		}
		model.addAttribute("interviewForm", interview);

		return "interview";
	}

	@ModelAttribute("interviewlist")
	public List<Interview> studentDisplay() {
		List<Interview> list = interviewRepository.findAll();
		return list;
	}

	@PostMapping("/saveInterview")
	public String interviewerSave(Model model, @ModelAttribute Interview interview) {
		interviewRepository.save(interview);
		return "redirect:/interview";
	}

	@GetMapping("/deleteInterviewer")
	public String interviewerDelete(Model model, @RequestParam("id") Integer integer) {
		interviewRepository.deleteById(integer);
		return "redirect:/interview";
	}
@PostMapping("/createDemand")
	public String viewCreateDemand(Model model) {
		
		return "";
	}
/*Demand Operations*/
@GetMapping("/viewDemand")
public String viewDemandpage(Model model, @RequestParam(value = "id", required = false) Integer id) {
	DemandDetails demand = new DemandDetails();
	if (id != null) {
		demand = demandRepository.findById(id).get();
	}
	model.addAttribute("demandForm", demand);

	return "demand";
}
@PostMapping("/saveDemand")
public String demandSave(Model model, @ModelAttribute DemandDetails demandDetails) {
	demandRepository.save(demandDetails);
	return "redirect:/viewDemand";
}
@ModelAttribute("demandlist")
public List<DemandDetails> demandDisplay(Model model) {
	List<DemandDetails> demlist = demandRepository.findAll();
	return demlist;
}
@GetMapping("deletedemand")
public String deleteDemand(@RequestParam("id") Integer integer) {
	demandRepository.deleteById(integer);
	return "redirect:/viewDemand";
}
/*projects*/

@GetMapping("/viewProject")
public String viewProject(Model model, @RequestParam(value = "id", required = false) Integer id) {
	ProjectDetails project= new ProjectDetails();
	if (id != null) {
		project=projectRepository.findById(id).get();
	}
	model.addAttribute("projectForm", project);

	return "project";
}
@PostMapping("/saveProject")
public String projectSave(Model model, @ModelAttribute AddNewProject addNewProject) {
	AccountDetails account=new AccountDetails();
	account.setAcc_name(addNewProject.getAccount_name());
	ProjectDetails proj=new ProjectDetails();
	proj.setProj_code(addNewProject.getProj_code());
	proj.setProj_description(addNewProject.getProj_description());
	//proj.setProj_start_date(addNewProject.getProj_start_date());
	//proj.setProj_end_date(addNewProject.getProj_end_date());
	proj.getAcc_id().setAcc_name(addNewProject.getAccount_name());;
	projectRepository.save(proj);
	return "redirect:/viewProject";
}
@ModelAttribute("projectlist")
public List<ProjectDetails> projectDisplay(Model model) {
	List<ProjectDetails> prolist = projectRepository.findAll();
	return prolist;
}
@GetMapping("deleteProject")
public String deleteProject(@RequestParam("id") Integer integer) {
	projectRepository.deleteById(integer);
	return "redirect:/viewProject";
}


}
