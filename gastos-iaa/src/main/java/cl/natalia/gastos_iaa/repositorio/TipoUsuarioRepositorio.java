package cl.natalia.gastos_iaa.repositorio;


import cl.natalia.gastos_iaa.modelo.TipoUsuario;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Optional;

@EntityScan("cl.natalia.gastos_iaa.modelo")
@EnableJpaRepositories("cl.natalia.gastos_iaa.repositorio")
public interface TipoUsuarioRepositorio extends JpaRepository<TipoUsuario, Integer> {
    Optional<TipoUsuario> findByTipoUsuario(String tipoUsuario);
}