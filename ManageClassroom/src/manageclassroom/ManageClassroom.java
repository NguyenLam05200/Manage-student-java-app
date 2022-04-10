/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manageclassroom;

import dao.UserDAO;
import entity.User;
import java.util.List;

/**
 *
 * @author holohoi
 */
public class ManageClassroom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello world haha");
//        List<Khachhang> dsKhachHang = KhachHangDAO.layDanhSachKhachHang();
//        for (int i = 0; i < dsKhachHang.size(); i++) {
//            System.out.println("Họ tên: " + dsKhachHang.get(i).getHoVaTen()
//                    + " - Email: " + dsKhachHang.get(i).getEmail()
//                    + " – Số điện thoại: " + dsKhachHang.get(i).getDienThoai());
//        }

        List<User> listUser = UserDAO.getListUser();
        for (int i = 0; i < listUser.size(); i++) {
            System.out.println("Họ tên: " + listUser.get(i).getName()
                    + " - Email: " + listUser.get(i).getEmail()
                    + " – Password: " + listUser.get(i).getPassword());
        }

    }

}
