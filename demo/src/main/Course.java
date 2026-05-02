package com.klef.fsad.exam;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Course 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String description;
    private Date date;
    private String status;

    public int getId() { return id; }
    public void setName(String name) { this.name = name; }
    public void setDescription(String d) { this.description = d; }
    public void setDate(Date date) { this.date = date; }
    public void setStatus(String status) { this.status = status; }
}