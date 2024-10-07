package com.example.valorant.jogador;

public record EntradaRequestDTO(
        Long id, 
        int quantidade,
        Long idLocal
) { }