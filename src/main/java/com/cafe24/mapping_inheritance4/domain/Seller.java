package com.cafe24.mapping_inheritance4.domain;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@AttributeOverrides({ @AttributeOverride(name = "id", column = @Column(name = "SELLER_ID")),
					  @AttributeOverride(name = "name", column = @Column(name = "SELLER_NAME"))})
public class Seller extends BaseEntity {
	private String phone;

	public String getphone() {
		return phone;
	}

	public void setphone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Seller [phone=" + phone + ", getId()=" + getId() + ", getName()=" + getName() + "]";
	}

}
