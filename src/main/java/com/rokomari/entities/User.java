package com.rokomari.entities;

import lombok.*;
import org.hibernate.validator.constraints.Range;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "users")
public class User {
    @Id
    private long id;
    @Column(name = "USER_NAME")
    private String username;
    @Range(min = 10, max = 120)
    private String password;
}
