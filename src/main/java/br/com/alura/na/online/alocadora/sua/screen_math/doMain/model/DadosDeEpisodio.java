package br.com.alura.na.online.alocadora.sua.screen_math.doMain.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosDeEpisodio(
        @JsonAlias("Title")
        String titulo,
        @JsonAlias("Episode")
        Integer numero,
        @JsonAlias("imdbRating")
        String avaliacao,
        @JsonAlias("Released")
        String dataDeLancamento
) {
}
