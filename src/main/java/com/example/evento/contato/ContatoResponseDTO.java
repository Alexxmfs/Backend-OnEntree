package com.example.valorant.jogador;

public record ContatoResponseDTO(
    Long id, 
    String email,
    String telefone,
    Long idLocal
) {
    public ContatoResponseDTO(Contato contato) {
        this(
            contato.getId(),
            contato.getEmail(),
            contato.getTelefone(),
            contato.getIdLocal().getId()
        );
    }
}