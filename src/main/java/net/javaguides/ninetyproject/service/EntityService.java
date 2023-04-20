package net.javaguides.ninetyproject.service;

import net.javaguides.ninetyproject.entity.Entity;

import java.util.List;

public interface EntityService {

    List<Entity> getAllEntities();

    Entity getEntityById(Long id);

    Entity createEntity(Entity entity);

    Entity updateEntity(Long id, Entity entity);

    void deleteEntity(Long id);
}
