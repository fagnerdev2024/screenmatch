package br.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosSerie(

        @JsonAlias("Agora é a Branche do Raphael que foi mergeada para a minha")
        String tituloooo,

        @JsonAlias("Agora é a Branche do Raphael que foi mergeada para a minha")
        Integer totalTemporadas,

        @JsonAlias("Agora é a Branche do Raphael que foi mergeada para a minha")
        String avaliacao) {


}
