package com.training.autowire;

import org.springframework.stereotype.Component;

@Component
public class Screen {
private String glassType;
private int len;
private int bre;
public Screen() {
	// TODO Auto-generated constructor stub
	
	System.out.println("creating scrrens:  "+this);
}
public String getGlassType() {
	return glassType;
}
public void setGlassType(String glassType) {
	this.glassType = glassType;
}
public int getLen() {
	return len;
}
public void setLen(int len) {
	this.len = len;
}
public int getBre() {
	return bre;
}
public void setBre(int bre) {
	this.bre = bre;
}


}
