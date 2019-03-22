/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PresentationLayer;

import FunctionLayer.House;
import FunctionLayer.LoginSampleException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sun.security.pkcs11.wrapper.Functions;

/**
 *
 * @author ahmed
 */
public class addProduct extends Command {

    public addProduct() {
    }

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException {
        System.out.println("_________________________-");
        int  lenght =Integer.parseInt(request.getParameter("length"));
        int width = Integer.parseInt(request.getParameter("width"));
        int height = Integer.parseInt(request.getParameter("height"));
        
        House house1 = new House(height,width,lenght);
        // make a calculator method to calculate the bricks of the house
        request.setAttribute("house", house1);
        
        return "orderPage";
    }
    
}
