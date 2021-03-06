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
import java.security.NoSuchAlgorithmException;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import util.HibernateUtil;
import util.handlePassword;

public class UserDAO {

    public static List<User> getListUser() {
        List<User> listUser = null;
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        String hql = "from User";
        Query query = session.createQuery(hql);
        listUser = query.list();
        session.getTransaction().commit();
        return listUser;
    }

    public static List<User> getListStudent() {
        List<User> listUser = null;
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        String hql = "from User where role = :role";
        Query query = session.createQuery(hql);
        query.setParameter("role", 1);

        listUser = query.list();
        session.getTransaction().commit();
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
            session.getTransaction().commit();
            return null;
        } else {
//            System.out.println("Have result");
            User temp = (User) query.list().get(0);
            session.getTransaction().commit();
            return temp;
        }
    }

    public static boolean changePassword(User user) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        try {
            session.update(user);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            System.out.println("Opps, " + e);
            session.getTransaction().commit();

            return false;
        }
        return true;
    }

    public static boolean addUser(User user) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        try {
            session.save(user);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            System.out.println("Opps, " + e);
            session.getTransaction().commit();
            return false;
        }
        return true;
    }

    public static void main(String[] args) throws NoSuchAlgorithmException {
        User temp = findOneById("GV1");
//        boolean x = handlePassword.comparePassword("1812043", temp.getPassword());
//        System.out.println("Password current: " + x);
//        if (temp == null) {
//            System.out.println("Null");
//        } else {
//            System.out.println("ID: " + temp.getId());
//            System.out.println("User name: " + temp.getUsername());
//            System.out.println("password: " + temp.getPassword());
//        }
        System.out.println("Username: " + temp.getName());
//        temp.setPassword(handlePassword.hashPassword("1"));
//        changePassword(temp);
//        System.out.println("user: " + temp == null);

        for (int i = 0; i < 100; i++) {
            String MSSV = "" + (18120435 + i + 1);
            String name = "Full name " + MSSV;
            User user = new User(MSSV, MSSV, util.handlePassword.hashPassword(MSSV), name, MSSV + "@student.hcmus.edu.vn", 1, (i % 2) == 0);
            addUser(user);
        }
    }
}
