package com.nagarro.entity;

import org.springframework.stereotype.Component;

/**
 * 
 * @author tanishasharma
 *
 */

@Component
public class Author {
	
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Author [name=" + name + "]";
	}
	
}
