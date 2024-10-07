package com.example.valorant.jogador;

public record LocalizacaoRequestDTO(
        Long id, 
        String cidade,
        String estado,
        String cep,
        String complemento,
        String endereco,
        Long idLocal
) { }