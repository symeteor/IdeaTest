package com.textar.typehandler;

import java.sql.CallableStatement;
import java.sql.JDBCType;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;

import com.textar.pojo.SexEnum;

@MappedJdbcTypes(JdbcType.INTEGER)
@MappedTypes(value=SexEnum.class)
public class SexTypeHandler extends BaseTypeHandler<SexEnum>{
	@Override
	public SexEnum getNullableResult(ResultSet rs,String col)
		throws SQLException{
		int sex=rs.getInt(col);
		if(sex!=1&&sex!=2) {
			return null;
		}
//		return SexEnum.getEnumById(sex);
		return SexEnum.getEnumById(sex);
	}
	
	@Override
	public SexEnum getNullableResult(ResultSet rs,int idx)
		throws SQLException{
		int sex=rs.getInt(idx);
		if(sex!=1&&sex!=2) {
			return null;
		}
		return SexEnum.getEnumById(sex);
	}
	
	@Override
	public SexEnum getNullableResult(CallableStatement cs,int idx)
		throws SQLException{
		int sex=cs.getInt(idx);
		if(sex!=1&&sex!=2) {
			return null;
		}
		return SexEnum.getEnumById(sex);
	}
	
	@Override
	public void setNonNullParameter(PreparedStatement ps,int idx, 
			SexEnum sex,JdbcType jdbcType) throws SQLException{
		ps.setInt(idx, sex.getId());
		}
}
