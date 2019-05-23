package kohb.polikek.server.repository;

import kohb.polikek.server.entity.Flat;
import org.springframework.data.repository.CrudRepository;

public interface FlatRepository extends CrudRepository<Flat, Integer> {
    Flat findById(int id);

    void deleteById(int id);
}
