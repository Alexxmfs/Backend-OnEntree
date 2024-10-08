package com.example.evento.local;

public record LocalRequestDTO(
        Long id_local, 
        String nome,
        String apelido,
        String tipo,
        String cnpj
) { }