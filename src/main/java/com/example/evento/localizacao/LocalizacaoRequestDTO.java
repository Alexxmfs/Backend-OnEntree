package com.example.evento.localizacao;

public record LocalizacaoRequestDTO(
        Long id, 
        String cidade,
        String estado,
        String cep,
        String complemento,
        String endereco
) { }