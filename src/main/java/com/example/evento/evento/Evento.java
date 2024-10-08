package com.example.evento.evento;

import com.example.evento.evento.EventoRequestDTO;
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

    public Evento(EventoRequestDTO data) {
        this.nome = data.nome();
        this.data = data.data();
        this.horarioEvento = data.horarioEvento();
        this.tipo = data.tipo();
    }
}
