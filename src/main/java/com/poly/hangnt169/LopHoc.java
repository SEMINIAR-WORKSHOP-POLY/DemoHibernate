package com.poly.hangnt169;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * @author hangnt169
 */
@Entity
@Table(name = "lop_hoc")
public class LopHoc {
    /**
     * Java 3 : JDBC : Truy Van DB
     * Java 4: Hibernate
     * Java 5 > : JPA  => Spring Boot
     * Hibernate : Truy Van thuc the (Entity) : HQL (Hibernate Query Language)
     * ORM (Object Relationship Mapping)
     * varchar, nvarchar => String
     * bigint => Long
     * Quan he : 1-1, 1-n, ...
     * LopHoc => Table : Cac cot (column):
     * + Khoa chinh
     * + Khoa ngoai
     * + Column
     */
    // Xd cot nay la khoa chinh
    @Id
    @Column(name = "id")
    // Tu tang
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
        return "LopHoc{" +
                "id=" + id +
                ", maLop='" + maLop + '\'' +
                ", tenLop='" + tenLop + '\'' +
                ", soLuongSV=" + soLuongSV +
                ", toa='" + toa + '\'' +
                '}';
    }
}
