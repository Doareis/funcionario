package br.com.dr.funcionario.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class FuncionarioDTO implements Serializable {

    private String nome;

    private LocalDate nascimento;

    private String documento;

    private String cargos;

    private List<String> departamentos;

}
