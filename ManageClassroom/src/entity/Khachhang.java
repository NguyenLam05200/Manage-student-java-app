/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author holohoi
 */
public class Khachhang implements java.io.Serializable {

    private String maKhachHang;
    private String matKhau;
    private String hoVaTen;
    private String email;
    private String dienThoai;

    //Các phương thức khởi tạo, get, set.
    public Khachhang() {
        this.maKhachHang = "";
        this.matKhau = "";
        this.hoVaTen = "";
        this.email = "";
        this.dienThoai = "";
    }

    public Khachhang(String maKhachHang, String matKhau, String hoVaTen, String email, String dienThoai) {
        this.maKhachHang = maKhachHang;
        this.matKhau = matKhau;
        this.hoVaTen = hoVaTen;
        this.email = email;
        this.dienThoai = dienThoai;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDienThoai() {
        return dienThoai;
    }

    public void setDienThoai(String dienThoai) {
        this.dienThoai = dienThoai;
    }
}
