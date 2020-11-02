package br.com.dr.funcionario.service;

import br.com.dr.funcionario.dominio.Funcionario;
import br.com.dr.funcionario.repositorio.FuncionarioDAO;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioRestService {

    @Autowired
    private FuncionarioDAO funcionarioDAO;

    @GetMapping("/all")
    public List<Funcionario> findAll() {
        return this.funcionarioDAO.findAll();
    }
}
