package com.gdscewha.withmate.domain.memberrelation.entity;

import com.gdscewha.withmate.domain.model.Category;
import com.gdscewha.withmate.domain.member.entity.Member;
import com.gdscewha.withmate.domain.relation.entity.Relation;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class MemberRelation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "memberRelationId")
    private Long id;

    @Column(nullable = false, name = "goal")
    private String goal;

    @Column(nullable = false, name = "category")
    @Enumerated(EnumType.STRING)
    private Category category;

    @Column(name = "message")
    private String message;

    // Member와 Relation 다대다를 위한 매핑
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "member_id")
    private Member member;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "relation_id")
    private Relation relation;
}
