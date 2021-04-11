package com.driver;

import com.datastructure.KeyValueDS;
import java.util.Scanner;

/**
 * Class to run the application.
 *
 * User can perform various operations.
 *
 * 1. Insert
 * 2. Retrieve
 * 3. Display Current State
 */
public class DriverClass {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    KeyValueDS<Integer, String> keyValueDS = new KeyValueDS<>();
    do {
      System.out.println("1. Insert");
      System.out.println("2. Retrieve");
      System.out.println("3. Display Current State");
      System.out.println("4. Exit");
      try {
        int input = scanner.nextInt();
        if (input == 1) {
          insert(scanner, keyValueDS);
        } else if (input == 2) {
          retrieve(scanner, keyValueDS);
        } else if (input == 3) {
          displayCurrentState(keyValueDS);
        } else if (input == 4) {
          System.out.println("Bye !!");
          break;
        } else {
          System.out.println("Wrong Input !! Please try again !!");
        }
      } catch (Exception e) {
        System.out.println("Invalid Input ... System will exit ... Re-run !!");
        break;
      }
    } while (true);
  }

  private static void insert(Scanner scanner, KeyValueDS<Integer, String> keyValueDS) {
    System.out.println("Enter Key(Integer) : ");
    int key = scanner.nextInt();
    System.out.println("Enter Value(String) : ");
    String value = scanner.next();
    keyValueDS.put(key, value);
  }

  private static void retrieve(Scanner scanner, KeyValueDS<Integer, String> keyValueDS) {
    System.out.println("Enter Key : ");
    int key = scanner.nextInt();
    System.out.print("Retrieved value : ");
    System.out.println(keyValueDS.get(key));
  }

  private static void displayCurrentState(KeyValueDS<Integer, String> keyValueDS) {
    for (Integer key : keyValueDS.keySet()) {
      System.out.println("<" + key + " " + keyValueDS.get(key) + ">");
    }
  }
}
