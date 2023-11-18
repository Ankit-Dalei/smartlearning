package com.example.smartlearning;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Data
@Entity
@Table(name="Contents")
public class Contents {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private  String contentlink;

    @Lob
    @Column(columnDefinition = "BLOB")
    private byte[] thumbnail;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String catagory;

    @Column(nullable = false)
    private long likes;

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

    public String getContentlink() {
        return contentlink;
    }

    public void setContentlink(String contentlink) {
        this.contentlink = contentlink;
    }

    public byte[] getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(byte[] thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCatagory() {
        return catagory;
    }

    public void setCatagory(String catagory) {
        this.catagory = catagory;
    }

    public long getLike() {
        return likes;
    }

    public void setLike(long likes) {
        this.likes = likes;
    }

    public Date getDatetime() {
        return Datetime;
    }

    public void setDatetime(Date datetime) {
        Datetime = datetime;
    }

    public Contents(long id, String contentlink, byte[] thumbnail, String name, String description, String catagory,long likes, Date datetime) {
        this.id = id;
        this.contentlink = contentlink;
        this.thumbnail = thumbnail;
        this.name = name;
        this.description = description;
        this.catagory = catagory;
        this.likes = likes;
        Datetime = datetime;
    }

    public Contents() {
    }
}
