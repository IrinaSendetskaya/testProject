package by.htp.carparking.domain;

import java.io.Serializable;

public abstract class EntityCarparking implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5019914751317541226L;
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public EntityCarparking(int id) {
		super();
		this.id = id;
	}

	public EntityCarparking() {
		super();
	}
	
	
	
}
