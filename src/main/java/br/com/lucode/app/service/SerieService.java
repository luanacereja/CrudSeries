package br.com.lucode.app.service;

import br.com.lucode.app.entity.Serie;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import br.com.lucode.app.repository.SerieRepository;

import java.util.List;

@Service
public class SerieService {

    private SerieRepository serieRepository;

    public SerieService(SerieRepository serieRepository) {
        this.serieRepository = serieRepository;
    }

    public List<Serie> create(Serie serie){
        serieRepository.save(serie);
        return list();
    }

    public List<Serie> list(){
        Sort sort = Sort.by("watched").descending().and(
                Sort.by("name").ascending()
        );
        return serieRepository.findAll(sort);
    }

    public List<Serie> update(Serie serie){
        serieRepository.save(serie);
        return list();
    }

    public List<Serie> delete(Long id){
        serieRepository.deleteById(id);
        return list();
    }

}
