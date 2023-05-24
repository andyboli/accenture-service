package accenture.server.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Supplier {
	private String code;

	@Column(nullable = true)
	private String companyId;
	@Column(nullable = true)
	private String personId;
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getCompanyId() {
		return companyId;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	public String getPersonId() {
		return personId;
	}
	public void setPersonId(String personId) {
		this.personId = personId;
	}
}
