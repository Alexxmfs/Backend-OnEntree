package com.example.evento.catraca;

public record CatracaResponseDTO(
    Long id,
    int quantidade
) {
    public CatracaResponseDTO(Catraca catraca) {
        this(
            catraca.getId(),
            catraca.getQuantidade()
        );
    }
}