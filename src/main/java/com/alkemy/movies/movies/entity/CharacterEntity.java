package com.alkemy.movies.movies.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "characters")
public class CharacterEntity {
	@Id
	private String name;
	private String imagen;
	private int age;
	private long weith;
	private String history;
	@ManyToMany(mappedBy = "characters", cascade = CascadeType.ALL)
	private List<MovieOrSerieEntity> moss = new ArrayList<>();
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getWeith() {
		return weith;
	}
	public void setWeith(long weith) {
		this.weith = weith;
	}
	public String getHistory() {
		return history;
	}
	public void setHistory(String history) {
		this.history = history;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<MovieOrSerieEntity> getMoss() {
		return moss;
	}
	public void setMoss(List<MovieOrSerieEntity> moss) {
		this.moss = moss;
	}
}