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
public class House {
    private int height;
    private int width;
    private int length;
    private int brickSmall;
    private int brickMedium;
    private int brickbig;

    public House(int height, int width, int length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBrickSmall() {
        return brickSmall;
    }

    public void setBrickSmall(int brickSmall) {
        this.brickSmall = brickSmall;
    }

    public int getBrickMedium() {
        return brickMedium;
    }

    public void setBrickMedium(int brickMedium) {
        this.brickMedium = brickMedium;
    }

    public int getBrickbig() {
        return brickbig;
    }

    public void setBrickbig(int brickbig) {
        this.brickbig = brickbig;
    }
    
    
}
