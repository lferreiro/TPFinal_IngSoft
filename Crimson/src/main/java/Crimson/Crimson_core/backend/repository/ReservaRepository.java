package Crimson.Crimson_core.backend.repository;

import Crimson.Crimson_core.Reserva;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservaRepository extends CrudRepository<Reserva, Integer> {
}
