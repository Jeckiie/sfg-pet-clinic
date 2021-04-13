package com.jerko.sfgpetclinic.services;

import com.jerko.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

}
