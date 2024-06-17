package com.rubypaper.domain;

import java.util.Date;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
public class QandA {
	@Id @GeneratedValue
	private String id;
	private String content;
	private String code;
	private String category;
	private String starPoint;
	private String oUNo;
	private Date date;
}
