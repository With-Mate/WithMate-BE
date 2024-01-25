package com.gdscewha.withmate.domain.matching.dto;

import com.gdscewha.withmate.domain.model.Category;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MatchingDTO {
    private Long id;
    private String goal;
    private Category category;
}
