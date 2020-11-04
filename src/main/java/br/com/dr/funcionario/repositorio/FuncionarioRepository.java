package br.com.dr.funcionario.repositorio;

import br.com.dr.funcionario.dominio.Funcionario;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

    List<Funcionario> findByNomeContainingIgnoreCase(String nome);

    @Query("select funcionario from Funcionario funcionario join funcionario.departamentos depto where depto.nome = ?1")
    List<Funcionario> findByNomeDepartamento(String nomeDepartamento);
}
