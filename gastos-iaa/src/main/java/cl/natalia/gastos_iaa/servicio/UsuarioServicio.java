package cl.natalia.gastos_iaa.servicio;

import cl.natalia.gastos_iaa.modelo.TipoUsuario;
import cl.natalia.gastos_iaa.repositorio.TipoUsuarioRepositorio;
import cl.natalia.gastos_iaa.repositorio.UsuarioRepositorio;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServicio {
    private final UsuarioRepositorio usuarios;
    private final TipoUsuarioRepositorio tipos;

    public UsuarioServicio(UsuarioRepositorio u, TipoUsuarioRepositorio t) {
        this.usuarios = u; this.tipos = t;
    }

    @Transactional
    public void asignarRol(Integer idUsuario, String nombreRol) {
        var u = usuarios.findById(idUsuario).orElseThrow();
        var r = tipos.findByTipoUsuario(nombreRol).orElseThrow();
        u.getRoles().add(r);
        usuarios.save(u);
    }

    @Transactional
    public void quitarRol(Integer idUsuario, String nombreRol) {
        var u = usuarios.findById(idUsuario).orElseThrow();
        var r = tipos.findByTipoUsuario(nombreRol).orElseThrow();
        u.getRoles().remove(r);
        usuarios.save(u);
    }

    public java.util.Set<String> rolesDe(Integer idUsuario) {
        return usuarios.findById(idUsuario)
                .orElseThrow()
                .getRoles().stream().map(TipoUsuario::getTipoUsuario).collect(java.util.stream.Collectors.toSet());
    }
}
