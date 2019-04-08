package net.rodor.stereotypeproject.constants.dao;

import java.util.List;

import net.rodor.stereotypeproject.constants.entity.Constant;

public interface ConstantDao {

	int create(Constant constant);
	
	void update(Constant constant);
	
	void delete(Constant constant);
	
	Constant find(int id);
	
	List<Constant> findAll();
}
