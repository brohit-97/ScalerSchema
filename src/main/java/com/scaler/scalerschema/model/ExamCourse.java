package com.scaler.scalerschema.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.Date;

@Data
@Entity
public class ExamCourse extends BaseModel{

    @ManyToOne
    Exam exam;

    @ManyToOne
    Course course;

    Date examDate;
}
