package br.com.dr.funcionario.dominio;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Departamento {

    @Id
    @GeneratedValue
    private long id;

    @Column
    private String nome;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_chefe")
    private Funcionario chefe;

    @ManyToMany(mappedBy = "departamentos")
    private List<Funcionario> funcionarios;
}
