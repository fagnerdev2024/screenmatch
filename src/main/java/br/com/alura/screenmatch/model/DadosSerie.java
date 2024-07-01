package br.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosSerie(

        @JsonAlias("Title1")
        String tituloooo,

        @JsonAlias("totalSeasons1")
        Integer totalTemporadas,

        @JsonAlias("imdbRating1")
        String avaliacao) {


}
