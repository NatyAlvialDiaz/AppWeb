package cl.natalia.gastos_iaa.controller;

import cl.natalia.gastos_iaa.modelo.Gasto;
import cl.natalia.gastos_iaa.servicio.GastoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gastos")
public class GastoController {

    @Autowired
    private GastoServicio gastoServicio;
    @PostMapping("/agregargasto")
    public ResponseEntity<Gasto> agregarGasto (@RequestBody Gasto gasto){
        Gasto gastoGuardado = gastoServicio.create(gasto);

        return ResponseEntity.status(HttpStatus.CREATED).body(gastoGuardado);
    }
}

