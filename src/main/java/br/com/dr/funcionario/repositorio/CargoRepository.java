package br.com.dr.funcionario.repositorio;

import br.com.dr.funcionario.dominio.Cargo;
import br.com.dr.funcionario.dominio.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CargoRepository extends JpaRepository<Cargo, Long> {

}
