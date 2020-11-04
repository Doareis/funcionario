package br.com.dr.funcionario.repositorio;

import br.com.dr.funcionario.dominio.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartamentoRepository extends JpaRepository<Departamento, Long> {

}
