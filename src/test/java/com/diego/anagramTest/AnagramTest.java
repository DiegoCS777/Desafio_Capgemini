package com.diego.anagramTest;

import com.diego.anagram.Anagram;
import org.junit.jupiter.api.*;


public class AnagramTest {
  @Test
  @DisplayName("Testa se encontra pares de substrings nas palavras.")
  public void Test() {
    Anagram counter = new Anagram();


    Assertions.assertEquals(2, counter.StrCount("ovo"));
    Assertions.assertEquals(3, counter.StrCount("ifailuhkqq"));
  }
}
