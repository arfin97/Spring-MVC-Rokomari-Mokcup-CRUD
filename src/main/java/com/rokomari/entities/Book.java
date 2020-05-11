package com.rokomari.entities;

import lombok.*;
import org.hibernate.validator.constraints.Range;

import javax.persistence.*;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "books")
public class Book implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "name")
    private String name;
    private Integer price;

    @Range(min = 0, max = 6)
    private Integer rating;

}
