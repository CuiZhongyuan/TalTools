package com.taltools.entity;

import lombok.Data;

import java.io.Serializable;
@Data
public class TMsgEntity implements Serializable {
    private Integer id;
    private String message;
}
