package cl.natalia.gastos_iaa.servicio;

import cl.natalia.gastos_iaa.modelo.Gasto;
import cl.natalia.gastos_iaa.repositorio.GastoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GastoServicio  implements IGastoServicio{
    @Autowired
    GastoRepositorio gastoRepositorio;

    @Override
    public Gasto create(Gasto gasto) {
        return gastoRepositorio.save(gasto);
    }

    @Override
    public Gasto update(Gasto gasto) {
        return gastoRepositorio.save(gasto);
    }

    @Override
    public Gasto delete(Gasto gasto) {
        return null;
        //gastoRepositorio.deleteById(gasto.getIdGasto());
    }

    @Override
    public List<Gasto> findAll() {
        return gastoRepositorio.findAll();
    }

}
