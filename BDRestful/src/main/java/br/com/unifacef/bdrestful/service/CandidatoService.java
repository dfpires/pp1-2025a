package br.com.unifacef.bdrestful.service;

import br.com.unifacef.bdrestful.model.Candidato;
import br.com.unifacef.bdrestful.repository.CandidatoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
// classe que contem as regras de negócio do BE
public class CandidatoService {
    // injeção de dependência (padrão de projeto)
    // reduzir acoplamento
    private CandidatoRepository candidatoRepository;

    // construtor é executado automaticamente
    public CandidatoService(CandidatoRepository candidatoRepository) {
        this.candidatoRepository = candidatoRepository;
    }
    public List<Candidato> getCandidatos(){
        // objeto não precisa ser instanciado para ser usado
        return candidatoRepository.findAll();
    }
    public Candidato addCandidato(Candidato candidato){
        // objeto não precisa ser instanciado para ser usado
        return candidatoRepository.save(candidato);
    }
}
