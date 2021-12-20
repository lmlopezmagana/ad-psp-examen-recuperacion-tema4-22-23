package com.salesianostriana.dam.validacion.anotaciones;

import com.salesianostriana.dam.validacion.validador.PasswordsMatchValidator;
import com.salesianostriana.dam.validacion.validador.UniqueLoginValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Constraint(validatedBy = UniqueLoginValidator.class)
@Target({}) // Aquí debes completar código
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface UniqueLogin {

    Class <?> [] groups() default {};
    Class <? extends Payload> [] payload() default {};



}

