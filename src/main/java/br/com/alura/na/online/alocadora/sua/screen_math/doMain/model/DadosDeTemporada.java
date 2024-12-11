package br.com.alura.na.online.alocadora.sua.screen_math.doMain.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosDeTemporada(
        @JsonAlias("Season")
        Integer numero,
        @JsonAlias("Episodes")
        List<DadosDeEpisodio> episodios
) {
}
