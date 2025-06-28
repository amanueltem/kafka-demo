package com.amman.kafka_demo.payload;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
//https://stream.wikimedia.org/v2/stream/recentChange
@Getter
@Setter
@ToString
public class Student {
    private int id;
    private String firstname;
    private String lastName;
}
