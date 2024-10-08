package com.example.evento.localizacao;

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

    public Localizacao(LocalizacaoRequestDTO data) {
        this.cidade = data.cidade();
        this.estado = data.estado();
        this.cep = data.cep();
        this.complemento = data.complemento();
        this.endereco = data.endereco();
        }
}

