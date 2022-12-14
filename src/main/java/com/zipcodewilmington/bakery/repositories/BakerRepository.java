package com.zipcodewilmington.bakery.repositories;

import com.zipcodewilmington.bakery.models.Baker;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BakerRepository extends CrudRepository<Baker, Long> {

    public Optional<Baker> findById(Long Id);

}
