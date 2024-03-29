package com.gdscewha.withmate.domain.matching.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.gdscewha.withmate.domain.model.Category;
import com.gdscewha.withmate.domain.member.entity.Member;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Matching {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "matchingId")
    private Long id;

    @Column(nullable = false, name = "goal")
    private String goal;

    @Column(nullable = false, name = "category")
    @Enumerated(EnumType.STRING)
    private Category category;

//    @Column(name = "ageGroup") // 추후 나잇대
//    private Enum ageGroup;

    @OneToOne(mappedBy = "matching") //FK를 Member가 갖는 것으로 바꿈
    @JsonBackReference
    private Member member;
}
