package com.example.evento.controller;

import com.example.evento.catraca.Catraca;
import com.example.evento.catraca.CatracaRepository;
import com.example.evento.catraca.CatracaRequestDTO;
import com.example.evento.catraca.CatracaResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/catracas")
public class CatracaController {

    @Autowired
    private CatracaRepository catracaRepository;

    @PostMapping
    public ResponseEntity<CatracaResponseDTO> create(@RequestBody CatracaRequestDTO requestDTO) {
        Catraca catraca = new Catraca(requestDTO);
        catracaRepository.save(catraca);
        return ResponseEntity.ok(new CatracaResponseDTO(catraca));
    }

    @GetMapping("/{id}")
    public ResponseEntity<CatracaResponseDTO> getById(@PathVariable Long id) {
        return catracaRepository.findById(id)
                .map(catraca -> ResponseEntity.ok(new CatracaResponseDTO(catraca)))
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<CatracaResponseDTO>> getAll() {
        List<CatracaResponseDTO> catracas = catracaRepository.findAll().stream()
                .map(CatracaResponseDTO::new)
                .toList();
        return ResponseEntity.ok(catracas);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CatracaResponseDTO> update(@PathVariable Long id, @RequestBody CatracaRequestDTO requestDTO) {
        return catracaRepository.findById(id)
                .map(catraca -> {
                    catraca.setQuantidade(requestDTO.quantidade());
                    catracaRepository.save(catraca);
                    return ResponseEntity.ok(new CatracaResponseDTO(catraca));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> delete(@PathVariable Long id) {
        return catracaRepository.findById(id)
                .map(catraca -> {
                    catracaRepository.delete(catraca);
                    return ResponseEntity.noContent().build();
                })
                .orElse(ResponseEntity.notFound().build());
    }
}

