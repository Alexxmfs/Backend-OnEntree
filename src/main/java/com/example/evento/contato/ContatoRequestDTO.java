package com.example.valorant.jogador;

public record ContatoRequestDTO(
        Long id, 
        String email,
        String telefone,
        Long idLocal
) { }