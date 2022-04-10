/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author holohoi
 */
import entity.Khachhang;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import util.HibernateUtil;

public class KhachHangDAO {

    public static List<Khachhang> layDanhSachKhachHang() {
        List<Khachhang> dsKhachHang = null;
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        String hql = "from Khachhang";
        Query query = session.createQuery(hql);
        dsKhachHang = query.list();
        return dsKhachHang;
    }
}
