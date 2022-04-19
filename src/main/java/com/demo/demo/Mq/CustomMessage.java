package com.demo.demo.Mq;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class CustomMessage {

    private String messageId;
    private String cardHolder;
    private double cash;
    private String cardReceiver;
    private String message;
    private Date Date;
    }

