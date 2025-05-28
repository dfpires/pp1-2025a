package br.com.unifacef.bdrestful.controller;

import br.com.unifacef.bdrestful.model.Candidato;
import br.com.unifacef.bdrestful.service.CandidatoService;
import jakarta.persistence.Entity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
    @DeleteMapping("/{id}")
    public String removeCandidato(@PathVariable Long id){
        return this.candidatoService.removeCandidato(id);
    }
    @PutMapping("/{id}")
    public Optional<Candidato> updateCandidato(@PathVariable Long id,
                      @RequestBody Candidato novo){
        return this.candidatoService.updateCandidato(id, novo);
    }
}
