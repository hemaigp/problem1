package com.problem.demo.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Data
@Entity
@Table(name = "categoryRelations")
public class CategoryRelations {
    @GeneratedValue( strategy = GenerationType.AUTO )
    @Column( name = "category1", nullable = false )
    @Id
    private Integer category1;
    private Integer category2;
    private String relationshipName;

}
