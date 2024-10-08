package com.example.evento.catraca;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "catracas")
@Entity(name = "catracas")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Catraca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int quantidade;

    public Catraca(CatracaRequestDTO data) {
        this.quantidade = data.quantidade();
        }
}

