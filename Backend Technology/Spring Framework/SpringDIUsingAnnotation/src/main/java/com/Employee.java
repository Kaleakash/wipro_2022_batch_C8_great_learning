package com;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Employee {
@Value(value = "1010")
private int id;
private String name;
private float salary;
private String skillSet[];
private List<Long> phonenumber;
@Autowired
private Address add;
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
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}
public String[] getSkillSet() {
	return skillSet;
}
public void setSkillSet(String[] skillSet) {
	this.skillSet = skillSet;
}
public List<Long> getPhonenumber() {
	return phonenumber;
}
public void setPhonenumber(List<Long> phonenumber) {
	this.phonenumber = phonenumber;
}
public Address getAdd() {
	return add;
}
public void setAdd(Address add) {
	this.add = add;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", skillSet=" + Arrays.toString(skillSet)
			+ ", phonenumber=" + phonenumber + ", add=" + add + "]";
}

}
