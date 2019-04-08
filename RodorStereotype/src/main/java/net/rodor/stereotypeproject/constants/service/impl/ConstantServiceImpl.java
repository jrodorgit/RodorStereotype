package net.rodor.stereotypeproject.constants.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.rodor.stereotypeproject.constants.dao.ConstantDao;
import net.rodor.stereotypeproject.constants.entity.Constant;
import net.rodor.stereotypeproject.constants.service.ConstantService;

@Service
public class ConstantServiceImpl implements ConstantService {

	@Autowired
	private  ConstantDao dao;
	
	@Override
	@Transactional
	public int save(Constant entidad) {
		return dao.create(entidad);
	}

	@Override
	@Transactional
	public void update(Constant entidad) {
		dao.update(entidad);

	}

	@Override
	@Transactional
	public void delete(Constant entidad) {
		dao.delete(entidad);

	}

	@Override
	public Constant getConstant(int id) {
		return dao.find(id);
	}

	@Override
	public List<Constant> getConstants() {
		return dao.findAll();
	}

}
