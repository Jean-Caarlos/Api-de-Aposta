package com.projeto.aposta.Controller;

import com.projeto.aposta.model.dto.ApostadorIn;
import com.projeto.aposta.repository.ApostadorRepository;
import com.projeto.aposta.service.ApostadorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RequiredArgsConstructor
@RestController
public class ApostadorController {
    private final ApostadorService apostadorService;

    @PostMapping("/apostador")
    public ResponseEntity salvarApostador(@Valid @RequestBody ApostadorIn apostadorIn) {
      apostadorService.salvaApostador(apostadorIn);

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

}
