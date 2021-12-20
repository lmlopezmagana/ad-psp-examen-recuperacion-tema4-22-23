package com.salesianostriana.dam.validacion.anotaciones;

import com.salesianostriana.dam.validacion.validador.PasswordsMatchValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Constraint(validatedBy = PasswordsMatchValidator.class)
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface PasswordsMatch {

    // Aquí debes incluir bastante código

}

