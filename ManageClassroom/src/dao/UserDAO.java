/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author holohoi
 */
import entity.User;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import util.HibernateUtil;

public class UserDAO {

    public static List<User> getListUser() {
        List<User> listUser = null;
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        String hql = "from User";
        Query query = session.createQuery(hql);
        listUser = query.list();
        return listUser;
    }

    public static User findOneById(String id) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        String hql = "from User where id = :id";
        Query query = session.createQuery(hql);
        query.setParameter("id", id);
        query.uniqueResult();
        boolean isNotResult = query.list().isEmpty();

        if (isNotResult) {
//            System.out.println("Not result");
            return null;
        } else {
//            System.out.println("Have result");
            User temp = (User) query.list().get(0);
            session.getTransaction().commit();

            return temp;
        }
    }

    public static void main(String[] args) {
        User temp = findOneById("18120433");
        if (temp == null) {
            System.out.println("Null");
        } else {
            System.out.println("ID: " + temp.getId());
        }
//        System.out.println("user: " + temp == null);
    }
}
