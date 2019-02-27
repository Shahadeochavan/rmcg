package com.resource.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

@Entity
public class AccountDetails extends BaseModel {
	private String acc_no;
	private String acc_name;
	private String	acc_code;
	private String acc_description;
	private String	acc_type;
	@OneToMany(mappedBy="acc_id")
	private List<ProjectDetails> details;
	public List<ProjectDetails> getDetails() {
		return details;
	}
	public void setDetails(List<ProjectDetails> details) {
		this.details = details;
	}
	public String getAcc_no() {
		return acc_no;
	}
	public void setAcc_no(String acc_no) {
		this.acc_no = acc_no;
	}
	public String getAcc_name() {
		return acc_name;
	}
	public void setAcc_name(String acc_name) {
		this.acc_name = acc_name;
	}
	public String getAcc_code() {
		return acc_code;
	}
	public void setAcc_code(String acc_code) {
		this.acc_code = acc_code;
	}
	public String getAcc_description() {
		return acc_description;
	}
	public void setAcc_description(String acc_description) {
		this.acc_description = acc_description;
	}
	public String getAcc_type() {
		return acc_type;
	}
	public void setAcc_type(String acc_type) {
		this.acc_type = acc_type;
	}
	public AccountDetails() {
		super();
	}
	


}
