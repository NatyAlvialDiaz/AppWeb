package cl.natalia.gastos_iaa.controller;

import cl.natalia.gastos_iaa.modelo.Gasto;
import cl.natalia.gastos_iaa.servicio.GastoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/gastos")
@CrossOrigin(value="http://localhost:4200")
public class GastoController {

    @Autowired
    private GastoServicio gastoServicio;
    @PostMapping("/agregargasto")
    public ResponseEntity<Gasto> agregarGasto (@RequestBody Gasto gasto){
        Gasto gastoGuardado = gastoServicio.create(gasto);

        return ResponseEntity.status(HttpStatus.CREATED).body(gastoGuardado);
    }
    @GetMapping("/todosgastos")
    public ResponseEntity<List<Gasto>> obtenerTodosGastos(){
        List<Gasto> listaGasto = gastoServicio.findAll();
        return ResponseEntity.ok(listaGasto);
    }
}

