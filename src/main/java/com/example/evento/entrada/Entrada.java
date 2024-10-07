package com.example.valorant.jogador;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "entrada")
@Entity(name = "entrada")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Entrada {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int quatidade;

        // Relacionamento com Local
        @ManyToOne
        @JoinColumn(name = "id_local", referencedColumnName = "id", nullable = false)
        private Local local;

    public Entrada(EntradaRequestDTO data) {
        this.quantidade = data.quantidade();
        }
}

