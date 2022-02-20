package com.diego.passwordTest;

import com.diego.password.PasswordValidation;
import org.junit.jupiter.api.*;


public class PasswordValidationTest {
  @Test
  @DisplayName("Testa se a senha usada pelo usuŕio é forte ou fraca.")
  public void Test() {
    PasswordValidation validation = new PasswordValidation();


    Assertions.assertEquals("Senha forte!", validation.isValid("Diego@37"));
    Assertions.assertEquals( "Senha fraca! Sua senha deve conter:"
            + "\nno mínimo 1 digito,"
            + "\nno mínimo 1 letra em minúsculo,"
            + "\nno mínimo 1 letra em maiúsculo,"
            + "\nno mínimo 1 caractere especial."
            + "\nOs caracteres especiais são: !@#$%^&*()-+", validation.isValid("Diegom37"));
  }
}
