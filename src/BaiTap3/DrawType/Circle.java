/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3.DrawType;

import BaiTap3.Shape.Shape;

/**
 *
 * @author asus
 */
public class Circle extends Shape{

   
    private static Circle instance;

    protected Circle() {}
    
    public static Circle createInstance(){
        if(instance == null)
            instance = new Circle();
        return instance;
    }
    
    @Override
    public String Draw() {
       return "\nVẽ hình tròn"; //To change body of generated methods, choose Tools | Templates.
    }
    
}
