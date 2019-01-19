package com.training.carfactory.model.dao;

import com.training.carfactory.model.entity.Engine;

import java.util.List;

public interface EngineDao {

    List<Engine> getAll();

    Engine getByName(String name);
}
