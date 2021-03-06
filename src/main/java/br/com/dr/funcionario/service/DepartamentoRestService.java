package br.com.dr.funcionario.service;

import br.com.dr.funcionario.actor.DepartamentoActor;
import br.com.dr.funcionario.dto.DepartamentoDTO;
import br.com.dr.funcionario.dto.FuncionarioDTO;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/departamentos")
public class DepartamentoRestService {

    @Autowired
    private DepartamentoActor actor;

    @GetMapping("/todos")
    public List<DepartamentoDTO> findAll() {
        return this.actor.findAll();
    }

    @DeleteMapping("/{id}")
    public HttpStatus delete(@PathVariable("id") long id) {
        return actor.delete(id) ? HttpStatus.OK : HttpStatus.NOT_FOUND;
    }

    @PutMapping("/{nome}")
    public HttpStatus put(@RequestParam("name") String nome) {
        actor.createAndSave(nome);
        return HttpStatus.OK;
    }
}
