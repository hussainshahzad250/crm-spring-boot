package net.javaguides.springboot.tutorial.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="privilege")
public class Privilege {

	@Id
	@Column(name="privilege_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long privilegeId;
	
	@Column(name="description")
	private String description;
	

	@Column(name="value")
	private String value;


	public Long getPrivilegeId() {
		return privilegeId;
	}


	public String getDescription() {
		return description;
	}


	public String getValue() {
		return value;
	}


	public void setPrivilegeId(Long privilegeId) {
		this.privilegeId = privilegeId;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public void setValue(String value) {
		this.value = value;
	}
}
