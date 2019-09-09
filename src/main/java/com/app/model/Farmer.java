package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name = "farmer")
public class Farmer {
	@Id
	@GeneratedValue(generator = "sequence-generator")
	@GenericGenerator(name = "sequence-generator", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
			@Parameter(name = "sequence_name", value = "user_sequence"),
			@Parameter(name = "initial_value", value = "91000"), @Parameter(name = "increment_size", value = "1") })
	@Column(name = "id")
	private String id;
	@Column(name = "name")
	private String name;
	@Column(name = "village")

	private String village;

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

	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
	}
}