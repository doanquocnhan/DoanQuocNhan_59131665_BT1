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
public class HocSinh extends CaNhan{
    String lop;
    String nangkhhieu;

    public HocSinh(String lop, String nangkhhieu, String Hoten, int Tuoi, String DiaCHi, String Sdt) {
        super(Hoten, Tuoi, DiaCHi, Sdt);
        this.lop = lop;
        this.nangkhhieu = nangkhhieu;
    }

    public HocSinh(String lop, String nangkhhieu) {
        this.lop = lop;
        this.nangkhhieu = nangkhhieu;
    }

    public HocSinh(){
        super();
        this.lop = "";
        this.nangkhhieu = "";
    }


   
    @Override
    public String HienthiTT() {
      return "Họ tên học sinh: "+Hoten+
                ";Tuổi: "+Tuoi+
                ";Địa chỉ: "+DiaCHi+
                ";Số điện thoại: "+Sdt+
                ";Lớp: "+lop+
                ";Năng khiếu: "+nangkhhieu;
    }
    
}
