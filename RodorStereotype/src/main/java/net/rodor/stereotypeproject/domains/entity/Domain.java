package net.rodor.stereotypeproject.domains.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
@Table(name = "RODOR_DOMAINS")
public class Domain implements Comparable<Domain> {

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "permiso_generator")
	@SequenceGenerator(name = "permiso_generator", sequenceName = "SEQ_T_PERMISO", allocationSize = 1)
	private Integer id;

	@Column(name = "APPDOMAIN")
	public String appdomain;

	@Column(name = "NAMEDOMAIN")
	public String namedomain;

	@Column(name = "CODE")
	public String code;

	@Column(name = "DESCRIPTION")
	public String description;

	@Column(name = "DESCRIPTIONXL")
	public String descriptionXL;

	@Column(name = "DESCRIPTIONXS")
	public String descriptionXS;

	@Column(name = "STARTDATE")
	@DateTimeFormat(iso = ISO.DATE)
	public Date startdate;

	@Column(name = "ENDDATE")
	@DateTimeFormat(iso = ISO.DATE)
	public Date enddate;

	
	@Override
	public String toString() {
		return "Domain [id=" + id + ", appdomain=" + appdomain + ", namedomain=" + namedomain + ", code=" + code
				+ ", description=" + description + ", descriptionXL=" + descriptionXL + ", descriptionXS="
				+ descriptionXS + ", startdate=" + startdate + ", enddate=" + enddate + "]";
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getAppdomain() {
		return appdomain;
	}


	public void setAppdomain(String appdomain) {
		this.appdomain = appdomain;
	}


	public String getNamedomain() {
		return namedomain;
	}


	public void setNamedomain(String namedomain) {
		this.namedomain = namedomain;
	}


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getDescriptionXL() {
		return descriptionXL;
	}


	public void setDescriptionXL(String descriptionXL) {
		this.descriptionXL = descriptionXL;
	}


	public String getDescriptionXS() {
		return descriptionXS;
	}


	public void setDescriptionXS(String descriptionXS) {
		this.descriptionXS = descriptionXS;
	}


	public Date getStartdate() {
		return startdate;
	}


	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}


	public Date getEnddate() {
		return enddate;
	}


	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}


	@Override
	public int compareTo(Domain obj) {
		return this.id.compareTo(obj.id);
	}
}
