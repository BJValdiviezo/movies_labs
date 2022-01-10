package com.alkemy.movies.movies.entity;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name ="movies_or_series")
public class MovieOrSerieEntity {
	@Id
	private String title;
	private String imagen;
	@Column(name = "creation_Date")
	@DateTimeFormat(pattern="yyyy/mm/dd")
	private LocalDate creationDate;
	private int calification;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "gender_id", insertable = false, updatable = false)
	private GenderEntity gender;
	
	@Column(name = "gender_id")
	private long gender_id;
	
	@ManyToMany(
			cascade = {
					CascadeType.PERSIST,
					CascadeType.MERGE,
					
			})
	@JoinTable(
			name = "character_mos",
			joinColumns = @JoinColumn(name = "mos_id"),
			inverseJoinColumns = @JoinColumn(name = "character_id"))
	private Set<CharacterEntity> characters = new HashSet<>();
	
}