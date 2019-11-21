package com.jerry.springboot_jsp_thymeleaf.pojo;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "user")
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false,unique = true)
    private String name;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private Integer age;
    
}
