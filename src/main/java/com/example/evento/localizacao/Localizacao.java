package com.example.valorant.jogador;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "localizacao")
@Entity(name = "localizacao")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Localizacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cidade;
    private String estado;
    private String cep;
    private String complemento;
    private String endereco;

        // Relacionamento com Local
        @ManyToOne
        @JoinColumn(name = "id_local", referencedColumnName = "id", nullable = false)
        private Local local;

    public Localizacao(LocalizacaoRequestDTO data) {
        this.cidade = data.cidade();
        this.estado = data.estado();
        this.cep = data.cep();
        this.complemento = data.complemento();
        this.endereco = data.endereco();
        }
}

