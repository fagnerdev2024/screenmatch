package br.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosSerie(

        @JsonAlias("Titleeee")
        String tituloooo,

        @JsonAlias("totalSeasonssssssss")
        Integer totalTemporadas,

        @JsonAlias("imdbRatingggggggg")
        String avaliacao) {


}
