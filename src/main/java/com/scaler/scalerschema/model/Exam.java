package com.scaler.scalerschema.model;

import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class Exam extends BaseModel{

    private String Duration;

}
