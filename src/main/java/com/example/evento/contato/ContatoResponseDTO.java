package com.example.evento.contato;

public record ContatoResponseDTO(
    Long id, 
    String email,
    String telefone
) {
    public ContatoResponseDTO(Contato contato) {
        this(
            contato.getId(),
            contato.getEmail(),
            contato.getTelefone()
        );
    }
}