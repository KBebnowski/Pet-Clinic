package kamil.springframework.sfgpetclinic.repositories;

import kamil.springframework.sfgpetclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Kamil on 28.05.2020.
 */
public interface SpecialtyRepository extends CrudRepository<Speciality, Long> {
}
