package com.resource.dto;


public class AddNewProject {
	private Integer id;
	private String proj_code;
	private String subproj_code;
	private String proj_description;
	private String proj_start_date;
	private String proj_end_date;
	private String account_name;
	public AddNewProject() {
		super();
	}
	
	
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getProj_code() {
		return proj_code;
	}
	public void setProj_code(String proj_code) {
		this.proj_code = proj_code;
	}
	public String getSubproj_code() {
		return subproj_code;
	}
	public void setSubproj_code(String subproj_code) {
		this.subproj_code = subproj_code;
	}
	public String getProj_description() {
		return proj_description;
	}
	public void setProj_description(String proj_description) {
		this.proj_description = proj_description;
	}
	public String getProj_start_date() {
		return proj_start_date;
	}
	public void setProj_start_date(String proj_start_date) {
		this.proj_start_date = proj_start_date;
	}
	public String getProj_end_date() {
		return proj_end_date;
	}
	public void setProj_end_date(String proj_end_date) {
		this.proj_end_date = proj_end_date;
	}
	public String getAccount_name() {
		return account_name;
	}
	public void setAccount_name(String account_name) {
		this.account_name = account_name;
	}
	
	

}
