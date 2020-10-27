package de.test;

/**
 * Hello world!
 *
 */
public class Callee {
   public Callee() {
      System.out.println("Constructor");
   }

   public void method1() {
      innerMethod();
   }

   private void innerMethod() {
      try {
         Thread.sleep(1);
      } catch (final InterruptedException e) {
         e.printStackTrace();
      }
   }

   public void method2() {

   }
}
