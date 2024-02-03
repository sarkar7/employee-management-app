package com.sarkar.ems.models.postgres;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "ROLE")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private Integer roleId;

    @Column(nullable = false)
    private String name;

    // Audit
    @Column(nullable = false)
    private String createdBy;

    @Column(nullable = false)
    private LocalDate createdDate;

    private String updatedBy;
    private LocalDate updatedDate;

}
