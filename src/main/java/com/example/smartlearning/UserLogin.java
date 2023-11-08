package com.example.smartlearning;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name="UserLogin")
public class UserLogin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "username")
    private  String username;
    @Column(name = "sid")
    private String sid;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "datetime")
    private Date Datetime;
    @PrePersist
    protected void onCreate() {
        Datetime = new Date();
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public Date getDatetime() {
        return Datetime;
    }

    public void setDatetime(Date datetime) {
        Datetime = datetime;
    }
}
