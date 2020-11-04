package br.com.dr.funcionario.actor;

import br.com.dr.funcionario.converter.FuncionarioConverter;
import br.com.dr.funcionario.dominio.Funcionario;
import br.com.dr.funcionario.dto.FuncionarioDTO;
import br.com.dr.funcionario.repositorio.FuncionarioRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FuncionarioActor {

    @Autowired
    private FuncionarioRepository repository;

    @Autowired
    private FuncionarioConverter converter;

    public List<FuncionarioDTO> findAll() {
        return converter.convertFrom(repository.findAll());
    }

    public List<FuncionarioDTO> findByNomeContainingIgnoreCase(String nome) {
        return converter.convertFrom(repository.findByNomeContainingIgnoreCase(nome));
    }

    public List<FuncionarioDTO> findByDepartamento(String nomeDepartamento) {
        return converter.convertFrom(repository.findByNomeDepartamento(nomeDepartamento));
    }

    public boolean delete(long id) {
        Optional<Funcionario> optFuncionario = this.repository.findById(id);
        if (optFuncionario.isPresent()) {
            this.repository.deleteById(id);
            return true;
        }
        return false;
    }
}
