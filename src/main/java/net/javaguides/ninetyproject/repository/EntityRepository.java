package net.javaguides.ninetyproject.repository;

import net.javaguides.ninetyproject.entity.Entity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntityRepository extends JpaRepository<Entity, Long> {


}
