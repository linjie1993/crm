package com.entity.role;

import java.io.Serializable;

public class User implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    private Integer uId;

    private String uUsername;

    private String uPassword;

    private Integer uRId;

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getuUsername() {
        return uUsername;
    }

    public void setuUsername(String uUsername) {
        this.uUsername = uUsername == null ? null : uUsername.trim();
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword == null ? null : uPassword.trim();
    }

    public Integer getuRId() {
        return uRId;
    }

    public void setuRId(Integer uRId) {
        this.uRId = uRId;
    }

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Integer uId, String uUsername, String uPassword, Integer uRId) {
		super();
		this.uId = uId;
		this.uUsername = uUsername;
		this.uPassword = uPassword;
		this.uRId = uRId;
	}

	@Override
	public String toString() {
		return "User [uId=" + uId + ", uUsername=" + uUsername + ", uPassword=" + uPassword + ", uRId=" + uRId + "]";
	}
    
}