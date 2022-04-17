package com.projeto.aposta.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@Getter
public class ApostaOut {

    private String numeroAposta;
    private String nomeApostador;
    private String emailApostador;
}
