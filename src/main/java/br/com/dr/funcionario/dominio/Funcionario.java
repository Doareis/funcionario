package br.com.dr.funcionario.dominio;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
}
