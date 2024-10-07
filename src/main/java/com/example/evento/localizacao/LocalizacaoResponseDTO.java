package com.example.valorant.jogador;

public record LocalizacaoResponseDTO(
    Long id, 
    String cidade,
    String estado,
    String cep,
    String complemento,
    String endereco,
    Long idLocal
) {
    public LocalizacaoResponseDTO(Localizacao localizacao) {
        this(
            localizacao.getId(),
            localizacao.getCidade(),
            localizacao.getEstado(),
            localizacao.getCep(),
            localizacao.getComplemento(),
            localizacao.getEndereco(),
            localizacao.getIdLocal().getId()
        );
    }
}