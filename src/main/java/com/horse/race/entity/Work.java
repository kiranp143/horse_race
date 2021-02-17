package com.horse.race.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "work")
public class Work {

    @Transient
    public static final String SEQUENCE_NAME = "work_seq";

    @Id
    private String id;
    public String event;
    public Horse horse;
    public int time;


}

