package cl.natalia.gastos_iaa.servicio;

import cl.natalia.gastos_iaa.modelo.Gasto;

public interface IGastoServicio {
    public Gasto create(Gasto gasto);
    public Gasto update(Gasto gasto);
    public Gasto delete(Gasto gasto);
}
