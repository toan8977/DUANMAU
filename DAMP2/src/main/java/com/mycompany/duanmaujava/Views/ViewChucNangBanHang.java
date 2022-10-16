/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.duanmaujava.Views;

import com.mycompany.duanmaujava.DomainModels.HoaDon;
import com.mycompany.duanmaujava.DomainModels.NhanVien;
import com.mycompany.duanmaujava.ViewModels.ViewModelsClass.ChiTietSanPhamViewModel;
import com.mycompany.duanmaujava.ViewModels.ViewModelsClass.SanPhamDaChonViewModel;
import com.mycompany.duanmaujava.Services.ChiTietHoaDonService;
import com.mycompany.duanmaujava.Services.ChiTietSanPhamService;
import com.mycompany.duanmaujava.Services.HoaDonService;
import com.mycompany.duanmaujava.Services.NhanVienService;
import com.mycompany.duanmaujava.Services.impl.HoaDonServiceImpl;
import com.mycompany.duanmaujava.Services.impl.NhanVienServiceImpl;
import com.mycompany.duanmaujava.Services.impl.ChiTietSanPhamServiceImpl;
import com.mycompany.duanmaujava.Services.impl.HoaDonChiTietServiceImpl;
import com.mycompany.duanmaujava.Utilities.Enums.TrangThaiHoaDon;
import com.mycompany.duanmaujava.Utilities.MaTuSinh;
import com.mycompany.duanmaujava.ViewModels.ViewModelsClass.HoaDonViewModel;
import com.mycompany.duanmaujava.ViewModels.ViewModelsClass.NhanVienViewModel;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author acer
 */
public class ViewChucNangBanHang extends javax.swing.JFrame {

    /**
     * Creates new form ViewChucNangBanHang
     */
    private static final ChiTietSanPhamService SAN_PHAM_SERVICE = new ChiTietSanPhamServiceImpl();
    private static final ChiTietHoaDonService CHI_TIET_HOA_DON_SERVICE = new HoaDonChiTietServiceImpl();
    private static final HoaDonService HOA_DON_SERVICE = new HoaDonServiceImpl();
    private static final NhanVienService NHAN_VIEN_SERVICE = new NhanVienServiceImpl();
    private static final ChiTietSanPhamService CHI_TIET_SAN_PHAM_SERVICE = new ChiTietSanPhamServiceImpl();
    private static List<HoaDonViewModel> listHD = new ArrayList<>();
    private static List<ChiTietSanPhamViewModel> listSP = new ArrayList<>();
    private static LinkedHashMap<String, SanPhamDaChonViewModel> listGH = new LinkedHashMap<>();
    private DefaultTableModel modelSP;
    private DefaultTableModel modelGioHang;
    private DefaultTableModel modelHoaDon;
    private HoaDonViewModel hoaDon;
    private int checkRowSP, checkRowHD;

    public ViewChucNangBanHang() {
        initComponents();
        modelSP = (DefaultTableModel) tblSanPham.getModel();
        modelGioHang = (DefaultTableModel) tblGioHang.getModel();
        modelHoaDon = (DefaultTableModel) tblHoaDon.getModel();
        listSP = fillTableSanPham(CHI_TIET_SAN_PHAM_SERVICE.getAll());
        listHD = fillTableHoaDon();
        rdTatCa.setSelected(true);
        tblGioHang.removeColumn((TableColumn) tblGioHang.getColumnModel().getColumn(6));
        checkRowSP = -1;
        checkRowHD = -1;
        resetFormHoaDon();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        rdChoTT = new javax.swing.JRadioButton();
        rdTatCa = new javax.swing.JRadioButton();
        rdDaTT = new javax.swing.JRadioButton();
        rdHuy = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHoaDon = new javax.swing.JTable();
        jpHoaDon = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtMaHD = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTenNV = new javax.swing.JTextField();
        txtTienKhachDua = new javax.swing.JTextField();
        txtTongTien = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTienThua = new javax.swing.JTextField();
        btnThanhToan = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtNgayTao = new javax.swing.JTextField();
        jlErrors = new javax.swing.JLabel();
        jlThanhToanError = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblGioHang = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSanPham = new javax.swing.JTable();
        txtTenSPSreach = new javax.swing.JTextField();
        jlDataEmpty = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Tạo Hóa Đơn");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdChoTT);
        rdChoTT.setText("Chờ thanh toán");
        rdChoTT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdChoTTMouseClicked(evt);
            }
        });

        buttonGroup1.add(rdTatCa);
        rdTatCa.setText("Tất cả");
        rdTatCa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdTatCaMouseClicked(evt);
            }
        });

        buttonGroup1.add(rdDaTT);
        rdDaTT.setText("Đã thanh toán");
        rdDaTT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdDaTTMouseClicked(evt);
            }
        });

        buttonGroup1.add(rdHuy);
        rdHuy.setText("Đã hủy");
        rdHuy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdHuyMouseClicked(evt);
            }
        });

        tblHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã HĐ", "Ngày Tạo", "Tên NV", "Tình Trạng"
            }
        ));
        tblHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHoaDonMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblHoaDon);

        jpHoaDon.setBorder(javax.swing.BorderFactory.createTitledBorder("Hóa đơn"));

        jLabel1.setText("MÃ HD");

        txtMaHD.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLabel2.setText("Tên NV");

        jLabel3.setText("Ngày Tạo");

        jLabel4.setText("Tổng Tiền");

        jLabel5.setText("Tiền Khách Đưa");

        txtTenNV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        txtTienKhachDua.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtTienKhachDuaCaretUpdate(evt);
            }
        });

        txtTongTien.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        txtTienThua.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        btnThanhToan.setText("THANH TOÁN");
        btnThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThanhToanActionPerformed(evt);
            }
        });

        jLabel7.setText("Tiền thừa");

        txtNgayTao.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jlThanhToanError.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlThanhToanError.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jpHoaDonLayout = new javax.swing.GroupLayout(jpHoaDon);
        jpHoaDon.setLayout(jpHoaDonLayout);
        jpHoaDonLayout.setHorizontalGroup(
            jpHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpHoaDonLayout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(btnThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpHoaDonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpHoaDonLayout.createSequentialGroup()
                        .addGroup(jpHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpHoaDonLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jpHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpHoaDonLayout.createSequentialGroup()
                                            .addGroup(jpHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE))
                                            .addGap(18, 18, 18))
                                        .addGroup(jpHoaDonLayout.createSequentialGroup()
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(15, 15, 15)))
                                    .addGroup(jpHoaDonLayout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(15, 15, 15))))
                            .addGroup(jpHoaDonLayout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jpHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtTienThua, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                            .addComponent(txtMaHD, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTenNV, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTongTien, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTienKhachDua, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNgayTao, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addComponent(jlThanhToanError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlErrors, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );
        jpHoaDonLayout.setVerticalGroup(
            jpHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpHoaDonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMaHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jpHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNgayTao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jpHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTienKhachDua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtTienThua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlErrors, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(jlThanhToanError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnThanhToan)
                .addContainerGap(112, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Giỏ Hàng"));

        tblGioHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã SP", "Tên SP", "Số Lượng", "Đơn Giá", "Thành Tiền", "id"
            }
        ));
        tblGioHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblGioHangMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblGioHang);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Sản Phẩm"));

        tblSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã SP", "Tên SP", "Năm BH", "Mô tả", "SL SP", "Giá Nhập", "Giá Bán"
            }
        ));
        tblSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSanPhamMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblSanPham);

        txtTenSPSreach.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtTenSPSreachCaretUpdate(evt);
            }
        });

        jlDataEmpty.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlDataEmpty.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(txtTenSPSreach, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jlDataEmpty, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTenSPSreach, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(jlDataEmpty, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addComponent(rdChoTT, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdTatCa, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdDaTT, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(119, 119, 119))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)))
                .addComponent(jpHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jpHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(280, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdChoTT)
                            .addComponent(rdDaTT)
                            .addComponent(rdHuy)
                            .addComponent(rdTatCa))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        NhanVienViewModel nhanVien = NHAN_VIEN_SERVICE.getOneByMa("NV01");
        HoaDonViewModel hoaDonViewModel = HoaDonViewModel.builder().ma(MaTuSinh.genMaTuSinh("HD")).
                ngayTao(new Date()).diaChi("HN").nhanVien(nhanVien).tinhTrang(TrangThaiHoaDon.CHO_THANH_TOAN).build();
        HOA_DON_SERVICE.save(hoaDonViewModel);
        fillFormHoaDon(hoaDon);
        fillHoaDon();
        listGH.clear();
        fillTableSanPhamDaChon();
        enableFormHoaDon();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThanhToanActionPerformed
        // TODO add your handling code here:
        String maHoaDon = txtMaHD.getText();
        CHI_TIET_HOA_DON_SERVICE.saveAll(maHoaDon, listGH);
        listSP = fillTableSanPham(CHI_TIET_SAN_PHAM_SERVICE.getAll());
        listHD = fillTableHoaDon();
        JOptionPane.showMessageDialog(rootPane, "Thanh toán thành công");
        listGH.clear();
        fillTableSanPhamDaChon();
        resetFormHoaDon();
    }//GEN-LAST:event_btnThanhToanActionPerformed

    private void rdChoTTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdChoTTMouseClicked
        // TODO add your handling code here:
        fillTableHoaDonByTT(TrangThaiHoaDon.CHO_THANH_TOAN);
    }//GEN-LAST:event_rdChoTTMouseClicked

    private void rdTatCaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdTatCaMouseClicked
        // TODO add your handling code here:
        fillTableHoaDon();
    }//GEN-LAST:event_rdTatCaMouseClicked

    private void rdHuyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdHuyMouseClicked
        // TODO add your handling code here:
        fillTableHoaDonByTT(TrangThaiHoaDon.DA_HUY);
    }//GEN-LAST:event_rdHuyMouseClicked

    private void rdDaTTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdDaTTMouseClicked
        // TODO add your handling code here:
        fillTableHoaDonByTT(TrangThaiHoaDon.DA_THANH_TOAN);
    }//GEN-LAST:event_rdDaTTMouseClicked

    private void tblSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSanPhamMouseClicked
        // TODO add your handling code here:
        if (hoaDon == null) {
            tblSanPham.clearSelection();
            JOptionPane.showMessageDialog(rootPane, "Chưa có hóa đơn");
            return;
        }
        if (hoaDon.getTinhTrang() == TrangThaiHoaDon.DA_THANH_TOAN) {
            tblSanPham.clearSelection();
            JOptionPane.showMessageDialog(rootPane, "Hóa đơn đã được thanh toán");
            return;
        }
        checkRowSP = tblSanPham.getSelectedRow();
        ChiTietSanPhamViewModel chiTietSanPham = listSP.get(checkRowSP);
        String soLuongNhap = JOptionPane.showInputDialog(rootPane, "Vui lòng nhập số lượng:");
        String valid = CHI_TIET_SAN_PHAM_SERVICE.validateSoLuong(soLuongNhap, chiTietSanPham.getSoLuong());
        if (!valid.equals("")) {
            tblSanPham.clearSelection();
            JOptionPane.showMessageDialog(rootPane, valid);
            return;
        }
        listGH = CHI_TIET_SAN_PHAM_SERVICE.addSanPhamVaoGioHang(listGH, chiTietSanPham, Integer.parseInt(soLuongNhap));
        fillTableSanPhamDaChon();
        txtTongTien.setText(CHI_TIET_SAN_PHAM_SERVICE.getTongTien(listGH) + "");
    }//GEN-LAST:event_tblSanPhamMouseClicked

    private void tblHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHoaDonMouseClicked
        // TODO add your handling code here:
        checkRowHD = tblHoaDon.getSelectedRow();
        HoaDonViewModel reponse = listHD.get(checkRowHD);
        hoaDon = listHD.get(checkRowHD);
        if (hoaDon.getTinhTrang() == TrangThaiHoaDon.CHO_THANH_TOAN) {
            txtTongTien.setText("");
            listGH.clear();
        } else if (hoaDon.getTinhTrang() == TrangThaiHoaDon.DA_THANH_TOAN) {
            listGH = CHI_TIET_HOA_DON_SERVICE.getSanPhamDaChonByMaHD(hoaDon.getId());
            txtTongTien.setText(CHI_TIET_SAN_PHAM_SERVICE.getTongTien(listGH) + "");
        }
        fillTableSanPhamDaChon();
        fillFormHoaDon(hoaDon);
    }//GEN-LAST:event_tblHoaDonMouseClicked

    private void txtTenSPSreachCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtTenSPSreachCaretUpdate
        // TODO add your handling code here:
        jlDataEmpty.setText("");
        if (!txtTenSPSreach.getText().isEmpty()) {
            fillTableSanPham(CHI_TIET_SAN_PHAM_SERVICE.getListByTenSP(txtTenSPSreach.getText(), listSP));
            if (tblSanPham.getRowCount() == 0) {
                jlDataEmpty.setText("Không có dữ liệu");
            }
        } else {
            fillTableSanPham(listSP);
        }
    }//GEN-LAST:event_txtTenSPSreachCaretUpdate

    private void txtTienKhachDuaCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtTienKhachDuaCaretUpdate
        // TODO add your handling code here:
        String textTienKhachDua = txtTienKhachDua.getText().trim();
        System.out.println(textTienKhachDua.length());
        String textTongTien = txtTongTien.getText().trim();
        jlThanhToanError.setText("");
        if ("".equals(textTienKhachDua)) {
            btnThanhToan.setEnabled(false);
            txtTienThua.setText("");
            return;
        }
        String check = CHI_TIET_HOA_DON_SERVICE.getTienThua(textTienKhachDua, textTongTien);
        if (!check.equals("")) {
            jlThanhToanError.setText(check);
            btnThanhToan.setEnabled(false);
            txtTienThua.setText("");
            return;
        }
        btnThanhToan.setEnabled(true);
        BigDecimal tienKhachDua = new BigDecimal(textTienKhachDua);
        BigDecimal tongTien = new BigDecimal(textTongTien);
        txtTienThua.setText(tienKhachDua.subtract(tongTien) + "");
    }//GEN-LAST:event_txtTienKhachDuaCaretUpdate

    private void tblGioHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblGioHangMouseClicked
        // TODO add your handling code here:
        if (hoaDon.getTinhTrang() == TrangThaiHoaDon.DA_THANH_TOAN) {
            JOptionPane.showMessageDialog(rootPane, "Hóa đơn đã được thanh toán");
            tblGioHang.clearSelection();
            return;
        }
        String id = modelGioHang.getValueAt(tblGioHang.getSelectedRow(), 6).toString();
        int soLuong = Integer.parseInt(modelGioHang.getValueAt(tblGioHang.getSelectedRow(), 3).toString());
        int result = JOptionPane.showConfirmDialog(this,
                "Bạn có chắc muốn xóa sản phẩm dã chọn ?",
                "Xác nhận",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        if (result == JOptionPane.YES_OPTION) {
            listGH.remove(id);
            fillTableSanPhamDaChon();
            txtTongTien.setText(CHI_TIET_SAN_PHAM_SERVICE.getTongTien(listGH) + "");
        } else {
            return;
        }
    }//GEN-LAST:event_tblGioHangMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewChucNangBanHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewChucNangBanHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewChucNangBanHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewChucNangBanHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewChucNangBanHang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThanhToan;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel jlDataEmpty;
    private javax.swing.JLabel jlErrors;
    private javax.swing.JLabel jlThanhToanError;
    private javax.swing.JPanel jpHoaDon;
    private javax.swing.JRadioButton rdChoTT;
    private javax.swing.JRadioButton rdDaTT;
    private javax.swing.JRadioButton rdHuy;
    private javax.swing.JRadioButton rdTatCa;
    private javax.swing.JTable tblGioHang;
    private javax.swing.JTable tblHoaDon;
    private javax.swing.JTable tblSanPham;
    private javax.swing.JTextField txtMaHD;
    private javax.swing.JTextField txtNgayTao;
    private javax.swing.JTextField txtTenNV;
    private javax.swing.JTextField txtTenSPSreach;
    private javax.swing.JTextField txtTienKhachDua;
    private javax.swing.JTextField txtTienThua;
    private javax.swing.JTextField txtTongTien;
    // End of variables declaration//GEN-END:variables

    private List<ChiTietSanPhamViewModel> fillTableSanPham(List<ChiTietSanPhamViewModel> list) {
        modelSP.setRowCount(0);
        list.forEach((t) -> {
            modelSP.addRow(t.getObj(modelSP.getRowCount() + 1));
        });
        return list;
    }

    private void fillTableSanPhamDaChon() {
        modelGioHang.setRowCount(0);
        listGH.forEach((t, u) -> {
            modelGioHang.addRow(u.getObj(modelGioHang.getRowCount() + 1));
        });
    }

    private List<HoaDonViewModel> fillTableHoaDon() {
        modelHoaDon.setRowCount(0);
        List<HoaDonViewModel> list = HOA_DON_SERVICE.getAll();
        getTableHD(list);
        return list;
    }

    private List<HoaDonViewModel> fillTableHoaDonByTT(TrangThaiHoaDon trangThaiHoaDon) {
        modelHoaDon.setRowCount(0);
        List<HoaDonViewModel> list = HOA_DON_SERVICE.getAllByTrangThai(trangThaiHoaDon);
        getTableHD(list);
        return list;
    }

    private void getTableHD(List<HoaDonViewModel> list) {
        list.forEach((t) -> {
            modelHoaDon.addRow(t.getObj(modelHoaDon.getRowCount() + 1));
        });
    }

    public void fillHoaDon() {
        if (rdTatCa.isSelected()) {
            listHD = fillTableHoaDon();
        }
        if (rdDaTT.isSelected()) {
            listHD = fillTableHoaDonByTT(TrangThaiHoaDon.DA_THANH_TOAN);
        }
        if (rdHuy.isSelected()) {
            listHD = fillTableHoaDonByTT(TrangThaiHoaDon.DA_HUY);
        }
        if (rdChoTT.isSelected()) {
            fillTableHoaDonByTT(TrangThaiHoaDon.CHO_THANH_TOAN);
        }
    }

    public void fillFormHoaDon(HoaDonViewModel hoaDon) {
        disableFormHoaDon();
        if (hoaDon.getTinhTrang() == TrangThaiHoaDon.CHO_THANH_TOAN) {
            enableFormHoaDon();
        }
        txtMaHD.setText(hoaDon.getMa());
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        txtNgayTao.setText(dateFormat.format(hoaDon.getNgayTao()));
        txtTenNV.setText(hoaDon.getNhanVien().getHo() + " " + hoaDon.getNhanVien().getTenDem() + " " + hoaDon.getNhanVien().getTen());
    }

    public void resetFormHoaDon() {
        txtNgayTao.setText("");
        txtTenNV.setText("");
        txtMaHD.setText("");
        txtTienKhachDua.setText("");
        txtTongTien.setText("");
        txtTienThua.setText("");
        hoaDon = null;
        disableFormHoaDon();

    }

    public void enableFormHoaDon() {
        txtTienKhachDua.setEnabled(true);

    }

    public void disableFormHoaDon() {
        txtTongTien.setEnabled(false);
        txtNgayTao.setEnabled(false);
        txtTenNV.setEnabled(false);
        txtMaHD.setEnabled(false);
        txtTienThua.setEnabled(false);
        txtTienKhachDua.setEnabled(false);
        btnThanhToan.setEnabled(false);

    }
}
