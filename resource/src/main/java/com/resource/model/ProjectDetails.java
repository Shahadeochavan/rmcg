package com.resource.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class ProjectDetails extends BaseModel {
	private String proj_code;
	private String subproj_code;
	private String proj_description;
	private String proj_start_date;
	private String proj_end_date;
	@ManyToOne
	@JoinColumn(name="account_id")
	private AccountDetails acc_id;
	
	
	
	public ProjectDetails() {
		super();
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
	public AccountDetails getAcc_id() {
		return acc_id;
	}
	public void setAcc_id(AccountDetails acc_id) {
		this.acc_id = acc_id;
	}
	

}
