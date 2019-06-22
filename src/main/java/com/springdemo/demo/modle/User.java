package com.springdemo.demo.modle;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;


@Getter
@Setter
@NoArgsConstructor
@ToString
public class User implements Serializable {

    private Integer uId;
    private String userName;
    private String paw;
    private String address;
}
