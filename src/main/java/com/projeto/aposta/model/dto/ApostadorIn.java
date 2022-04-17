package com.projeto.aposta.model.dto;

import com.projeto.aposta.model.Apostador;
import lombok.Getter;

import javax.validation.constraints.NotBlank;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;
@Getter
public class ApostadorIn {

    @NotBlank
    private String nome;

    @NotBlank
    private String email;

}
