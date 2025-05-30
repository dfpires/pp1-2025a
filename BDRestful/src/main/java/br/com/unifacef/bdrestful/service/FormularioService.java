package br.com.unifacef.bdrestful.service;

import br.com.unifacef.bdrestful.model.Formulario;
import br.com.unifacef.bdrestful.repository.FormularioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FormularioService {
    //injeção de dependência
    private FormularioRepository formularioRepository;
    public FormularioService(FormularioRepository formularioRepository) {
        this.formularioRepository = formularioRepository;
    }
    // consulta formulários
    public List<Formulario> getFormularios(){
        return formularioRepository.findAll();
    }
    // adiciona formulário
    public Formulario addFormulario(Formulario formulario){
        return formularioRepository.save(formulario);
    }
}
