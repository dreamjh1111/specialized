package com.ssafy.specialized.domain.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class HobbySubcategory {

    @Id
    @GeneratedValue
    private int idx;

    @ManyToOne
    private HobbyMain mainCategory;

    private String subcategory;

    private String subcategoryImageUrl;

}
