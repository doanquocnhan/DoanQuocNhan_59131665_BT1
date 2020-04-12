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
public class LopHoc {
    GiaoVien giaoVIenCN = new GiaoVien();
    QLDS qldsGVGD = new QLDS();
    QLDS qldsHS = new QLDS();

    public LopHoc(GiaoVien gvChuNhiem) {
    this.giaoVIenCN = gvChuNhiem;
  }

  public int themHocSinh(HocSinh hs) {
    if (qldsHS.them(hs) == 1) {
      return 1;
    }
    return 0;
  }
 
  public int themGVGD(GiaoVien gv) {
    if (qldsGVGD.them(gv) == 1) {
      return 1;
    }
    return 0;
  }
  
  public int inDSHS() {
    qldsHS.inDS();
    return 1;
  }
  
  public int inDSGVGD() {
    qldsGVGD.inDS();
    return 1;
  }
}


