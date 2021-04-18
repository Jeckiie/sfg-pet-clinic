package com.jerko.sfgpetclinic.repositories;

import com.jerko.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
