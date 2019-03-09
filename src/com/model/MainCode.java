/*
 * 
 */
package com.model;

 

import java.util.HashSet;

import java.util.Set;

import java.util.concurrent.CopyOnWriteArraySet;

 
//@Sandeep

public class MainCode {

       private static Set numbers = new HashSet();

       /** The objts. */
       private static CopyOnWriteArraySet<Object> objts = new CopyOnWriteArraySet<>();

 

       public static void main(String[] args) {

 

              Object obj = new Object[] { 10, new Object[] { 2, 3 }, 4, 5, new Object[] { 6, 7, 8 },

                           new Object[] { 9, 10, new Object[] { 12,new Object[]{100}, 13 }, 15, 15 }};

              check(obj);

              System.out.println(numbers);

       }

 

       private static void check(Object obj) {

              Object []ii = (Object[]) obj;

              boolean flag = false;

              for (int i = 0; i < ii.length; i++) {

                     boolean t = ii[i] instanceof Number;

                     if (!t) {

                           flag = true;

                     }

 

              }

 

              if (flag) {

                     for (int j = 0; j < ii.length; j++) {

                           if (ii[j] instanceof Number) {

                                  numbers.add(ii[j]);

                           } else {

                                  check(ii[j]);

 

                           }

                     }

 

             

 

              }

 

       }

}