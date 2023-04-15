package com.ani.rest.repo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


import com.ani.rest.repo.domain.Car;

@RepositoryRestResource(collectionResourceRel="cars", path="cars")
public interface CarRepository extends CrudRepository<Car,Long> {
    
}
