package app.model.entity.person;

import app.model.entity.base.AbstractEntity;


/**
 * Entity that encapsulates user of the application
 * @author jeka */
public class Account extends AbstractEntity {
	private String name;
	private String password;

	public Account(String name, String password) {
		this.name = name;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
