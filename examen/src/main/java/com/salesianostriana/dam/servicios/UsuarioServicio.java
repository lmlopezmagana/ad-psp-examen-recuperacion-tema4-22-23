package com.salesianostriana.dam.servicios;

import com.salesianostriana.dam.dto.CreateUsuarioDto;
import com.salesianostriana.dam.errores.excepciones.ListEntityNotFoundException;
import com.salesianostriana.dam.modelo.Usuario;
import com.salesianostriana.dam.repositorios.UsuarioRepositorio;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UsuarioServicio {

    private final UsuarioRepositorio usuarioRepositorio;

    public Usuario save(CreateUsuarioDto createUsuarioDto) {
        return usuarioRepositorio.save(Usuario.builder()
                .login(createUsuarioDto.getLogin())
                .email(createUsuarioDto.getEmail())
                .password(createUsuarioDto.getPassword())
                .createdAt(LocalDateTime.now())
                .build());
    }


    public List<Usuario> buscarPorEmail(String email){

        // TODO Aquí debes incluir el código de validación del email

        List<Usuario> result = usuarioRepositorio.findByEmailContainsIgnoreCase(email);

        if (result.isEmpty()) {
            throw new ListEntityNotFoundException(Usuario.class);
        }

        return result;

    }



}
