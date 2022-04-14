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
    public Course(String id, String name, Timestamp createAt, User createBy) {
        this.id = id;
        this.name = name;
        this.createAt = createAt;
        this.createBy = createBy;
    }

    public Course() {
        this.id = "";
        this.name = "";
        this.createAt = null;
        this.createBy = null;
    }
}
