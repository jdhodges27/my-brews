package com.github.mlaursen.mybrews.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class GeneratedIdEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Long id;
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getId() {
	  return id;
	}
}
