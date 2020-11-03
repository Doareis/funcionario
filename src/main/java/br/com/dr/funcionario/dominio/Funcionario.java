package br.com.dr.funcionario.dominio;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Cascade;

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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_cargo")
    private Cargo cargo;

    @ManyToMany
    @Cascade(value = org.hibernate.annotations.CascadeType.DELETE_ORPHAN)
    @JoinTable(name = "funcionario_departamento",
        joinColumns = {@JoinColumn(name = "funcionario_id")},
        inverseJoinColumns = {@JoinColumn(name = "departamento_id")})
    private Set<Departamento> departamentos;
}
