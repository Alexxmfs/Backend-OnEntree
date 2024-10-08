package com.example.evento.entrada;

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

    private int quantidade;

    public Entrada(EntradaRequestDTO data) {
        this.quantidade = data.quantidade();
        }
}

