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
public class Course implements java.io.Serializable {

    private String id;
    private String name;
    private Timestamp createAt;
    private User createBy;
    private Timestamp dayStart;

    private Timestamp dayFinish;
    private Timestamp timeStart;
    private Timestamp timeFinish;
    private int weekday;
    private String roomName;

    public Timestamp getDayStart() {
        return dayStart;
    }

    public void setDayStart(Timestamp dayStart) {
        this.dayStart = dayStart;
    }

    public Timestamp getDayFinish() {
        return dayFinish;
    }

    public void setDayFinish(Timestamp dayFinish) {
        this.dayFinish = dayFinish;
    }

    public Timestamp getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(Timestamp timeStart) {
        this.timeStart = timeStart;
    }

    public Timestamp getTimeFinish() {
        return timeFinish;
    }

    public void setTimeFinish(Timestamp timeFinish) {
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

    //Các phương thức khởi tạo, get, set.
    public Course(String id, String name, Timestamp createAt, User createBy, Timestamp dayStart, Timestamp dayFinish, Timestamp timeStart, Timestamp timeFinish, int weekday, String roomName) {
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
        Long datetime = System.currentTimeMillis();
        Timestamp timeCur = new Timestamp(datetime);
        this.id = "";
        this.name = "";
        this.createAt = timeCur;
        this.createBy = null;
        this.dayStart = timeCur;
        this.dayFinish = timeCur;
        this.timeStart = timeCur;
        this.timeFinish = timeCur;
        this.weekday = 2;
        this.roomName = "";
    }
}
