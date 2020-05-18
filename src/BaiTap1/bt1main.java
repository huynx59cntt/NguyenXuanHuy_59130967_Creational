/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

import BaiTap1.HoaDon.CTHD;
import BaiTap1.HoaDon.HoaDon;
import BaiTap1.HoaDon.HoaDonHeader;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author asus
 */
public class bt1main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        
        HoaDonHeader hoaDon1 = new HoaDonHeader.Builder()
                .addMaHoaDon("HD001")
                .addTenKhachHang("Nguyễn Xuân Huy")
                .addNgayBan(sdf.parse("2020/03/02"))
                .build();
        CTHD cthd1 = new CTHD.Builder()
                .addSanPham("Laptop Alienware")
                .addDonGia(120000000)
                .addSoLuong(1)
                .addChietKhau(10)
                .build();
         CTHD cthd2 = new CTHD.Builder()
                .addSanPham("Chuột không dây Razer Basilisk")
                .addDonGia(4500000)
                .addSoLuong(2)
                .addChietKhau(7)
                .build();
        
        HoaDon HD = new HoaDon.Builder()
                .addHoaDonHeader(hoaDon1)
                .addDSCTHD(cthd1)
                .addDSCTHD(cthd2)
                .build();
        HD.hienThi();
    }
    
}
