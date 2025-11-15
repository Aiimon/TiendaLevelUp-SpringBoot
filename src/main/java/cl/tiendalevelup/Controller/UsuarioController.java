package cl.tiendalevelup.Controller;

import cl.tiendalevelup.Entity.Usuario;
import cl.tiendalevelup.Service.UsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService service;

    // Crear un usuario
    @PostMapping("/crear")
    public Usuario crearUsuario(@RequestBody Usuario u) {
        return service.saveUsuario(u);
    }

    // Crear varios usuarios
    @PostMapping("/crear/lista")
    public List<Usuario> crearUsuarios(@RequestBody List<Usuario> usuarios) {
        return service.saveUsuarios(usuarios);
    }

    // Obtener todos los usuarios
    @GetMapping("/todos")
    public List<Usuario> obtenerTodos() {
        return service.getUsuarios();
    }

    // Buscar usuario por ID
    @GetMapping("/buscar/id/{usuarioId}")
    public Usuario buscarPorId(@PathVariable int usuarioId) {
        return service.getUsuarioById(usuarioId);
    }

    // Buscar usuario por nombre
    @GetMapping("/buscar/nombre/{primerNom}")
    public Usuario buscarPorNombre(@PathVariable String primerNom) {
        return service.getUsuarioByPrimerNom(primerNom);
    }

    // Eliminar usuario
    @DeleteMapping("/eliminar/{usuarioId}")
    public String eliminarUsuario(@PathVariable int usuarioId) {
        return service.deleteUsuario(usuarioId);
    }

    // Actualizar usuario
    @PutMapping("/actualizar")
    public Usuario actualizarUsuario(@RequestBody Usuario u) {
        return service.updateUsuario(u);
    }
}
