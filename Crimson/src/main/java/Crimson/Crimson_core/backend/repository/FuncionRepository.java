package Crimson.Crimson_core.backend.repository;

import Crimson.Crimson_core.Funcion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionRepository extends CrudRepository<Funcion, String> {
}
