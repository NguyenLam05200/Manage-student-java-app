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
import entity.Course_Week;
import entity.User;
import java.security.NoSuchAlgorithmException;
import java.sql.Time;
import java.time.LocalDate;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import util.HibernateUtil;

public class CourseWeekDAO {

    public static List<Course_Week> getAllWeekByCourse(Course course) {
        if (course == null) {
            System.out.println("Not user");
            return null;
        } else {
            List<Course_Week> listWeek = null;
            Session session = HibernateUtil.getSessionFactory().getCurrentSession();
            session.beginTransaction();
            String hql = "from Course_Week where courseID = :inputId";
            Query query = session.createQuery(hql);
            query.setParameter("inputId", course);

            listWeek = query.list();
            session.getTransaction().commit();

            return listWeek;
        }
    }

    public static boolean addWeek(Course_Week course_week) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        try {
            session.save(course_week);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            System.out.println("Opps, " + e);
            session.getTransaction().commit();
            return false;
        }
        return true;
    }

    public static void main(String[] args) throws NoSuchAlgorithmException {
    }
}
