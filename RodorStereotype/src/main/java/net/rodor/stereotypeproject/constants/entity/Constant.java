package net.rodor.stereotypeproject.constants.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="RODOR_CONSTANTS")
public class Constant implements Comparable<Constant> {

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "permiso_generator")
	@SequenceGenerator(name="permiso_generator", sequenceName = "SEQ_T_PERMISO", allocationSize=1)
	private Integer id;
	
	@Column(name = "CLAVE")
	public  String clave;
	
	@Column(name = "DESCRIPCION")
	public  String descripcion;
	
	@Column(name = "FECHINI")
	public  Date fechaInicio;
	
	@Column(name = "FECHFIN")
	public  Date fechaFin;
	
	
	
	@Override
	public int compareTo(Constant constant) {
		return this.id.compareTo(constant.id);
	}



	@Override
	public String toString() {
		return "Constant [id=" + id + ", clave=" + clave + ", descripcion=" + descripcion + ", fechaInicio="
				+ fechaInicio + ", fechaFin=" + fechaFin + "]";
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getClave() {
		return clave;
	}



	public void setClave(String clave) {
		this.clave = clave;
	}



	public String getDescripcion() {
		return descripcion;
	}



	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}



	public Date getFechaInicio() {
		return fechaInicio;
	}



	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}



	public Date getFechaFin() {
		return fechaFin;
	}



	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}


	

}
