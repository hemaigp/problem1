package com.problem.demo.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Data
@Entity
@Table(name = "Category")
public class Category{
    @GeneratedValue( strategy = GenerationType.AUTO )
    @Column( name = "id", nullable = false )
    @Id
    private Integer id;
    private String name;

}
