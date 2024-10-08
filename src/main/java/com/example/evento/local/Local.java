package com.example.evento.local;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "local")
@Entity(name = "local")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Local {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String apelido;
    private String tipo;
    private String cnpj;

    public Local(LocalRequestDTO data) {
        this.nome = data.nome();
        this.apelido = data.apelido();
        this.tipo = data.tipo();
        this.cnpj = data.cnpj();
    }
}
