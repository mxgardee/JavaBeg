/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter9;

/**
 *
 * @author 27605
 */
// An exception for queue-empty errors. 
public class QueueEmptyException extends Exception { 
 
  public String toString() { 
   return "\nQueue is empty."; 
  } 
}
