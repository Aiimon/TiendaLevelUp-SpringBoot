package cl.tiendalevelup.Service;

import cl.tiendalevelup.Entity.Usuario;
import cl.tiendalevelup.Repository.UsuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Stivi
 */

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    // Crear un usuario
    public Usuario saveUsuario(Usuario u) {
        return repository.save(u);
    }

    // Crear varios usuarios
    public List<Usuario> saveUsuarios(List<Usuario> usuarios) {
        return repository.saveAll(usuarios);
    }

    // Obtener todos
    public List<Usuario> getUsuarios() {
        return repository.findAll();
    }

    // Obtener por ID
    public Usuario getUsuarioById(int usuarioId) {
        return repository.findById(usuarioId).orElse(null);
    }

    // Obtener por nombre
    public Usuario getUsuarioByPrimerNom(String nombre) {
        return repository.findByPrimerNom(nombre);
    }

    // Eliminar usuario
    public String deleteUsuario(int id) {
        repository.deleteById(id);
        return "Usuario Eliminado " + id;
    }

    // Actualizar usuario
    public Usuario updateUsuario(Usuario u) {

        return repository.findById(u.getUsuarioId()).map(existingUsuario -> {
            existingUsuario.setPrimerNom(u.getPrimerNom());
            existingUsuario.setApellido(u.getApellido());
            existingUsuario.setEmail(u.getEmail());
            return repository.save(existingUsuario);
        }).orElse(null);
    }

}
