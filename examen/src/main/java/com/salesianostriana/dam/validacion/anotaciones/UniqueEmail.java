package com.salesianostriana.dam.validacion.anotaciones;

import com.salesianostriana.dam.validacion.validador.UniqueEmailValidator;
import com.salesianostriana.dam.validacion.validador.UniqueLoginValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = UniqueEmailValidator.class)
@Target({}) // Aquí debes completar código
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface UniqueEmail {

    Class <?> [] groups() default {};
    Class <? extends Payload> [] payload() default {};



}

