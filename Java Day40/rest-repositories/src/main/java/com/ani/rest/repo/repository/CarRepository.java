package com.ani.rest.repo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestResource(collectionResourceRel="cars", path="cars")
@RepositoryRestController
public interface CarRepository extends CrudRepository<Car,Long> {
    
}
