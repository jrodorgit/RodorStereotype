package net.rodor.stereotypeproject.constants.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import net.rodor.stereotypeproject.constants.entity.Constant;

public class ConstantRowMapper implements RowMapper<Constant> {

	public static final String CONSTANT_FECHFIN = "fechfin";
	public static final String CONSTANT_FECHINI = "fechini";
	public static final String CONSTANT_DESCRIPCION = "descripcion";
	public static final String CONSTANT_CLAVE = "clave";
	public static final String CONSTANT_ID = "id";

	@Override
	public Constant mapRow(ResultSet rs, int rowNum) throws SQLException {
		Constant obj = new Constant();
		obj.setId(rs.getInt(CONSTANT_ID));
		obj.setClave(rs.getString(CONSTANT_CLAVE));
		obj.setDescripcion(rs.getString(CONSTANT_DESCRIPCION));
		obj.setFechaInicio(rs.getTimestamp(CONSTANT_FECHINI));
		obj.setFechaFin(rs.getTimestamp(CONSTANT_FECHFIN));
		return obj;
	}

}
