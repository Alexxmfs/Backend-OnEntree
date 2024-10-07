package com.example.valorant.jogador;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatracaRepository extends JpaRepository<Catraca, Long> {
}
