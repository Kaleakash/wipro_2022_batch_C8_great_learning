package com;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Employees {
@Id
private int id;
private String name;
private int epid;				// FK 
//@ManyToOne(cascade = CascadeType.ALL)
//private Project pp;
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
public int getEpid() {
	return epid;
}
public void setEpid(int epid) {
	this.epid = epid;
}



}
