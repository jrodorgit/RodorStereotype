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
	
	List<Constant> getAllByDate(Timestamp fecha);
	
}
