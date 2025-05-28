package br.com.unifacef.bdrestful.service;

import br.com.unifacef.bdrestful.model.Candidato;
import br.com.unifacef.bdrestful.repository.CandidatoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
// classe que contem as regras de negócio do BE
public class CandidatoService {
    // injeção de dependência (padrão de projeto)
    // reduzir acoplamento
    // posso usar o objeto sem instanciá-lo explicitamente
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
    public String removeCandidato(Long id){
        if (candidatoRepository.existsById(id)){
            candidatoRepository.deleteById(id);
            return "Candidato removido com sucesso";
        }
        return "Candidato nao encontrado"; // não achou
    }
    public Optional<Candidato> updateCandidato(Long id, Candidato novo){
        // verifica se o candidato existe no BD
        Optional<Candidato> candidato = candidatoRepository.findById(id);
        if (candidato.isPresent()){ // encontrou
            candidato.get().setNome(novo.getNome());
            candidato.get().setNiver(novo.getNiver());
            candidato.get().setCidade(novo.getCidade());
            candidato.get().setEndereco(novo.getEndereco());
            candidatoRepository.save(candidato.get());
            return candidato; // retorna candidato atualizado
        }
        return Optional.empty(); // não encontrou
    }
}
