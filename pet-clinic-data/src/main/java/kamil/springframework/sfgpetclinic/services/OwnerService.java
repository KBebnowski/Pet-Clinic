package kamil.springframework.sfgpetclinic.services;

import kamil.springframework.sfgpetclinic.model.Owner;

/**
 * Created by Kamil on 11.03.2020.
 */
public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
