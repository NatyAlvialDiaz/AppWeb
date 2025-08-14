package cl.natalia.gastos_iaa.controller;

import cl.natalia.gastos_iaa.modelo.TipoUsuario;
import cl.natalia.gastos_iaa.repositorio.UsuarioRepositorio;
import cl.natalia.gastos_iaa.servicio.UsuarioServicio;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin("http://localhost:4200")
public class UsuarioController {
    private final UsuarioServicio servicio;
    private final UsuarioRepositorio usuarios;

    public UsuarioController(UsuarioServicio servicio, UsuarioRepositorio usuarios) {
        this.servicio = servicio; this.usuarios = usuarios;
    }

    // Listar usuarios con sus roles (simple DTO)
    @GetMapping
    public java.util.List<java.util.Map<String,Object>> listar() {
        return usuarios.findAll().stream().map(u -> {
            Map<String, Object> map = new HashMap<>();
            map.put("id", u.getIdUsuario());
            map.put("nombreUsuario", u.getNombreUsuario());
            map.put("roles", u.getRoles()
                    .stream()
                    .map(TipoUsuario::getTipoUsuario)
                    .toList()); // si usas Java 8-15: Collectors.toList()
            return map;
        }).toList();
    }

    // Ver roles de 1 usuario
    @GetMapping("/{id}/roles")
    public java.util.Set<String> roles(@PathVariable Integer id) {
        return servicio.rolesDe(id);
    }

    // Asignar rol: POST /usuarios/1/roles/ADMINISTRADOR
    @PostMapping("/{id}/roles/{rol}")
    public void asignar(@PathVariable Integer id, @PathVariable String rol) {
        servicio.asignarRol(id, rol);
    }

    // Quitar rol: DELETE /usuarios/1/roles/VALIDADOR
    @DeleteMapping("/{id}/roles/{rol}")
    public void quitar(@PathVariable Integer id, @PathVariable String rol) {
        servicio.quitarRol(id, rol);
    }
}
