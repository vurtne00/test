package com.springdemo.demo.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
@NoArgsConstructor
abstract class BasicModel {

    private String createBy;
    private String lastBy;
    private Date createDate;
    private Date lastDate;
}
