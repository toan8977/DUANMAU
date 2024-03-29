/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.duanmaujava.Services.impl;

import com.mycompany.duanmaujava.DomainModels.CuaHang;
import com.mycompany.duanmaujava.Repositories.CuaHangRepository;
import com.mycompany.duanmaujava.Repositories.impl.CuaHangRepositorIpml;
import com.mycompany.duanmaujava.Services.CuaHangService;
import com.mycompany.duanmaujava.ViewModels.ViewModelConvert.ConvertClass;
import com.mycompany.duanmaujava.ViewModels.ViewModelsClass.CuaHangViewModel;
import java.util.List;

/**
 *
 * @author acer
 */
public class CuaHangServiceImpl implements CuaHangService {

    private static final CuaHangRepository CUA_HANG_REPOSITORY = new CuaHangRepositorIpml();

    @Override
    public List<CuaHangViewModel> getList() {
        return CUA_HANG_REPOSITORY.getList().stream().map(t
                -> ConvertClass.getCuaHangViewModel(t)).toList();
    }

    @Override
    public CuaHangViewModel getOneById(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String save(CuaHangViewModel cuaHangViewModel) {
        if (!CUA_HANG_REPOSITORY.checkSave(cuaHangViewModel.getMa())) {
            return "Mã đã tồn tại";
        }
        return CUA_HANG_REPOSITORY.save(ConvertClass.getCuaHang(cuaHangViewModel)) ? "" : "Thêm thất bại";
    }

    @Override
    public String update(CuaHangViewModel cuaHangViewModel) {
        if (!CUA_HANG_REPOSITORY.checkSave(cuaHangViewModel.getMa())) {
            return "Mã đã tồn tại";
        }
        return CUA_HANG_REPOSITORY.update(ConvertClass.getCuaHang(cuaHangViewModel)) ? "" : "Cập nhật thất bại";
    }

    @Override
    public String delete(CuaHangViewModel cuaHangViewModel) {
        if (!CUA_HANG_REPOSITORY.checkDelete(cuaHangViewModel.getId())) {
            return "Không được xóa vì đã có trong thông tin nhân viên";
        }
        return CUA_HANG_REPOSITORY.delete(ConvertClass.getCuaHang(cuaHangViewModel)) ? "" : "Xóa thất bại";
    }

}
