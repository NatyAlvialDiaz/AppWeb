package cl.natalia.gastos_iaa.repositorio;

import cl.natalia.gastos_iaa.modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepositorio extends JpaRepository<Usuario,Integer> {
}
