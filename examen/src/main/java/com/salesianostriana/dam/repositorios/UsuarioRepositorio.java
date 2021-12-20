package com.salesianostriana.dam.repositorios;

import com.salesianostriana.dam.modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {

    List<Usuario> findByEmailContainsIgnoreCase(String email);

    // TODO Aquí debes declarar una consulta que permita saber si ya existe un usuario con un determinado valor de login

    // TODO Aquí debes declarar una consulta que permita saber si ya existe un usuario con un determinado valor de email


}
