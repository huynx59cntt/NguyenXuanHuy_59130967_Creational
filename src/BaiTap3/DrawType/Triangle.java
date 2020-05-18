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
public class Triangle  extends Shape{
    private static Triangle instance;

    protected Triangle() {}
    
    public static Triangle createInstance(){
        if(instance == null)
            instance = new Triangle();
        return instance;
    }

    @Override
    public String Draw() {
        return "\nVẽ hình tam giác "; //To change body of generated methods, choose Tools | Templates.
    }
}
