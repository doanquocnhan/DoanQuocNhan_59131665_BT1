/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doanquocnhan_59131665_59.cntt.pkg2;

import java.util.ArrayList;

/**
 *
 * @author Nhan
 */
public class QLDS implements IQLDS{
    
    ArrayList<CaNhan> dsCaNhan= new ArrayList<>();
            
    @Override
    public int them(CaNhan p) {
        dsCaNhan.add(p);
        return 1;
    }

    @Override
    public int xoa(String ten) {
        if (dsCaNhan.removeIf(cn -> cn.Hoten== ten)) {
      return 1;
    }
    return 0;
    }

    @Override
    public void inDS() {
        dsCaNhan.forEach(cn -> cn.HienthiTT());
    }
    
    
}
