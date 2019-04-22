package net.rodor.stereotypeproject.roles.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

// @ Entity
// @ Table(name="RODOR_AUTHORITIES")
public class Authority implements Comparable<Authority> {

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "permiso_generator")
	@SequenceGenerator(name="permiso_generator", sequenceName = "SEQ_T_PERMISO", allocationSize=1)
	private Integer id;
	
	@Column(name = "ACCCODE")
	public  String acccode;
	
	@Column(name = "ACCDESC")
	public  String accdesc;

	@Override
	public int compareTo(Authority arg0) {
		return this.id.compareTo(arg0.id);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAcccode() {
		return acccode;
	}

	public void setAcccode(String acccode) {
		this.acccode = acccode;
	}

	public String getAccdesc() {
		return accdesc;
	}

	public void setAccdesc(String accdesc) {
		this.accdesc = accdesc;
	}

	@Override
	public String toString() {
		return "Authority [id=" + id + ", acccode=" + acccode + ", accdesc=" + accdesc + "]";
	}
	
}
