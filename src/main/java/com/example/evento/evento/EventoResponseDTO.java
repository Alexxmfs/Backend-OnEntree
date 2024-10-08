package com.example.evento.evento;

import java.time.LocalDate;
import java.time.LocalTime;

public record EventoResponseDTO(
    Long id, 
    String nome,
    LocalDate data,
    LocalTime horarioEvento,
    String tipo
) {
    public EventoResponseDTO(Evento evento) {
        this(
            evento.getId(),
            evento.getNome(),
            evento.getData(),
            evento.getHorarioEvento(),
            evento.getTipo()
        );
    }
}
