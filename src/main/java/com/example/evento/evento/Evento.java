package com.example.valorant.jogador;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Table(name = "evento")
@Entity(name = "evento")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Evento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private LocalDate data;
    private LocalTime horarioEvento;
    private String tipo;

    // Relacionamento com Local
    @ManyToOne
    @JoinColumn(name = "id_local", referencedColumnName = "id", nullable = false)
    private Local local;

    public Evento(EventoRequestDTO data, Local local) {
        this.nome = data.nome();
        this.data = data.data();
        this.horarioEvento = data.horarioEvento();
        this.tipo = data.tipo();
        this.local = local;
    }
}
