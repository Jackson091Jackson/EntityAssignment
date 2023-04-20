package net.javaguides.ninetyproject.service;

import net.javaguides.ninetyproject.entity.Entity;
import org.hibernate.engine.spi.SessionDelegatorBaseImpl;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntityServiceImpl implements EntityService{
    @Override
    public List<Entity> getAllEntities() {
        return null;
    }

    @Override
    public Entity getEntityById(Long id) {
        return null;
    }

    @Override
    public Entity createEntity(Entity entity) {
        return null;
    }

    @Override
    public Entity updateEntity(Long id, Entity entity) {
        Entity existingEntity = getEntityById(id);
        if(existingEntity!= null){
            existingEntity.setName(entity.getName());
            SessionDelegatorBaseImpl entityService = null;
            return (Entity) entityService.save(existingEntity);
        }else{
            return null;
        }
    }

    @Override
    public void deleteEntity(Long id) {
        SimpleJpaRepository entityService = null;
        entityService.deleteById(id);

    }
}
