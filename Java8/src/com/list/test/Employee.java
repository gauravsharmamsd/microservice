package com.list.test;

public class Employee {
private int salary;
private boolean haveGF;

@Override
public String toString() {
	return "Employee [salary=" + salary + ", haveGF=" + haveGF + "]";
}
public Employee(int salary, boolean haveGF) {
	super();
	this.salary = salary;
	this.haveGF = haveGF;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public boolean isHaveGF() {
	return haveGF;
}
public void setHaveGF(boolean haveGF) {
	this.haveGF = haveGF;
}
}
