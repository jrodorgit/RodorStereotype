package net.rodor.stereotypeproject.constants.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="RODOR_CONSTANTS")
public class Constant implements Comparable<Constant> {

	@Id
	private Integer id;
	
	@Override
	public int compareTo(Constant constant) {
		return this.id.compareTo(constant.id);
	}

}
