/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3.Shape;

/**
 *
 * @author asus
 */
public abstract class Shape {
    String brush, paper, frame;
    
    public Shape() {
    }

    public Shape(String brush, String paper, String frame) {
        this.brush = brush;
        this.paper = paper;
        this.frame = frame;
    }

    public void setBrush(String brush) {
        this.brush = brush;
    }

    public void setPaper(String paper) {
        this.paper = paper;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }
    
    public abstract String Draw();
      
    @Override
    public String toString() {
        return Draw() + " Brush: " + brush + " Giấy: " + paper +" Khung: "+ frame;
    }

}
