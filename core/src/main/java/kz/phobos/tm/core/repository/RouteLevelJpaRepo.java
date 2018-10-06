package kz.phobos.tm.core.repository;

import kz.phobos.tm.core.model.RouteLevel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;


//@Repository
@RepositoryRestResource
@CrossOrigin(origins = "http://localhost:4200")
public interface RouteLevelJpaRepo extends JpaRepository<RouteLevel, Integer> {
}
