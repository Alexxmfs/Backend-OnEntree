package com.example.valorant.jogador;

public record LocalResponseDTO(
    Long id_local, 
    String nome,
    String apelido,
    String tipo,
    String cnpj
) {
    public LocalResponseDTO(Local local) {
        this(
            local.getId_local(),
            local.getNome(),
            local.getApelido(),
            local.getTipo(),
            local.getCnpj()
        );
    }
}