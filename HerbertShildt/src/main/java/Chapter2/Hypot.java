/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter2;

/**
 *
 * @author 27605
 */
/*    
   Use the Pythagorean theorem to find 
   find the length of the hypotenuse 
   given the lengths of the two opposing 
   sides. 
*/    
class Hypot {    
  public static void main(String args[]) {    
    double x, y, z; 
 
    x = 3; 
    y = 4; 
 
    z = Math.sqrt(x*x + y*y); 
 
    System.out.println("Hypotenuse is " +z); 
  }    
}