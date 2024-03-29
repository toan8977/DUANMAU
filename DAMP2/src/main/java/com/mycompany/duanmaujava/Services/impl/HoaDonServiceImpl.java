/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.duanmaujava.Services.impl;

import com.mycompany.duanmaujava.DomainModels.HoaDon;
import com.mycompany.duanmaujava.Repositories.HoaDonRepository;
import com.mycompany.duanmaujava.Repositories.impl.HoaDonRepositoryImpl;
import com.mycompany.duanmaujava.Services.HoaDonService;
import com.mycompany.duanmaujava.Utilities.Enums.TrangThaiHoaDon;
import com.mycompany.duanmaujava.ViewModels.ViewModelConvert.ConvertClass;
import com.mycompany.duanmaujava.ViewModels.ViewModelsClass.HoaDonViewModel;
import java.util.List;

/**
 *
 * @author acer
 */
public class HoaDonServiceImpl implements HoaDonService {

    private static final HoaDonRepository REPO = new HoaDonRepositoryImpl();

    @Override
    public List<HoaDonViewModel> getAll() {
        return REPO.getAll().stream().map(t -> ConvertClass.getHoaDonViewModel(t)).toList();
    }

    @Override
    public String save(HoaDonViewModel t) {
        REPO.save(ConvertClass.getHoaDon(t));
        return "";
    }

    @Override
    public List<HoaDonViewModel> getAllByTrangThai(TrangThaiHoaDon trangThaiHoaDon) {
        return REPO.getAllByTrangThai(trangThaiHoaDon).stream().map(t -> ConvertClass.getHoaDonViewModel(t)).toList();
    }

    @Override
    public HoaDonViewModel getOne(HoaDonViewModel t) {
        return ConvertClass.getHoaDonViewModel(REPO.getOne(ConvertClass.getHoaDon(t)));
    }
}
