/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.hangnt169;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author hangnt
 */
@Entity
@Table(name = "category")
public class LopHoc {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ma_lop")
    private String maLop;

    @Column(name = "ten_lop")
    private String tenLop;

    @Column(name = "so_luong_sv")
    private Integer soLuongSV;

    @Column(name = "toa")
    private String toa;

    public LopHoc() {
    }

    public LopHoc(Long id, String maLop, String tenLop, Integer soLuongSV, String toa) {
        this.id = id;
        this.maLop = maLop;
        this.tenLop = tenLop;
        this.soLuongSV = soLuongSV;
        this.toa = toa;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public Integer getSoLuongSV() {
        return soLuongSV;
    }

    public void setSoLuongSV(Integer soLuongSV) {
        this.soLuongSV = soLuongSV;
    }

    public String getToa() {
        return toa;
    }

    public void setToa(String toa) {
        this.toa = toa;
    }

    @Override
    public String toString() {
        return "LopHoc{" + "id=" + id + ", maLop=" + maLop + ", tenLop=" + tenLop + ", soLuongSV=" + soLuongSV + ", toa=" + toa + '}';
    }

}
