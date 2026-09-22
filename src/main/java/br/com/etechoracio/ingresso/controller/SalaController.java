package br.com.etechoracio.ingresso.controller;


import br.com.etechoracio.ingresso.dto.SalaResponseDTO;
import br.com.etechoracio.ingresso.service.SalaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/salas")

public class SalaController {

    @Autowired
    private SalaService service;

    @GetMapping
    public ResponseEntity<List<SalaResponseDTO>> listarSalas()
    {
        var salas = service.listarSalas();
        return ResponseEntity.ok(salas);
    }

    @GetMapping("/{id}")
    public ResponseEntity<SalaResponseDTO> buscarSalaPorId(@PathVariable Long id)
    {
        var sala = service.buscarSalaPorId(id);
        if (sala == null)
        {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(sala);
    }

}
