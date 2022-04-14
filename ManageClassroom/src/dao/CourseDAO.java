/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author holohoi
 */
import entity.Course;
import entity.User;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import util.HibernateUtil;

public class CourseDAO {

    public static List<Course> getListCourse() {
        List<Course> listCourse = null;
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        String hql = "from Course";
        Query query = session.createQuery(hql);
        listCourse = query.list();
        return listCourse;
    }

    public static List<Course> getCoursesByCreator(User user) {
        if (user == null) {
            System.out.println("Not user");
            return null;
        } else {
            List<Course> listCourse = null;
            Session session = HibernateUtil.getSessionFactory().getCurrentSession();
            session.beginTransaction();
            String hql = "from Course where createBy = :inputId";
            Query query = session.createQuery(hql);
            query.setParameter("inputId", user);

            listCourse = query.list();
            session.getTransaction().commit();

            return listCourse;
        }
    }

    public static Course findOneById(String id) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        String hql = "from Course where id = :id";
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
            Course temp = (Course) query.list().get(0);
            session.getTransaction().commit();
            return temp;
        }
    }

    public static void main(String[] args) throws NoSuchAlgorithmException {
//        Course temp = null;
//        SessionFactory ssFac = HibernateUtil.getSessionFactory();
//        Session ss = ssFac.openSession();
//        ss.getTransaction().begin();
//        try {
//            temp = (Course) ss.get(Course.class, "CSC13114");
//        } catch (HibernateException ex) {
//            System.out.println(ex.getMessage());
//        } finally {
//            ss.close();
//        }
        User user = UserDAO.findOneById("GV0001");
        List<Course> temp = getCoursesByCreator(user);
        if (temp == null) {
            System.out.println("null");
        } else {
            if (temp.isEmpty()) {
                System.out.println("empty");
            } else {
                System.out.println("" + temp.size());
            }
        }
        System.out.println("Hello");
    }
}
