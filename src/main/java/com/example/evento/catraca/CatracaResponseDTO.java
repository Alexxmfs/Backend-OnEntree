package com.example.valorant.jogador;

public record CatracaResponseDTO(
    Long id, 
    int quantidade,
    Long idLocal
) {
    public CatracaResponseDTO(Catraca catraca) {
        this(
            catraca.getId(),
            catraca.getQuantidade(),
            catraca.getLocal().getId()
        );
    }
}