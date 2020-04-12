/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doanquocnhan_59131665_59.cntt.pkg2;

import java.util.Scanner;

/**
 *
 * @author Nhan
 */
public class DoanQuocNhan_59131665_59CNTT2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    GiaoVien gvch = new GiaoVien("R- thong ke", "HTTTQL", "Thuan", 50, "Nha Trang", "0161324578") ;
    
    LopHoc lopHoc = new LopHoc(gvch);
    
    HocSinh hs1 = new HocSinh("59CNTT-1","ve tranh", "Doan Quoc Nhan", 21, "Van Ninh", "0584588366");
    lopHoc.themHocSinh(hs1);
    HocSinh hs2 = new HocSinh("60CNTT-1","ve tranh", "Tran Huu Buu", 20, "Van Ninh", "0584588366");
    lopHoc.themHocSinh(hs2);
    GiaoVien gv1 = new GiaoVien("Lap trinh Androi", "CNPM", "Tuan Anh", 39, "Nha Trang", "012457893");
    lopHoc.themGVGD(gv1);
    GiaoVien gv2 = new GiaoVien("Lap trinh OOP", "CNPM", "Kim Ngoan", 36, "Nha Trang", "0124578934");
    lopHoc.themGVGD(gv2);
    
    
    lopHoc.inDSHS();
    lopHoc.inDSGVGD();
    }
    
}
