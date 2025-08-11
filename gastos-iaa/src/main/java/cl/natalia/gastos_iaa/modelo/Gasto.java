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
    private String nombre;
    private String rut;
    private Integer numRendicion;
    private LocalDate fecha;
    private Integer monto;
    private String dascripcion;

    public Integer getIdGasto() {
        return idGasto;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRut() {
        return rut;
    }

    public Integer getNumRendicion() {
        return numRendicion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public Integer getMonto() {
        return monto;
    }

    public String getDascripcion() {
        return dascripcion;
    }
}
