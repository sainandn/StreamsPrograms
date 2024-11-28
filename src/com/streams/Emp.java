package com.streams;

public class Emp {
	int id;
	String name;
	String dep;
	long sal;
	public Emp(int id, String name, String dep, long sal) {
		super();
		this.id = id;
		this.name = name;
		this.dep = dep;
		this.sal = sal;
	}
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
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
	public long getSal() {
		return sal;
	}
	public void setSal(long sal) {
		this.sal = sal;
	}
	

}
