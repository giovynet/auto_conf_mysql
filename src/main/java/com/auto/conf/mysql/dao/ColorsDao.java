package com.auto.conf.mysql.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class ColorsDao {

	@Autowired
   private JdbcTemplate jdbcTemplate;
	
	public List<String> selectColors() throws Exception {
		String sql = "SELECT name FROM tbl_color";

		List<String> response = jdbcTemplate.query(sql, new RowMapper<String>(){
            public String mapRow(ResultSet rs, int rowNum) throws SQLException {
                    return rs.getString(1);
            }
       });

		return response;
	}

}

