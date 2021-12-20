package com.salesianostriana.dam.controladores;


import com.salesianostriana.dam.dto.CreateUsuarioDto;
import com.salesianostriana.dam.dto.GetUsuarioDto;
import com.salesianostriana.dam.modelo.Usuario;
import com.salesianostriana.dam.servicios.UsuarioServicio;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@RequestMapping("/usuario")
public class UsuarioControlador {

    private final UsuarioServicio servicio;

    @PostMapping("/")
    public ResponseEntity<Usuario> nuevoUsuario(@Valid @RequestBody CreateUsuarioDto newUser){
        return ResponseEntity.status(HttpStatus.CREATED).body(servicio.save(newUser));
    }


    @GetMapping("/")
    public List<GetUsuarioDto> buscar(@Valid @RequestParam String email) {
        return servicio.buscarPorEmail(email).stream()
                .map(GetUsuarioDto::UsuarioToGetUsuarioDto)
                .collect(Collectors.toList());
    }






}
