package br.com.dr.funcionario.service;

import br.com.dr.funcionario.actor.FuncionarioActor;
import br.com.dr.funcionario.dto.FuncionarioDTO;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioRestService {

    @Autowired
    private FuncionarioActor actor;

    @GetMapping("/todos")
    public List<FuncionarioDTO> findAll() {
        return this.actor.findAll();
    }

    @GetMapping
    public List<FuncionarioDTO> findByNome(@RequestParam String nome) {
        return this.actor.findByNomeContainingIgnoreCase(nome);
    }

    @GetMapping("/departamento/{nomeDepartamento}")
    public List<FuncionarioDTO> findByDepartamento(@PathVariable("nomeDepartamento") String nomeDepartamento) {
        return this.actor.findByDepartamento(nomeDepartamento);
    }

    @DeleteMapping("delete/{id}")
    public HttpStatus delete(@PathVariable("id") long id) {
        return actor.delete(id) ? HttpStatus.OK : HttpStatus.NOT_FOUND;
    }
}
