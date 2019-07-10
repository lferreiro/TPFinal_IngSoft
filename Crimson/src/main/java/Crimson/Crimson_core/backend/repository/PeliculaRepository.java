package Crimson.Crimson_core.backend.repository;

import Crimson.Crimson_core.Pelicula;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PeliculaRepository extends CrudRepository<Pelicula, String> {
}
