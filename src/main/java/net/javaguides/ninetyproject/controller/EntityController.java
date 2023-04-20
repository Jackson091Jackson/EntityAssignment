package net.javaguides.ninetyproject.controller;

import net.javaguides.ninetyproject.entity.Entity;
import net.javaguides.ninetyproject.service.EntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/entities")
public class EntityController {

    @Autowired
    private EntityService entityService;

    @GetMapping("")
    public List<Entity> getAllEntities() {
        return entityService.getAllEntities();
    }

    @GetMapping("/{id}")
    public Entity getEntityById(@PathVariable(value = "id") Long id) {
        return entityService.getEntityById(id);
    }

    @PostMapping("")
    public Entity createEntity(@RequestBody Entity entity) {
        return entityService.createEntity(entity);
    }

    @PutMapping("/{id}")
    public Entity updateEntity(@PathVariable(value = "id") Long id, @RequestBody Entity entity) {
        return entityService.updateEntity(id, entity);
    }

    @DeleteMapping("/{id}")
    public void deleteEntity(@PathVariable(value = "id") Long id) {
        entityService.deleteEntity(id);
    }

}
