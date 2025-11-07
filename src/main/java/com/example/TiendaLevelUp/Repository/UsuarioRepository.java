package com.example.TiendaLevelUp.Repository;

import com.example.TiendaLevelUp.Entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Stivi
 */

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
    
    public Usuario findByPrimerNom(String name);
    
}



