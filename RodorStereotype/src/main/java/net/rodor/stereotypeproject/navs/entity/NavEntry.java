package net.rodor.stereotypeproject.navs.entity;

import java.util.Date;
import java.util.List;

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
@Table(name = "RODOR_NAVS")
public class NavEntry implements Comparable<NavEntry> {

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "permiso_generator")
	@SequenceGenerator(name = "permiso_generator", sequenceName = "SEQ_T_PERMISO", allocationSize = 1)
	private Integer id;

	@Column(name = "APP")
	public String app;

	@Column(name = "PARENTCODE")
	public String parentCode;

	@Column(name = "CODE")
	public String code;

	@Column(name = "ORDEN")
	private Integer orden;

	@Column(name = "URI")
	public String uri;

	@Column(name = "STARTDATE")
	@DateTimeFormat(iso = ISO.DATE)
	public Date startdate;

	@Column(name = "ENDDATE")
	@DateTimeFormat(iso = ISO.DATE)
	public Date enddate;

	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getApp() {
		return app;
	}

	public void setApp(String appdomain) {
		this.app = appdomain;
	}

	public String getParentCode() {
		return parentCode;
	}

	public void setParentCode(String parentCode) {
		this.parentCode = parentCode;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getOrden() {
		return orden;
	}

	public void setOrden(Integer orden) {
		this.orden = orden;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
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
	public String toString() {
		return "NavEntry [id=" + id + ", app=" + app + ", parentCode=" + parentCode + ", code=" + code + ", orden="
				+ orden + ", uri=" + uri + ", startdate=" + startdate + ", enddate=" + enddate + ", submenus="
				+ submenus + "]";
	}

	@Override
	public int compareTo(NavEntry arg0) {
		return this.orden.compareTo(arg0.orden);
	}

	public List<NavEntry> submenus;

	public List<NavEntry> getSubmenus() {
		return submenus;
	}

	public void setSubmenus(List<NavEntry> submenus) {
		this.submenus = submenus;
	}
	
	
}
