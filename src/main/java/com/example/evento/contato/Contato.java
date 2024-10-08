package com.example.evento.contato;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "contato")
@Entity(name = "contato")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Contato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;
    private String telefone;

    public Contato(ContatoRequestDTO data) {
        this.email = data.email();
        this.telefone = data.telefone();
        }
}

