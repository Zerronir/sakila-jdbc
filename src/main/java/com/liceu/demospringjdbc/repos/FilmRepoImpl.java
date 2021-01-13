package com.liceu.demospringjdbc.repos;

import com.liceu.demospringjdbc.entities.Film;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FilmRepoImpl implements FilmRepo {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public List<Film> findAll() {
        return jdbcTemplate.query("SELECT * FROM film", new BeanPropertyRowMapper<>(Film.class));
    }

    @Override
    public List<Film> findAvailable() {
        return null;
    }
}
