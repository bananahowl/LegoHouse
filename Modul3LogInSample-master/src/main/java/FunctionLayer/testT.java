/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FunctionLayer;

/**
 *
 * @author ahmed
 */
public class testT {
    
    public static void main(String[] args) {
        
        Calculator cal = new Calculator();
        cal.calcArea(2, 3,3);
        System.out.println(cal.calcArea(10, 10,3));
    }
}
