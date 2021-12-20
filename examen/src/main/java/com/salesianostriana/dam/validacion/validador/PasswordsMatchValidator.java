package com.salesianostriana.dam.validacion.validador;

import com.salesianostriana.dam.validacion.anotaciones.PasswordsMatch;
import org.springframework.beans.PropertyAccessorFactory;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordsMatchValidator implements ConstraintValidator<PasswordsMatch, Object> {

    private String passwordField;
    private String verifyPasswordField;


    // TODO Descomenta este método cuando hayas implementado la anotación @PasswordMatch

    /*
    @Override
    public void initialize(PasswordsMatch constraintAnnotation) {
        passwordField = constraintAnnotation.passwordField();
        verifyPasswordField = constraintAnnotation.verifyPasswordField();
    }
     */

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        String password = (String) PropertyAccessorFactory.forBeanPropertyAccess(value).getPropertyValue(passwordField);
        String verifyPassword = (String) PropertyAccessorFactory.forBeanPropertyAccess(value).getPropertyValue(verifyPasswordField);

        return false; // TODO Debes modificar esta línea de código por otra que compruebe la condición de validación

    }
}
