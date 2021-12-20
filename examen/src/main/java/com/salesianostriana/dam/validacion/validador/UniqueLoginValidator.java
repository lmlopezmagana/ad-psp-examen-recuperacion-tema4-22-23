package com.salesianostriana.dam.validacion.validador;

import com.salesianostriana.dam.repositorios.UsuarioRepositorio;
import com.salesianostriana.dam.validacion.anotaciones.UniqueLogin;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UniqueLoginValidator implements ConstraintValidator<UniqueLogin, String> {

    @Autowired
    private UsuarioRepositorio repositorio;


    @Override
    public void initialize(UniqueLogin constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String login, ConstraintValidatorContext context) {
        return false; // TODO Aquí debes completar código
    }
}
