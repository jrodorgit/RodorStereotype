package net.rodor.stereotypeproject.constants.dao;

import java.sql.Timestamp;
import java.util.List;

import net.rodor.stereotypeproject.constants.entity.Constant;

public interface ConstantDao {

	int create(Constant constant);
	
	void update(Constant constant);
	
	void delete(Constant constant);
	
	Constant find(int id);
	
	List<Constant> findAll();
	
	List<Constant> getAllByDate(Timestamp fecha);
}
