package br.com.lucode.web;

import br.com.lucode.entity.Serie;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CrudSeriesApplicationTests {

    @Autowired
    private WebTestClient webTestClient;

    @Test
    void testCreateTodoSuccess(){
        var serie = new Serie("Serie 1" , "Description 1",
                "Brazil", false, 10, "Action");

        webTestClient
                .post()
                .uri("/series")
                .bodyValue(serie)
                .exchange()
                .expectStatus().isOk()
                .expectBody()
                .jsonPath("$").isArray()
                .jsonPath("$.length()").isEqualTo(1)
                .jsonPath("$.[0]name").isEqualTo(serie.getName())
                .jsonPath("$.[0]description").isEqualTo(serie.getDescription())
                .jsonPath("$.[0]country").isEqualTo(serie.getCountry())
                .jsonPath("$.[0]watched").isEqualTo(serie.isWatched())
                .jsonPath("$.[0]qtdEpisodes").isEqualTo(serie.getQtdEpisodes())
                .jsonPath("$.[0]genre").isEqualTo(serie.getGenre());

    }

    @Test
    void testCreateSerieFailure(){
        webTestClient
                .post()
                .uri("/series")
                .bodyValue(
                        new Serie("" , "Description 1",
                                "Brazil", false, 10, "Action"))
                .exchange()
                .expectStatus().isBadRequest();
    }


}
