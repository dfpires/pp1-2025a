package br.com.unifacef.bdrestful.repository;
import br.com.unifacef.bdrestful.model.Candidato;
import org.springframework.data.jpa.repository.JpaRepository;

// uma classe interface todos os métodos são abstratos
// ou seja, não são implementados
// esta interface herda os métodos de outra interface
// a interface JpaRepository, considerando a classe Candidato
// o Long é para indicar o tipo da chave primária de Candidato
public interface CandidatoRepository extends
        JpaRepository<Candidato, Long> {
    // esta interface vai herdar os métodos de CRUD de BD
    // CRUD - Create, Retrieve, Update, Delete

}
