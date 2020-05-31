package kamil.springframework.sfgpetclinic.repositories;

import kamil.springframework.sfgpetclinic.model.Person;
import kamil.springframework.sfgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Kamil on 28.05.2020.
 */
public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
