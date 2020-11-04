package br.com.dr.funcionario.actor;

import br.com.dr.funcionario.dominio.Departamento;
import br.com.dr.funcionario.dominio.Funcionario;
import br.com.dr.funcionario.dto.DepartamentoDTO;
import br.com.dr.funcionario.repositorio.DepartamentoRepository;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DepartamentoActor {

    @Autowired
    private DepartamentoRepository repository;

    public List<DepartamentoDTO> findAll() {
        return repository.findAll().stream().map(dpto -> {
            DepartamentoDTO dto = new DepartamentoDTO();
            dto.setNome(dpto.getNome());
            return dto;
        }).collect(Collectors.toList());
    }
    
    public void createAndSave(String nome) {
        Departamento departamento = new Departamento();
        departamento.setNome(nome);
        
        repository.save(departamento);
    }

    public boolean delete(long id) {
        Optional<Departamento> optionalDepartamento = this.repository.findById(id);
        if (optionalDepartamento.isPresent()) {
            this.repository.deleteById(id);
            return true;
        }
        return false;
    }
}
