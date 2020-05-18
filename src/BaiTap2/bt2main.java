/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

import BaiTap2.MyStringBuilder.MyStringBuilder;

/**
 *
 * @author asus
 */
public class bt2main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        MyStringBuilder myString = new MyStringBuilder.Builder()
                .addString("Nguyễn Xuân Huy")
                .addFloat(12)
                .addBool(false)
                .build();
        System.out.println(myString.toString());
    }
    
}
