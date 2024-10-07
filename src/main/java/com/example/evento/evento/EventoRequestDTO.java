package com.example.valorant.jogador;

import java.time.LocalDate;
import java.time.LocalTime;

public record EventoRequestDTO(
        Long id,
        String nome,
        LocalDate data,
        LocalTime horarioEvento,
        String tipo,
        Long idLocal
) { }
