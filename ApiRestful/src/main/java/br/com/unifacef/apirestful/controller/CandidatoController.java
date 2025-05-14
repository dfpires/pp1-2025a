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
    public String deleteCandidato(@PathVariable Long id) {
        // removeIf percorre o vetor procurando candidato com id igual ao Insomnia
        boolean achou =
          (this.candidatos.removeIf(candidato -> candidato.getId() == id));
        return achou ? "Removido com sucesso" : "Candidato não encontrado";
    }
    @PutMapping("/{id}")
    public Candidato updateCandidato(@RequestBody Candidato novo,
                                     @PathVariable Long id) {
        // percorre o vetor
        for (Candidato obj: this.candidatos) {
            if (obj.getId() == id) {
                obj.setNome(novo.getNome());
                obj.setCidade(novo.getCidade());
                obj.setEndereco(novo.getEndereco());
                obj.setNiver(novo.getNiver());
                return obj;
            }
        }
        return null; // não encontrou candidato
    }
}
