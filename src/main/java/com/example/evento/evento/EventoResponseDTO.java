package com.example.valorant.jogador;

import java.time.LocalDate;
import java.time.LocalTime;

public record EventoResponseDTO(
    Long id, 
    String nome,
    LocalDate data,
    LocalTime horarioEvento,
    String tipo,
    Long idLocal
) {
    public EventoResponseDTO(Evento evento) {
        this(
            evento.getId(),
            evento.getNome(),
            evento.getData(),
            evento.getHorarioEvento(),
            evento.getTipo(),
            evento.getLocal().getId()
        );
    }
}
