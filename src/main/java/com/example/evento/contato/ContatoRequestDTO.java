package com.example.evento.contato;

public record ContatoRequestDTO(
        Long id, 
        String email,
        String telefone
) { }