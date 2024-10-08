package com.example.evento.entrada;

public record EntradaResponseDTO(
    Long id, 
    int quantidade
) {
    public EntradaResponseDTO(Entrada entrada) {
        this(
            entrada.getId(),
            entrada.getQuantidade()
        );
    }
}