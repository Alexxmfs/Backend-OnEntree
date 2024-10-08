package com.example.evento.localizacao;

public record LocalizacaoResponseDTO(
    Long id, 
    String cidade,
    String estado,
    String cep,
    String complemento,
    String endereco
) {
    public LocalizacaoResponseDTO(Localizacao localizacao) {
        this(
            localizacao.getId(),
            localizacao.getCidade(),
            localizacao.getEstado(),
            localizacao.getCep(),
            localizacao.getComplemento(),
            localizacao.getEndereco()
        );
    }
}