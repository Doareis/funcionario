package br.com.dr.funcionario.repositorio;

import br.com.dr.funcionario.dominio.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

}
