package br.com.dr.funcionario.converter;

import br.com.dr.funcionario.dominio.Funcionario;
import br.com.dr.funcionario.dto.FuncionarioDTO;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Component;

@Component
public class FuncionarioConverter {

    public List<FuncionarioDTO> convertFrom(List<Funcionario> entidades) {
        return entidades.stream().map(entidade -> new FuncionarioDTO(
            entidade.getId(),
            entidade.getNome(),
            entidade.getAniversario(),
            entidade.getDocumento(),
            entidade.getCargo().getNome(),
            entidade.getDepartamentos().stream().map(dpto -> dpto.getNome()).collect(Collectors.toList())
        )).collect(Collectors.toList());
    }
}
