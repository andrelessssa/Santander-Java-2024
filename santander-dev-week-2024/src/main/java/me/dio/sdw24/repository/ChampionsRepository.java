package me.dio.sdw24.repository;

import me.dio.sdw24.model.ChampionsModel;

import java.util.List;
import java.util.Optional;

public interface ChampionsRepository {

    List<ChampionsModel> findAll();

    Optional<ChampionsModel> findById(Long id);

}
