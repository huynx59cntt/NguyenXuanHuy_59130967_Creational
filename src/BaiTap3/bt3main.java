/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

import BaiTap3.DrawType.Circle;
import BaiTap3.Shape.Shape;
import BaiTap3.Shape.ShapeType;
import BaiTap3.ShapeFactory.ShapeFactory;

/**
 *
 * @author asus
 */
public class bt3main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        ShapeFactory shapeFactory = new ShapeFactory();
        //VẼ HÌNH CHỮ NHẬT
        Shape rectangle = shapeFactory.createShape(ShapeType.rectangle);
        rectangle.setBrush("Cọ");
        rectangle.setPaper("A3");
        rectangle.setFrame("Gỗ");
        System.out.println(rectangle.toString());
        
        Shape rectangle1 = shapeFactory.createShape(ShapeType.rectangle);
        rectangle1.setBrush("Bùng nổ");
        rectangle1.setPaper("A2");
        rectangle1.setFrame("Nhỏ");
        System.out.println(rectangle1.toString());
        System.out.println(rectangle.toString()); // kiểm tra rectangle có giống rectangle1
        
        System.out.println("\n--------------------------------");
        //VẼ HÌNH TRÒN
        Shape circle = shapeFactory.createShape(ShapeType.circle);
        circle.setBrush("Lông vũ");
        circle.setPaper("A3");
        circle.setFrame("Lớn");
        System.out.println(circle.toString());
        
        Shape circle1 = shapeFactory.createShape(ShapeType.circle);
        circle1.setBrush("Mặt trăng");
        circle1.setPaper("A2");
        circle1.setFrame("Trung");
        System.out.println(circle1.toString());
        System.out.println(circle.toString()); // kiểm tra circle có giống circle1
        System.out.println("\n--------------------------------");
        
        //Vẽ hình tam giác
        Shape triangle = shapeFactory.createShape(ShapeType.triangle);
        triangle.setBrush("Hoa văn");
        triangle.setPaper("A1");
        triangle.setFrame("Trung");
        System.out.println(triangle.toString());
         
        Shape triangle1 = shapeFactory.createShape(ShapeType.triangle);
        triangle1.setBrush("Vải");
        triangle1.setPaper("A2");
        triangle1.setFrame("Nhỏ");
        System.out.println(triangle1.toString());
        System.out.println(triangle.toString()); //kiểm tra triangle có giống triangle1
        
    }
    
}
