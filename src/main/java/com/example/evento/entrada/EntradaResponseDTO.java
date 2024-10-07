package com.example.valorant.jogador;

public record EntradaResponseDTO(
    Long id, 
    int quantidade,
    Long idLocal
) {
    public EntradaResponseDTO(Entrada entrada) {
        this(
            entrada.getId(),
            entrada.getQuantidade(),
            entrada.getLocal().getId()
        );
    }
}