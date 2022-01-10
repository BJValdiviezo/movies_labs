package com.alkemy.movies.movies.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "genders")
@Getter
@Setter
public class GenderEntity {
	@Id
	private String name;
	private String imagen;
}