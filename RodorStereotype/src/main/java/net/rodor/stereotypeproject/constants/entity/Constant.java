package net.rodor.stereotypeproject.constants.entity;

import java.sql.Timestamp;

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
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "permiso_generator")
	@SequenceGenerator(name="permiso_generator", sequenceName = "SEQ_T_PERMISO", allocationSize=1)
	private Integer id;
	
	@Column(name = "clave")
	public  String clave;
	
	@Column(name = "descripcion")
	public  String descripcion;
	
	@Column(name = "fechini")
	public  Timestamp fechaInicio;
	
	@Column(name = "fechfin")
	public  Timestamp fechaFin;
	
	
	
	@Override
	public int compareTo(Constant constant) {
		return this.id.compareTo(constant.id);
	}



	@Override
	public String toString() {
		return "Constant [id=" + id + ", clave=" + clave + ", descripcion=" + descripcion + ", fechaInicio="
				+ fechaInicio + ", fechaFin=" + fechaFin + "]";
	}
	

}
