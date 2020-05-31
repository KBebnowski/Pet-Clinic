package kamil.springframework.sfgpetclinic.repositories;

import kamil.springframework.sfgpetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Kamil on 28.05.2020.
 */
public interface VetRepository extends CrudRepository<Vet, Long> {
}
