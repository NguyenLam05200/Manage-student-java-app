/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.sql.Timestamp;

/**
 *
 * @author holohoi
 */
public class User_Course implements java.io.Serializable {

    private User userID;
    private Course courseID;
    private Timestamp importAt;
    private User importBy;
    private boolean isActive;
    private boolean week_1;
    private boolean week_2;
    private boolean week_3;
    private boolean week_4;
    private boolean week_5;
    private boolean week_6;
    private boolean week_7;
    private boolean week_8;
    private boolean week_9;
    private boolean week_10;
    private boolean week_11;
    private boolean week_12;
    private boolean week_13;
    private boolean week_14;
    private boolean week_15;

    public void setRollCall(int week) {
        switch (week) {
            case 1:
                this.week_1 = true;
                break;
            case 2:
                this.week_2 = true;
                break;
            case 3:
                this.week_3 = true;
                break;
            case 4:
                this.week_4 = true;
                break;
            case 5:
                this.week_5 = true;
                break;
            case 6:
                this.week_6 = true;
                break;
            case 7:
                this.week_7 = true;
                break;
            case 8:
                this.week_8 = true;
                break;
            case 9:
                this.week_9 = true;
                break;
            case 10:
                this.week_10 = true;
                break;
            case 11:
                this.week_11 = true;
                break;
            case 12:
                this.week_12 = true;
                break;
            case 13:
                this.week_13 = true;
                break;
            case 14:
                this.week_14 = true;
                break;
            case 15:
                this.week_15 = true;
                break;
            default:
                throw new AssertionError();
        }
    }

    public User_Course() {
    }

    public User_Course(User userID, Course courseID, Timestamp importAt, User importBy, boolean isActive, boolean week_1, boolean week_2, boolean week_3, boolean week_4, boolean week_5, boolean week_6, boolean week_7, boolean week_8, boolean week_9, boolean week_10, boolean week_11, boolean week_12, boolean week_13, boolean week_14, boolean week_15) {
        this.userID = userID;
        this.courseID = courseID;
        this.importAt = importAt;
        this.importBy = importBy;
        this.isActive = isActive;
        this.week_1 = week_1;
        this.week_2 = week_2;
        this.week_3 = week_3;
        this.week_4 = week_4;
        this.week_5 = week_5;
        this.week_6 = week_6;
        this.week_7 = week_7;
        this.week_8 = week_8;
        this.week_9 = week_9;
        this.week_10 = week_10;
        this.week_11 = week_11;
        this.week_12 = week_12;
        this.week_13 = week_13;
        this.week_14 = week_14;
        this.week_15 = week_15;
    }

    public User_Course(User userID, Course courseID, User importBy) {
        this.userID = userID;
        this.courseID = courseID;
        this.importBy = importBy;
        this.isActive = true;
    }

    public User getUserID() {
        return userID;
    }

    public void setUserID(User userID) {
        this.userID = userID;
    }

    public Course getCourseID() {
        return courseID;
    }

    public void setCourseID(Course courseID) {
        this.courseID = courseID;
    }

    public Timestamp getImportAt() {
        return importAt;
    }

    public void setImportAt(Timestamp importAt) {
        this.importAt = importAt;
    }

    public User getImportBy() {
        return importBy;
    }

    public void setImportBy(User importBy) {
        this.importBy = importBy;
    }

    public boolean isIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public boolean isWeek_1() {
        return week_1;
    }

    public void setWeek_1(boolean week_1) {
        this.week_1 = week_1;
    }

    public boolean isWeek_2() {
        return week_2;
    }

    public void setWeek_2(boolean week_2) {
        this.week_2 = week_2;
    }

    public boolean isWeek_3() {
        return week_3;
    }

    public void setWeek_3(boolean week_3) {
        this.week_3 = week_3;
    }

    public boolean isWeek_4() {
        return week_4;
    }

    public void setWeek_4(boolean week_4) {
        this.week_4 = week_4;
    }

    public boolean isWeek_5() {
        return week_5;
    }

    public void setWeek_5(boolean week_5) {
        this.week_5 = week_5;
    }

    public boolean isWeek_6() {
        return week_6;
    }

    public void setWeek_6(boolean week_6) {
        this.week_6 = week_6;
    }

    public boolean isWeek_7() {
        return week_7;
    }

    public void setWeek_7(boolean week_7) {
        this.week_7 = week_7;
    }

    public boolean isWeek_8() {
        return week_8;
    }

    public void setWeek_8(boolean week_8) {
        this.week_8 = week_8;
    }

    public boolean isWeek_9() {
        return week_9;
    }

    public void setWeek_9(boolean week_9) {
        this.week_9 = week_9;
    }

    public boolean isWeek_10() {
        return week_10;
    }

    public void setWeek_10(boolean week_10) {
        this.week_10 = week_10;
    }

    public boolean isWeek_11() {
        return week_11;
    }

    public void setWeek_11(boolean week_11) {
        this.week_11 = week_11;
    }

    public boolean isWeek_12() {
        return week_12;
    }

    public void setWeek_12(boolean week_12) {
        this.week_12 = week_12;
    }

    public boolean isWeek_13() {
        return week_13;
    }

    public void setWeek_13(boolean week_13) {
        this.week_13 = week_13;
    }

    public boolean isWeek_14() {
        return week_14;
    }

    public void setWeek_14(boolean week_14) {
        this.week_14 = week_14;
    }

    public boolean isWeek_15() {
        return week_15;
    }

    public void setWeek_15(boolean week_15) {
        this.week_15 = week_15;
    }

}
