package com.salesianostriana.dam.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.salesianostriana.dam.modelo.Usuario;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data @NoArgsConstructor @AllArgsConstructor
@Builder
public class GetUsuarioDto {

    private Long id;
    private String login, email;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm:ss")
    private LocalDateTime createdAt;


    public static GetUsuarioDto UsuarioToGetUsuarioDto(Usuario u) {

        return GetUsuarioDto.builder()
                .login(u.getLogin())
                .email(u.getEmail())
                .createdAt(u.getCreatedAt())
                .id(u.getId())
                .build();


    }


}
