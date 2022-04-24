
import java.sql.Date;
import java.sql.Time;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import view.TeacherDashboard;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author holohoi
 */
public class NewClass {

    public static void main(String[] args) throws ParseException {

    }

    static java.sql.Date parseDate(String inputDate) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        java.util.Date date;
        try {
            date = sdf.parse(inputDate);
            java.sql.Date sqlDate = new Date(date.getTime());
            return sqlDate;
        } catch (ParseException ex) {
            Logger.getLogger(NewClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    static java.sql.Time parseTime(String inputTime) {

        SimpleDateFormat sdf = new SimpleDateFormat("HH-mm");
        try {
            long ms;
            ms = sdf.parse(inputTime).getTime();
            Time t = new Time(ms);
            return t;
        } catch (ParseException ex) {
            Logger.getLogger(NewClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    private static Timestamp convertDate(String inDate, boolean isDate) {
        String format = "";
        if (isDate) {
            format = "dd-MM-yyyy";
        } else {
            format = "HH-mm";
        }
        DateFormat df = new SimpleDateFormat(format);
        Timestamp ts = null;
        try {
            ts = new Timestamp(((java.util.Date) df.parse(inDate)).getTime());
        } catch (ParseException ex) {
            Logger.getLogger(TeacherDashboard.class.getName()).log(Level.SEVERE, null, ex);
        }

        return ts;
    }
}
