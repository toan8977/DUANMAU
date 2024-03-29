/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.duanmaujava.ViewModels.ViewModelsClass;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import com.mycompany.duanmaujava.DomainModels.GetObject;

/**
 *
 * @author acer
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ChiTietSanPhamViewModel implements GetObject {

    private String id;
    private SanPhamViewModel sanPham;
    private NhaSanXuatViewModel nhaSanXuat;
    private MauSacViewModel mauSac;
    private DongSanPhamViewModel dongSP;
    private int namBH;
    private String moTa;
    private int soLuongTon;
    private BigDecimal giaNhap;
    private BigDecimal giaBan;

    @Override
    public Object[] getObj(int i) {
        return new Object[]{
            i, sanPham.getMa(), sanPham.getTen(), namBH, moTa, soLuongTon, giaNhap + " VNĐ", giaBan + " VNĐ"
        };
    }
}
