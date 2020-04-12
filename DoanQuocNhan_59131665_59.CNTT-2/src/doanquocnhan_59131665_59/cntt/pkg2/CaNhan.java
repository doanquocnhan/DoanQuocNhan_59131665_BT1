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
public abstract class CaNhan {
    String Hoten;
    int Tuoi;
    String DiaCHi;
    String Sdt;

    public CaNhan(String Hoten, int Tuoi, String DiaCHi, String Sdt) {
        this.Hoten = Hoten;
        this.Tuoi = Tuoi;
        this.DiaCHi = DiaCHi;
        this.Sdt = Sdt;
    }

    public CaNhan() {
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    public int getTuoi() {
        return Tuoi;
    }

    public void setTuoi(int Tuoi) {
        this.Tuoi = Tuoi;
    }

    public String getDiaCHi() {
        return DiaCHi;
    }

    public void setDiaCHi(String DiaCHi) {
        this.DiaCHi = DiaCHi;
    }

    public String getSdt() {
        return Sdt;
    }

    public void setSdt(String Sdt) {
        this.Sdt = Sdt;
    }
    
    public abstract String HienthiTT();
    
}
