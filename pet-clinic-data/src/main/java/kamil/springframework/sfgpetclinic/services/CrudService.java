package kamil.springframework.sfgpetclinic.services;

import java.util.Set;

/**
 * Created by Kamil on 14.03.2020.
 */
public interface CrudService<T, ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}
