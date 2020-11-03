package br.com.dr.funcionario.service;

import br.com.dr.funcionario.converter.FuncionarioConverter;
import br.com.dr.funcionario.dominio.Funcionario;
import br.com.dr.funcionario.dto.FuncionarioDTO;
import br.com.dr.funcionario.repositorio.FuncionarioRepository;
import java.util.List;
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
}