package com.antriksh.app.ls.api;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserInfoDTO {

	@NotBlank(message = "* Your name can't be blank")
	@Size(min = 3, max = 15, message = " *Your Name should have char between 3-15")
	private String userName;


	@NotBlank(message = "* Crush name can't be blank")
	@Size(min = 3, max = 15, message = " *Crush Name should have char between 3-15")
	
	private String crushName;
	@AssertTrue(message = "you have to agree term and condition")
	private boolean termAndCondition;

	
	public boolean isTermAndCondition() {

		return termAndCondition;
	}

	public void setTermAndCondition(boolean termAndCondition) {
		this.termAndCondition = termAndCondition;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getCrushName() {
		return crushName;
	}

	public void setCrushName(String crushName) {
		this.crushName = crushName;
	}

	@Override
	public String toString() {
		return "UserInfoDTO [userName=" + userName + ", crushName=" + crushName + "]";
	}
}
