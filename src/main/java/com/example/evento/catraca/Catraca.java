package com.example.valorant.jogador;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "catraca")
@Entity(name = "catraca")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Catraca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int quatidade;

    // Relacionamento com Local
    @ManyToOne
    @JoinColumn(name = "id_local", referencedColumnName = "id", nullable = false)
    private Local local;

    public Catraca(CatracaRequestDTO data) {
        this.quantidade = data.quantidade();
        }
}

