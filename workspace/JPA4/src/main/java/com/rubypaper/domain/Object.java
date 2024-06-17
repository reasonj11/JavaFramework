package com.rubypaper.domain;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
public class Object {
	@Id @GeneratedValue
	private String code;
	private String oName;
	private int price;
	private String size;
	private String category;
	private String material;
	private String factory;
	private String content;
}
