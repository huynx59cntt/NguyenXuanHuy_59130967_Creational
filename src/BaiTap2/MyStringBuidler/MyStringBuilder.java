/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2.MyStringBuilder;

/**
 *
 * @author asus
 */
public class MyStringBuilder {
    String str;

    public MyStringBuilder() {
    }
   
    public MyStringBuilder(Builder builder){
        this.str = builder.str;
    }

    @Override
    public String toString() {
        return "MyStringBuilder{" + "str=" + str + '}';
    }
    public static class Builder{
        String str;

        public Builder() {
        }
        public Builder addString(String s){
            this.str = s;
            return this;
        }
        public Builder addFloat(float f){
            this.str += " " + Float.toString(f);
            return  this;
        }
        public Builder addBool(boolean b){
            this.str += " " + Boolean.toString(b);
            return this;
        }
        public MyStringBuilder build(){
        return new MyStringBuilder(this);
    }
    } 
}
