package com.projeto.aposta.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@NoArgsConstructor
@Getter
@AllArgsConstructor
@Entity
public class Aposta {
    @Id @NotBlank
    private String numeroAposta;

    @ManyToOne
    @JoinColumn(name = "idApostador", nullable = false)
    private Apostador apostador;
}
