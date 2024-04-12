package me.dio.sdw24.service;

import me.dio.sdw24.model.ChampionsModel;
import me.dio.sdw24.repository.ChampionsRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ChampionsService implements ChampionsRepository {

    private final JdbcTemplate jdbcTemplate;
    private final RowMapper<ChampionsModel> rowMapper;


    public ChampionsService(JdbcTemplate jdbcTemplate, RowMapper<ChampionsModel> rowMapper) {
        this.jdbcTemplate = jdbcTemplate;
        this.rowMapper = (rs, rowNum) -> new ChampionsModel(
                rs.getLong("id"),
                rs.getString("role"),
                rs.getString("lore"),
                rs.getString("image_url")
        );


    }

    @Override
    public List<ChampionsModel> findAll() {
        return jdbcTemplate.query("select * from champions;", rowMapper);
    }

    @Override
    public Optional<ChampionsModel> findById(Long id) {
        String sql = "select * from champions where id = ?";
        ChampionsModel championsModel = jdbcTemplate.queryForObject(sql, rowMapper,id);
        return Optional.ofNullable(championsModel);
    }
}
