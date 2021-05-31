package com.techshard.graphql.model;


public class User {

	public User() {
	}

	public User(int id, String name, boolean working) {
		this.id = id;
		this.name = name;
		this.working = working;
	}

	private int id;
	private String name;
	private boolean working;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isWorking() {
		return working;
	}

	public void setWorking(boolean working) {
		this.working = working;
	}
}
