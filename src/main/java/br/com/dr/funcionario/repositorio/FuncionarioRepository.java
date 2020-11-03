package br.com.dr.funcionario.repositorio;

import br.com.dr.funcionario.dominio.Funcionario;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

    List<Funcionario> findByNomeContainingIgnoreCase(String nome);
}
