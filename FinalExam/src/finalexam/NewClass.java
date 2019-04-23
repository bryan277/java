/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalexam;

/**
 *
 * @author hansvos
 */
public abstract class C
     {
          private void foo1()
          {
               System.out.println( “Hello foo1” );
          }
          public abstract void foo2();
          public abstract int foo3();
          public void foo1Call()
          {
               foo1();
          }
     }
     public class D extends C
     {
          public void foo2()
          {
               System.out.println( “Hello foo2” );
          }
          public int foo3()
          {
               return 10;
          }
          private void foo4()
          {
               System.out.println( “Hello D foo4()” );
          }
     }
