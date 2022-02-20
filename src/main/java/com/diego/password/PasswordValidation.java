package com.diego.password;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidation {
  public String main(String args) {

    String regex = "^(?=.*[0-9])"
            + "(?=.*[a-z])(?=.*[A-Z])"
            + "(?=.*[@#$%^&+=])"
            + "(?=\\S+$).{6,20}$";
    Pattern p = Pattern.compile(regex);

    Matcher m  = p.matcher(args);

    if(!m.matches()) {
      System.out.println(
              "Senha fraca! Sua senha deve conter:"
                      + "\nno mínimo 1 digito,"
                      + "\nno mínimo 1 letra em minúsculo,"
                      + "\nno mínimo 1 letra em maiúsculo,"
                      + "\nno mínimo 1 caractere especial."
                      + "\nOs caracteres especiais são: !@#$%^&*()-+"
      );
    }
    return "Senha forte!";
  }
}