package com.rubypaper;

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
public class Users {
	@Id @GeneratedValue
	private String id;
	private String pw;
	private String pw2;
	private String name;
	private String email;
	private String address;
	private String phone;
}
