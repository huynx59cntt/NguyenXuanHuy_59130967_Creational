/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1.HoaDon;

/**
 *
 * @author asus
 */
public class CTHD {
    String sanPham;
    int soLuong, chietKhau;
    double donGia;

    public CTHD() {
    }

    public CTHD(Builder builder) {
        this.sanPham = builder.sanPham;
        this.soLuong = builder.soLuong;
        this.chietKhau = builder.chietKhau;
        this.donGia = donGia;
    }
    public void hienThi(){
        System.out.println("\n Sản Phẩm: " + sanPham
                +"\n Số Lượng: " + soLuong
                +"\n Đơn Giá: " + donGia
                +"\n Chiết Khấu: " + chietKhau);
    }
            
    public static class Builder{
        String sanPham;
        int soLuong, chietKhau;
        double donGia;
        public Builder addSanPham(String sanPham){
            this.sanPham = sanPham;
            return this;
        }
        public Builder addSoLuong(int soLuong){
            this.soLuong = soLuong;
            return this;
        }
        public Builder addChietKhau(int chietKhau){
            this.chietKhau = chietKhau;
            return this;
        }
        public Builder addDonGia(double donGia){
            this.donGia = donGia;
            return this;
        }
        public CTHD build(){
            return new CTHD(this);
        }
    }
}
