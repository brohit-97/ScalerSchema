package com.scaler.scalerschema.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Data
@Entity
public class StudentExamCourse extends BaseModel{

    @ManyToOne
    private Student student;

    @ManyToOne
    private ExamCourse examCourse;

    private Integer marks;
}
