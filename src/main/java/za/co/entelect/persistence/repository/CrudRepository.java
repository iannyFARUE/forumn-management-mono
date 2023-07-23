package za.co.entelect.persistence.repository;

import java.util.List;
import java.util.Optional;

public interface CrudRepository<T> {

    T save(T t);

    void delete(String email);

    Optional<T> findByEmail(String email);

    List<T> findAllParticipants();
}
