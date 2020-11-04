package br.com.dr.funcionario.actor;

import br.com.dr.funcionario.dominio.Cargo;
import br.com.dr.funcionario.dominio.Departamento;
import br.com.dr.funcionario.dto.CargoDTO;
import br.com.dr.funcionario.dto.DepartamentoDTO;
import br.com.dr.funcionario.repositorio.CargoRepository;
import br.com.dr.funcionario.repositorio.DepartamentoRepository;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CargoActor {

    @Autowired
    private CargoRepository repository;

    public List<CargoDTO> findAll() {
        return repository.findAll().stream().map(cargo -> {
            CargoDTO dto = new CargoDTO();
            dto.setNome(cargo.getNome());
            return dto;
        }).collect(Collectors.toList());
    }
    
    public void createAndSave(String nome) {
        Cargo cargo = new Cargo();
        cargo.setNome(nome);
        
        repository.save(cargo);
    }

    public boolean delete(long id) {
        Optional<Cargo> optionalCargo = this.repository.findById(id);
        if (optionalCargo.isPresent()) {
            this.repository.deleteById(id);
            return true;
        }
        return false;
    }
}
