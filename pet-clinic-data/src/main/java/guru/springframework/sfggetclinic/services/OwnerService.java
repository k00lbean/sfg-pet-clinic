package guru.springframework.sfggetclinic.services;

import guru.springframework.sfggetclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
