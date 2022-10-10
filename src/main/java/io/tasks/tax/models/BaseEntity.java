package io.tasks.tax.models;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

public class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Enumerated(EnumType.STRING)
    private Status status;

    @Column(name = "created_on", insertable = true, updatable = false)
    @CreationTimestamp
    private LocalDateTime createdOn;

    @Column(name = "created_by", insertable = true, updatable = false)
    private String createdBy;

    @Column(name = "updated_on")
    @UpdateTimestamp
    private LocalDateTime updatedOn;

    @Column(name = "updated_by")
    private String updatedBy;

}
