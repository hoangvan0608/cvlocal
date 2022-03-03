package com.bezkoder.cv_management.Entity;

import javax.persistence.*;

@Entity
@Table(name = "permissions")
public class Permission {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Enumerated(EnumType.STRING)
	@Column(length = 20)
	private EPermission name;

	public Permission() {

	}


	public Permission(EPermission name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public EPermission getName() {
		return name;
	}

	public void setName(EPermission name) {
		this.name = name;
	}
}