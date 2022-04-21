/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author holohoi
 */
public class User implements java.io.Serializable {

    private String id;
    private String username;
    private String password;
    private String name;
    private String email;
    private int role; // 1: Student, 0: Teacher
    private boolean gender; // True: Male, False: Female

    //Các phương thức khởi tạo, get, set.
    public User() {
        this.id = "";
        this.username = "";
        this.password = "";
        this.name = "";
        this.email = "";
        this.role = 1;
        this.gender = false;
    }

    public User(String id, String username, String password, String name, String email, int role, boolean isMale) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.name = name;
        this.email = email;
        this.role = role;
        this.gender = isMale;
    }

    public boolean getGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

}
