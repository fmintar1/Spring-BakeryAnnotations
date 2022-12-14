package com.zipcodewilmington.bakery.repositories;

import com.zipcodewilmington.bakery.models.Muffin;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MuffinRepository extends CrudRepository<Muffin, Long> {

    public Optional<Muffin> findById(Long id);
}
