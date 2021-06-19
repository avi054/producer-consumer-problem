package com.java.solution;

public class Employee {

	private int id;
	private String name;
	private int dept_id;
	private int manger_id;
	public Employee(int id, String name, int dept_id, int manger_id) {
		super();
		this.id = id;
		this.name = name;
		this.dept_id = dept_id;
		this.manger_id = manger_id;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept_id=" + dept_id + ", manger_id=" + manger_id + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	

}
