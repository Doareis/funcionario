package br.com.dr.funcionario.service;

import br.com.dr.funcionario.dominio.Funcionario;
import br.com.dr.funcionario.dto.FuncionarioDTO;
import br.com.dr.funcionario.repositorio.FuncionarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioRestService {

    @Autowired
    private FuncionarioActor actor;

    @GetMapping
    public List<FuncionarioDTO> findAll() {
        return this.actor.findAll();
    }

    @GetMapping("/nome")
    public List<FuncionarioDTO> findBy(String nome) {
        return this.actor.findByNomeContainingIgnoreCase(nome);
    }
}
