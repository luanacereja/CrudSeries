package br.com.lucode.app.web;

import br.com.lucode.app.entity.Serie;
import org.springframework.web.bind.annotation.*;
import br.com.lucode.app.service.SerieService;

import java.util.List;

@RestController
@RequestMapping("/series")
public class SerieController {

    private SerieService serieService;

    public SerieController(SerieService serieService) {
        this.serieService = serieService;
    }

    @PostMapping
    List<Serie> create(@RequestBody Serie serie){
        return serieService.create(serie);
    }

    @GetMapping
    List<Serie> list(){
        return serieService.list();
    }

    @PutMapping
    List<Serie> update(@RequestBody Serie serie){
        return serieService.update(serie);
    }

    @DeleteMapping("{id}")
    List<Serie> delete(@PathVariable("id") Long id){
        return serieService.delete(id);
    }

}
