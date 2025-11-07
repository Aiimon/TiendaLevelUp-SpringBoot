package com.example.TiendaLevelUp.Controller;

import com.example.TiendaLevelUp.Entity.Usuario;
import com.example.TiendaLevelUp.Service.UsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Stivi
 */

@RestController
public class UsuarioController {
    
    @Autowired
    private UsuarioService service;
    
    @PostMapping("/addUsuario")
    public Usuario addUsuario(@RequestBody Usuario u){
        return service.saveUsuario(u);
    }
    
    @PostMapping("/addUsuario")
    public List<Usuario> addUsuarios(@RequestBody List<Usuario> usuarios){
        return service.saveUsuarios(usuarios);
    }
    
    @GetMapping("/Usuarios")
    public List<Usuario> findAllUsuarios(){
        return service.getUsuarios();
    }
    
    @GetMapping("/employeeById/{empId}")
    public Usuario findEmployeeById(@PathVariable int usuarioId){
        return service.getUsuarioById(usuarioId);
    }
    
    @GetMapping("/employeeByName/{firstName}")
    public Usuario findByFirstName(@PathVariable String firstName){
        return service.getUsuarioByPrimerNom(firstName);
    }
    
    @DeleteMapping("/delete/{usuarioId}")
    public String deleteUsuario(@PathVariable int empId){
        return service.deleteUsuario(empId);
    }
    
    @PutMapping("/update")
    public Usuario updateUsuario(@RequestBody Usuario u){
        return service.updateUsuario(u);
    }
}
    
   
