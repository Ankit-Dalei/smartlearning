package com.example.smartlearning;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name="Likes")
public class History {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private  long cid;

    @Column(nullable = false)
    private  long uid;

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

    public long getCid() {
        return cid;
    }

    public void setCid(long cid) {
        this.cid = cid;
    }

    public long getUid() {
        return uid;
    }

    public void setUid(long uid) {
        this.uid = uid;
    }

    public Date getDatetime() {
        return Datetime;
    }

    public void setDatetime(Date datetime) {
        Datetime = datetime;
    }
}
