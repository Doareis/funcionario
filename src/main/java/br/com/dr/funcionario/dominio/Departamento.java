package br.com.dr.funcionario.dominio;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import lombok.Data;

@Entity
@Data
public class Departamento {

    @Id
    @GeneratedValue
    private long id;

    @Column
    private String nome;

    @ManyToMany(mappedBy = "departamentos")
    private List<Funcionario> funcionarios;
}
