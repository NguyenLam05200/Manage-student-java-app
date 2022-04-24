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
import entity.User_Course;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import util.HibernateUtil;

public class UserCourseDAO {

    public static List<User_Course> findAllUserByCourse(Course course) {
        if (course == null) {
            System.out.println("Not course input");
            return null;
        } else {
            List<User_Course> listUserCourse = null;
            Session session = HibernateUtil.getSessionFactory().getCurrentSession();
            session.beginTransaction();
            String hql = "from User_Course where courseID = :inputId";
            Query query = session.createQuery(hql);
            query.setParameter("inputId", course);

            listUserCourse = query.list();
            session.getTransaction().commit();

            return listUserCourse;
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello from user_courseDAO");
        Course course = CourseDAO.findOneById("MTH00051");
        System.out.println("CourseID: " + course.getId());
        List<User_Course> listCheck = findAllUserByCourse(course);
        System.out.println("Check: " + listCheck.get(0).getUserID().getId());

    }
}
