package com.example.TiendaLevelUp.Service;

import com.example.TiendaLevelUp.Entity.Usuario;
import com.example.TiendaLevelUp.Repository.UsuarioRepository;
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
    
    //CRUD:
    public Usuario saveUsuario(Usuario u){
        return repository.save(u);
    }
    
    public List<Usuario> saveUsuarios(List<Usuario> usuarios){
        return repository.saveAll(usuarios);
    }
    
    public List<Usuario> getUsuarios(){
        return repository.findAll();
    }
    
    public Usuario getUsuarioById(int usuarioId){
        return repository.findById(usuarioId).orElse(null);
    }
    
    public Usuario getUsuarioByPrimerNom(String nombre){
        return repository.findByPrimerNom(nombre);
    }
    
    public String deleteUsuario(int id){
        repository.deleteById(id);
        return "Usuario Eliminado " + id;
    }
    
    public Usuario updateUsuario(Usuario u){
        Usuario existingUsuario = repository.findById(u.getUsuarioId() ).orElse(null);
        existingUsuario.setPrimerNom( u.getPrimerNom() );
        existingUsuario.setApellido( u.getApellido() );
        existingUsuario.setEmail( u.getEmail() );
        return repository.save(existingUsuario);
    }
    
}
