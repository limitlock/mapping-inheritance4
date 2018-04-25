package com.cafe24.mapping_inheritance4.domain;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@AttributeOverride(name="id", column=@Column(name="MEMBER_ID"))
public class Member extends BaseEntity {

	private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Member [email=" + email + ", getId()=" + getId() + ", getName()=" + getName() + "]";
	}

}
