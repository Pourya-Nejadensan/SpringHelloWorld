package org.example.springhelloworld;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Message {
    private String id;
    private String name;
    private String message;
}
