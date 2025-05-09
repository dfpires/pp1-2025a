package br.com.unifacef.apirestful.controller;
import br.com.unifacef.apirestful.model.Candidato;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController // controladora e requisição rest
@RequestMapping("/candidato") // mapeamento da requisição
public class CandidatoController {
    // criar um vetor de candidatos - simula um banco de dados
    List<Candidato> candidatos = new ArrayList<>();

    @GetMapping
    public List<Candidato> getCandidatos() {
        return this.candidatos;
    }
    @PostMapping
    public Candidato addCandidato(@RequestBody Candidato candidato) {
        // recebe os dados do frontend e adiciona no vetor
        this.candidatos.add(candidato);
        return candidato;
    }
    @DeleteMapping("/{id}")
    // id será passado no caminho da rota
    public void deleteCandidato(@PathVariable Long id) {

    }
}
