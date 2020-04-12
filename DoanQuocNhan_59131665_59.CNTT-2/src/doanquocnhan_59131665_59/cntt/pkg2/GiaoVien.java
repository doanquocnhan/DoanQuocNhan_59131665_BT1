/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doanquocnhan_59131665_59.cntt.pkg2;

/**
 *
 * @author Nhan
 */
public class GiaoVien extends CaNhan{
    String monDay;
    String toBoMon;

    public GiaoVien() {
    }
    
    public GiaoVien(String monDay, String toBoMon, String Hoten, int Tuoi, String DiaCHi, String Sdt) {
        super(Hoten, Tuoi, DiaCHi, Sdt);
        this.monDay = monDay;
        this.toBoMon = toBoMon;
    }

    public GiaoVien(String monDay, String toBoMon) {
        this.monDay = monDay;
        this.toBoMon = toBoMon;
    }

    @Override
    public String HienthiTT() {
       return "Họ tên giaovien: "+Hoten+
                ";Tuổi: "+Tuoi+
                ";Địa chỉ: "+DiaCHi+
                ";Số điện thoại: "+Sdt+
                ";Mon day: "+monDay+
                "To bo mon: "+toBoMon;
    }
    
}
