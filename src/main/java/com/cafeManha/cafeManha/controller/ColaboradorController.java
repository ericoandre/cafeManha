package com.cafeManha.cafeManha.controller;

import java.util.List;

import com.cafeManha.cafeManha.model.Colaborador;
import com.cafeManha.cafeManha.repository.ColaboradorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ColaboradorController {

    @Autowired
	ColaboradorRepository colaboradorRepository;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/colaborador")
	public ResponseEntity<List<Colaborador>> getAllColaborador() {
        try{
            return new ResponseEntity<List<Colaborador>>(colaboradorRepository.findAll(), HttpStatus.OK);
        }catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
    @PostMapping("/colaborador")
	public ResponseEntity<Colaborador> createColaborador(@RequestBody Colaborador colaborador) {
        System.out.println(colaborador);
		try {
			Colaborador _colaborador = colaboradorRepository.save(new Colaborador(colaborador.getNome(), colaborador.getCpf(), colaborador.getAlimento() ));
			return new ResponseEntity<Colaborador>(_colaborador, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
