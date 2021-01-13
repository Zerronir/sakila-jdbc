package com.liceu.demospringjdbc.repos;

import com.liceu.demospringjdbc.entities.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class StaffRepoImpl implements StaffRepo  {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public Staff staffInfo(String email) {
        return jdbcTemplate.queryForObject("SELECT * FROM staff WHERE email = ?",
                new BeanPropertyRowMapper<>(Staff.class), email);
    }

}
