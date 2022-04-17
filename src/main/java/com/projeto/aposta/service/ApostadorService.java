package com.projeto.aposta.service;

import com.projeto.aposta.model.Apostador;
import com.projeto.aposta.model.dto.ApostadorIn;
import com.projeto.aposta.repository.ApostadorRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
@RequiredArgsConstructor
@Service
public class ApostadorService {

    private final ApostadorRepository apostadorRepository;
    private final ModelMapper modelMapper;
    public void salvaApostador(ApostadorIn apostadorIn) {

       Apostador apostador =  modelMapper.map(apostadorIn, Apostador.class);
        apostadorRepository.save(apostador);
    }
}
