package net.rodor.stereotypeproject.constants.service;

import java.sql.Timestamp;
import java.util.List;

import net.rodor.stereotypeproject.constants.entity.Constant;

public interface ConstantService {

	int save(Constant entidad);
	
	void update(Constant entidad);
	
	void delete(Constant entidad);
	
	Constant getConstant(int id);
	
	List<Constant> getConstants();
	
	/**
	 * Devuelve a fecha introducida como parametro, el conjunto de constantes "activas" a dicha fecha.
	 * @param fecha Si la fecha es nula se devuelven las "activas" a fecha actual del sistema
	 * @return Listado de Constant
	 */
	List<Constant> getAllByDate(Timestamp fecha);
	
}
