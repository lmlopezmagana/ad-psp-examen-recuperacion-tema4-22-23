package com.salesianostriana.dam.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor @AllArgsConstructor
public class CreateUsuarioDto {

    private String login;
    private String email;
    private String password;
    private String password2;

}
