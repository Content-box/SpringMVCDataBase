package kohb.polikek.server.service;

import kohb.polikek.server.entity.Flat;
import kohb.polikek.server.repository.FlatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class FlatService {
    @Autowired
    private FlatRepository flatRepository;

    public void save(Flat flat) {
        flatRepository.save(flat);
    }

    public List<Flat> getAll() {
        return (List<Flat>) flatRepository.findAll();
    }

    public Flat getById(int id) {
        return flatRepository.findById(id);
    }

    public void remove(int id) {
        flatRepository.deleteById(id);
    }

}
