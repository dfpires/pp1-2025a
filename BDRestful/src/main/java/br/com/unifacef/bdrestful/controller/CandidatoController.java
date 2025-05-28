package br.com.unifacef.bdrestful.controller;

import br.com.unifacef.bdrestful.model.Candidato;
import br.com.unifacef.bdrestful.service.CandidatoService;
import jakarta.persistence.Entity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/candidato")
public class CandidatoController {
    // injeção de dependência
    private CandidatoService candidatoService;
    // construtor
    public CandidatoController(CandidatoService candidatoService) {
        this.candidatoService = candidatoService;
    }
    @GetMapping
    public List<Candidato> getCandidatos(){
        return this.candidatoService.getCandidatos();
    }
    @PostMapping
    public Candidato addCandidato(@RequestBody Candidato candidato){
        return this.candidatoService.addCandidato(candidato);
    }
}
