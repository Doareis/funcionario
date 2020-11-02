package br.com.dr.funcionario.dominio;

import java.time.LocalDate;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Funcionario {

    @Id
    private long id;

    @Column
    private String nome;

    @Column
    private int idade;

    @Column
    private LocalDate aniversario;

    @Column
    private String documento;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_cargo")
    private Cargo cargo;

    @ManyToMany
    @JoinTable(name = "funcionario_departamento",
        joinColumns = {@JoinColumn(name = "funcionario_id")},
        inverseJoinColumns = {@JoinColumn(name = "departamento_id")})
    private List<Departamento> departamentos;
}
