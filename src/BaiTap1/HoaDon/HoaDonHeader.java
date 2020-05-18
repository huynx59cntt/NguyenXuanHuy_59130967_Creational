/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1.HoaDon;

import java.util.Date;

/**
 *
 * @author asus
 */
public class HoaDonHeader {
    String maHoaDon, tenKhachHang;
    Date ngayBan;

    public HoaDonHeader() {
    }

    public HoaDonHeader(Builder builder) {
        this.maHoaDon = builder.maHoaDon;
        this.tenKhachHang = builder.tenKhachHang;
        this.ngayBan = builder.ngayBan;
    }
    public void hienThi(){
        System.out.println("\n Mã hóa đơn: " + maHoaDon
                    +"\n Tên Khách Hàng: " + tenKhachHang
                    +"\n Ngày Bán: " + ngayBan);
    }
    public static class Builder{
        String maHoaDon, tenKhachHang;
        Date ngayBan; 

        public Builder() {
        }
        
        public Builder addMaHoaDon(String maHoaDon){
            this.maHoaDon = maHoaDon;
            return this;
        }
        public Builder addTenKhachHang(String tenKhachHang){
            this.tenKhachHang = tenKhachHang;
            return this;       
        }
        public Builder addNgayBan(Date ngayBan){
            this.ngayBan = ngayBan;
            return this;
        }
        public HoaDonHeader build(){
            return new HoaDonHeader(this);
        }
    }
}
