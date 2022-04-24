/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 *
 * @author holohoi
 */
public class Course implements java.io.Serializable {

    private String id;
    private String name;
    private Timestamp createAt;
    private User createBy;
    private Date dayStart;
    private Date dayFinish;
    private Time timeStart;
    private Time timeFinish;
    private int weekday;
    private String roomName;

    public Course(String id, String name, User createBy, Date dayStart, Date dayFinish, Time timeStart, Time timeFinish, int weekday, String roomName) {
        this.id = id;
        this.name = name;
        this.createBy = createBy;
        this.dayStart = dayStart;
        this.dayFinish = dayFinish;
        this.timeStart = timeStart;
        this.timeFinish = timeFinish;
        this.weekday = weekday;
        this.roomName = roomName;

        Long datetime = System.currentTimeMillis();
        Timestamp timeCur = new Timestamp(datetime);
        this.createAt = timeCur;
    }

    //Các phương thức khởi tạo, get, set.
    public Course(String id, String name, Timestamp createAt, User createBy, Date dayStart, Date dayFinish, Time timeStart, Time timeFinish, int weekday, String roomName) {
        this.id = id;
        this.name = name;
        this.createAt = createAt;
        this.createBy = createBy;
        this.dayStart = dayStart;
        this.dayFinish = dayFinish;
        this.timeStart = timeStart;
        this.timeFinish = timeFinish;
        this.weekday = weekday;
        this.roomName = roomName;
    }

    public Course() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Timestamp getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Timestamp createAt) {
        this.createAt = createAt;
    }

    public User getCreateBy() {
        return createBy;
    }

    public void setCreateBy(User createBy) {
        this.createBy = createBy;
    }

    public Date getDayStart() {
        return dayStart;
    }

    public void setDayStart(Date dayStart) {
        this.dayStart = dayStart;
    }

    public Date getDayFinish() {
        return dayFinish;
    }

    public void setDayFinish(Date dayFinish) {
        this.dayFinish = dayFinish;
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

    public int getWeekday() {
        return weekday;
    }

    public void setWeekday(int weekday) {
        this.weekday = weekday;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

}
