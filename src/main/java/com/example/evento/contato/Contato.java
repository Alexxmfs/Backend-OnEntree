package com.example.valorant.jogador;

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

        // Relacionamento com Local
        @ManyToOne
        @JoinColumn(name = "id_local", referencedColumnName = "id", nullable = false)
        private Local local;

    public Contato(ContatoRequestDTO data) {
        this.email = data.email();
        this.telefone = data.telefone();
        }
}

