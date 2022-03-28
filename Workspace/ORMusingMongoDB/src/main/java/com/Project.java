package com;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Project {
@Id
private int pid;
private String project;
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getProject() {
	return project;
}
public void setProject(String project) {
	this.project = project;
}

}
