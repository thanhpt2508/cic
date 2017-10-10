package com.csetech.myspringmvc.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
@Entity
@Table(name = "DIA_CHINH", uniqueConstraints = { @UniqueConstraint(columnNames = { "MA" }) })
public class Diachinh {
	 public Diachinh() {		
	}
    @Id
    @Column(name = "id")
	public String getDcId() {
		return dcId;
	}

	public Diachinh(String dcId, String dcMa, String dcTen) {	
		this.dcId = dcId;
		this.dcMa = dcMa;
		this.dcTen = dcTen;
	}

	public void setDcId(String dcId) {
		this.dcId = dcId;
	}
	@Column(name = "ma", length = 30, nullable = false)
	public String getDcMa() {
		return dcMa;
	}

	public void setDcMa(String dcMa) {
		this.dcMa = dcMa;
	}
	@Column(name = "ten", length = 240, nullable = false)
	public String getDcTen() {
		return dcTen;
	}

	public void setDcTen(String dcTen) {
		this.dcTen = dcTen;
	}

	private String dcId;
	private String dcMa;
	private String dcTen;
	
	

}
