package by.htp.carparking.domain;

import java.io.Serializable;

public abstract class Entity implements Serializable {

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

	public Entity(int id) {
		super();
		this.id = id;
	}

	public Entity() {
		super();
	}
	
	
	
}
