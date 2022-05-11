package com.sushangjin.springcloud.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Classes implements Serializable {

    private static final long serialVersionUID = 623204142972855316L;

    private Long id;

    private String class_name;
}
