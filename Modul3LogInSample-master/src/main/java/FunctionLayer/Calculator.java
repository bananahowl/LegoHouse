/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FunctionLayer;

import DBAccess.House;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ahmed
 */
class Calculator { // pakke private,når  

    public void updateNumberOfBricks(House house) {
        house.setBrickbig(21);
        house.setBrickMedium(5);
        house.setBrickSmall(9);
    }

    private int calHouse(int lenght, int width, int height) {
        int BigBrick = 4;
        int MedBrick = 2;
        int SmallBrick = 1;

        return 0;
    }

    public int calcBas(int b1, int b2) {
        return b1 + b2;
    }

    private int calcPart(int part, int brick, int height) {

        int BrickAmount = 0;
        while (part != 0) {
            if (part > brick) {
                part = part - brick;
                BrickAmount++;
            }
        }
        int totalBrick = BrickAmount * height;

        return 21;
    }
    public int calcArea(int lenght, int width, int height){
    
    int totalArea;
    totalArea = (2* lenght) + 2*(width -4) * height;
    return totalArea;
    }
    
    public int calcbrick(int calcArea){
        int BrickB = 0;
        int BrickM = 0;
        int BrickS = 0;
        
        while(calcArea !=0){
            if(calcArea > 4){
        calcArea = calcArea -4;
        BrickB++;
            }
            if(calcArea > 2){
            calcArea = calcArea-2;
            BrickM++;
            }
            if(calcArea >= 1){
            calcArea = calcArea-1;
            BrickS++;
            }
        // maybe a map with tre values to return.
        }
    return 0;
    }

}
