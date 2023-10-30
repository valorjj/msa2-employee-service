package com.example.msa2employeeservice.model;

import lombok.Builder;

@Builder
public record Employee(
    Long id,
    Long departmentId,
    String name,
    Integer age,
    String position
) {
}
