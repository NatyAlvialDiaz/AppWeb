package cl.natalia.gastos_iaa.repositorio;

import cl.natalia.gastos_iaa.modelo.Gasto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GastoRepositorio extends JpaRepository<Gasto,Integer> {
}
