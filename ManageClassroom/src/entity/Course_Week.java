/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.sql.Timestamp;
import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author holohoi
 */
public class Course_Week implements java.io.Serializable {

    private int weekID;
    private Course courseID;
    private Timestamp updateAt;
    private User updateBy;
    private int weekday;
    private Date day;
    private Time timeStart;
    private Time timeFinish;
    private String roomName;

    public Course_Week() {
    }

    public Course_Week(int weekID, Course courseID, Timestamp updateAt, User updateBy, int weekday, Date day, Time timeStart, Time timeFinish, String roomName) {
        this.weekID = weekID;
        this.courseID = courseID;
        this.updateAt = updateAt;
        this.updateBy = updateBy;
        this.weekday = weekday;
        this.day = day;
        this.timeStart = timeStart;
        this.timeFinish = timeFinish;
        this.roomName = roomName;
    }

    public int getWeekID() {
        return weekID;
    }

    public void setWeekID(int weekID) {
        this.weekID = weekID;
    }

    public Course getCourseID() {
        return courseID;
    }

    public void setCourseID(Course courseID) {
        this.courseID = courseID;
    }

    public Timestamp getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Timestamp updateAt) {
        this.updateAt = updateAt;
    }

    public User getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(User updateBy) {
        this.updateBy = updateBy;
    }

    public int getWeekday() {
        return weekday;
    }

    public void setWeekday(int weekday) {
        this.weekday = weekday;
    }

    public Date getDay() {
        return day;
    }

    public void setDay(Date day) {
        this.day = day;
    }

    public Time getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(Time timeStart) {
        this.timeStart = timeStart;
    }

    public Time getTimeFinish() {
        return timeFinish;
    }

    public void setTimeFinish(Time timeFinish) {
        this.timeFinish = timeFinish;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

}
