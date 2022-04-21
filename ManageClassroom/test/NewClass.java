
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

    public static void main(String[] args) {
        String date = "05-20-2000";
        String format = "ddMMyyyy";
        System.out.println("Date: " + convertDate(date, true));
        String time = "24-30";
        format = "HH-mm";
        System.out.println("Time: " + convertDate(time, false));

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
