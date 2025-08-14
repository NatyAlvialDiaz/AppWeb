package cl.natalia.gastos_iaa.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Gasto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idGasto;
    private LocalDate fecha;
    private String numBoleta;
    private Integer monto;
    private Integer idRendicion;
    private Integer idTipoDocumento;
    private Integer idCategoriaGasto;
    private boolean aprobado;

    public Integer getIdGasto() {
        return idGasto;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getNum_boleta() {
        return numBoleta;
    }

    public Integer getMonto() {
        return monto;
    }

    public Integer getIdRendicion() {
        return idRendicion;
    }

    public Integer getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public Integer getIdCategoriaGasto() {
        return idCategoriaGasto;
    }

    public boolean isAprobado() {
        return aprobado;
    }
}
