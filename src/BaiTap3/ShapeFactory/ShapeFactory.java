/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3.ShapeFactory;

import BaiTap3.DrawType.Circle;
import BaiTap3.DrawType.Rectangle;
import BaiTap3.DrawType.Triangle;
import BaiTap3.Shape.Shape;
import BaiTap3.Shape.ShapeType;

/**
 *
 * @author asus
 */
public class ShapeFactory {
    
    public Shape createShape(ShapeType type){
       Shape shape;
       switch (type){
           case rectangle: return shape = Rectangle.createInstance();
           case circle: return shape = Circle.createInstance();
           case triangle: return shape = Triangle.createInstance();
       }
       return null;
    }
  
}
