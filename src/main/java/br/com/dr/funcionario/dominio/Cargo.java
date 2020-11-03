package br.com.dr.funcionario.dominio;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Cargo {

    @Id
    @GeneratedValue
    private long id;

    @Column
    private String nome;

    @OneToMany(mappedBy = "cargo")
    private List<Funcionario> funcionarios;
}
