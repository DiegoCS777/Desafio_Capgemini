package com.diego.password;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidation {
  private final String REGEX =
          "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{6,20}$";
  private final Pattern p = Pattern.compile(REGEX);

  public String isValid(String password){
    Matcher m = p.matcher(password);
    if(!m.matches()) {
      return
              "Senha fraca! Sua senha deve conter:"
                      + "\nno mínimo 1 digito,"
                      + "\nno mínimo 1 letra em minúsculo,"
                      + "\nno mínimo 1 letra em maiúsculo,"
                      + "\nno mínimo 1 caractere especial."
                      + "\nOs caracteres especiais são: !@#$%^&*()-+";
    }
    return "Senha forte!";
  }
}