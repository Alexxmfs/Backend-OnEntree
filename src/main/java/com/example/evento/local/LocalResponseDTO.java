package com.example.evento.local;

public record LocalResponseDTO(
    Long id_local, 
    String nome,
    String apelido,
    String tipo,
    String cnpj
) {
    public LocalResponseDTO(Local local) {
        this(
            local.getId(),
            local.getNome(),
            local.getApelido(),
            local.getTipo(),
            local.getCnpj()
        );
    }
}