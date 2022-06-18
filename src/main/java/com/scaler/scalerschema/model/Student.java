package com.scaler.scalerschema.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.List;

@Data
@Entity
public class Student extends BaseModel {

    private String name;
    private String email;
    private String password;
    private String college;

    @ManyToMany(mappedBy = "students")
    private List<Course> courses;
}
