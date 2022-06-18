package com.scaler.scalerschema.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.List;

@Data
@Entity
public class Course extends BaseModel{

    private String name;

    @ManyToMany
    private List<Student> students;
}
