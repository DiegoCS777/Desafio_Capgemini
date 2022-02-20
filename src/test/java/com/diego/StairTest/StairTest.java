package com.diego.StairTest;

import com.diego.stair.Stair;
import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class StairTest {

  private static final ByteArrayOutputStream content = new ByteArrayOutputStream();

  @BeforeAll
  public static void setUp() {
    System.setOut(new PrintStream(content));
  }

  @AfterAll
  public static void cleanUp(){
    System.setOut(null);
  }

  @Test
  @DisplayName("Testa se é impresso os caracteres na ordem correta")
  public void test() {
    Stair stair = new Stair();
    Stair.main(6);

    StringBuilder builder = new StringBuilder();
    builder.append("     *");
    builder.append(System.getProperty("line.separator"));
    builder.append("    **");
    builder.append(System.getProperty("line.separator"));
    builder.append("   ***");
    builder.append(System.getProperty("line.separator"));
    builder.append("  ****");
    builder.append(System.getProperty("line.separator"));
    builder.append(" *****");
    builder.append(System.getProperty("line.separator"));
    builder.append("******");
    builder.append(System.getProperty("line.separator"));

    Assertions.assertEquals(builder.toString(), content.toString());
  }
}

