/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1.HoaDon;

import java.util.ArrayList;

/**
 *
 * @author asus
 */
public class HoaDon {
    HoaDonHeader hoaDon;
    ArrayList<CTHD> dsCTHD = new ArrayList();

    public HoaDon() {
    }

    public HoaDon(Builder builder) {
        this.hoaDon = builder.hoaDon;
        this.dsCTHD = builder.dsCTHD;
    }
    
    public void hienThi(){
        hoaDon.hienThi();
        for(int i = 0; i < dsCTHD.size(); i++)
            dsCTHD.get(i).hienThi();           
    }
   
    
    public static class Builder{
        HoaDonHeader hoaDon;
        ArrayList<CTHD> dsCTHD = new ArrayList();

        public Builder() {
        }
        
        public Builder addHoaDonHeader(HoaDonHeader hoaDon){
            this.hoaDon = hoaDon;
            return this;
        }
        public Builder addDSCTHD(CTHD cthd){
            this.dsCTHD.add(cthd);
            return this;
        }
        public HoaDon build(){
            return new HoaDon(this);
        }
    }
}
