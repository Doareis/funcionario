package br.com.dr.funcionario.dominio;

import java.time.LocalDate;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
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

    @OneToOne
    @JoinColumn(name = "chefe")
    private Departamento departamentoChefiado;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_cargo")
    private Cargo cargo;

    @ManyToMany
    @JoinTable(name = "funcionario_departamento",
        joinColumns = {@JoinColumn(name = "funcionario_id")},
        inverseJoinColumns = {@JoinColumn(name = "departamento_id")})
    private Set<Departamento> departamentos;
}
