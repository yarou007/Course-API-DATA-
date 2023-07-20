package com.example.demo.topic;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Topic {

	@Id
	private String id;
	private String name;
	private String desc;
	
	
	public Topic() {
		
	}
	public Topic(String id, String name, String desc) {
		super();
		this.id = id;
		this.name = name;
		this.desc = desc;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
}
