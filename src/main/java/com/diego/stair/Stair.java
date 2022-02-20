package com.diego.stair;

public class Stair {
  public static void main(int args) {

    for(int i = 0; i < args; i++){

      for(int j = args -1; j > i; j--){
        System.out.print(" ");
      }
      for(int k = 0; k <= i; k++)
        System.out.print("*");
      System.out.println();
    }
  }
}
