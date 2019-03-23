/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PresentationLayer;

import DBAccess.House;
import FunctionLayer.LogicFacade;
import FunctionLayer.LoginSampleException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sun.security.pkcs11.wrapper.Functions;

/**
 *
 * @author ahmed
 */
public class AddProduct extends Command {

    public AddProduct() {
    }

    @Override
    String execute(HttpServletRequest request, LogicFacade logic) throws LoginSampleException {
        System.out.println("_________________________-");
        int  lenght =Integer.parseInt(request.getParameter("length"));
        int width = Integer.parseInt(request.getParameter("width"));
        int height = Integer.parseInt(request.getParameter("height"));
        
        House house1 = new House(height,width,lenght);
        logic.updateNumberOfBricks(house1);
        // make a calculator method to calculate the bricks of the house
        request.setAttribute("house", house1);
        
        
        return "orderPage";
    }
    
}
