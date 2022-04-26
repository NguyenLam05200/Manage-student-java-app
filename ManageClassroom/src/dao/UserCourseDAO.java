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
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
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

    public static List<Course> findAllCourseByStudent(User user) {
        if (user == null) {
            System.out.println("Not course input");
            return null;
        } else {
            List<User_Course> listUserCourse = null;
            Session session = HibernateUtil.getSessionFactory().getCurrentSession();
            session.beginTransaction();
            String hql = "from User_Course where userID = :inputId";
            Query query = session.createQuery(hql);
            query.setParameter("inputId", user);

            listUserCourse = query.list();
            session.getTransaction().commit();

            List<Course> result = new ArrayList<>();
            for (User_Course user_course : listUserCourse) {
                Course x = CourseDAO.findOneById(user_course.getCourseID().getId());
//                result.contains(user_course.getCourseID());
                if (!result.contains(x)) {
                    result.add(x);
                }
            }
            return result;
        }
    }

    public static boolean rollCall(User_Course user_course) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        try {
            session.update(user_course);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            System.out.println("Opps, " + e);
            session.getTransaction().commit();

            return false;
        }
        return true;
    }

    public static User_Course findByUserCourse(User user, Course course) {
        if (course == null || user == null) {
            System.out.println("Not course or user input");
            return null;
        } else {
            Session session = HibernateUtil.getSessionFactory().getCurrentSession();
            session.beginTransaction();
            String hql = "from User_Course where courseID = :inputCourse and userID = :inputUser";
            Query query = session.createQuery(hql);
            query.setParameter("inputCourse", course);
            query.setParameter("inputUser", user);

            query.uniqueResult();

            boolean isNotResult = query.list().isEmpty();

            if (isNotResult) {
//            System.out.println("Not result");
                session.getTransaction().commit();
                return null;
            } else {
//            System.out.println("Have result");
                User_Course temp = (User_Course) query.list().get(0);
                session.getTransaction().commit();
                return temp;
            }
        }
    }

    public static String addUser(String userID, Course course, User creator) {
        User _user = UserDAO.findOneById(userID);
        if (_user != null) {
            User_Course user_course_check = findByUserCourse(_user, course);
            if (user_course_check == null) {
                User_Course temp = new User_Course(_user, course, creator);
                Session session = HibernateUtil.getSessionFactory().getCurrentSession();
                session.beginTransaction();
                try {
                    session.saveOrUpdate(temp);
                    session.getTransaction().commit();
                } catch (HibernateException e) {
                    System.out.println("Opps, " + e);
                    session.getTransaction().commit();
                    return "Fail to add or update!";
                }
                return "Add success!";
            } else {
                return "User is already a member in this course!";
            }
        } else {
            return "User is not exist!";
        }
    }

    public static void main(String[] args) {
//        System.out.println("Hello from user_courseDAO");
//        Course course = CourseDAO.findOneById("CSC13007");
//        System.out.println("CourseID: " + course.getId());
//        List<User_Course> listCheck = findAllUserByCourse(course);
//        User user = UserDAO.findOneById(listCheck.get(0).getUserID().getId());
//        System.out.println("Check: " + user.getName());

        User creator = UserDAO.findOneById("GV1");
        Course course = CourseDAO.findOneById("CSC13007");
//        User_Course temp = findByUserCourse(user, course);
//        if (temp == null) {
//            System.out.println("Don't have");
//        } else {
//            System.out.println("have");
//        }
        String result = addUser("18120434", course, creator);
        System.out.println(result);

    }
}
