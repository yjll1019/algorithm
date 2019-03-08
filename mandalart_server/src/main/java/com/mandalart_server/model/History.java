package com.mandalart_server.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class History {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String content;

    @CreationTimestamp
    @Column(name = "create_date", updatable = false)
    LocalDateTime createDate;

    @Column(name = "mandalart_middle_id")
    int middleId;

    @ManyToOne
    @JoinColumn(name = "mandalart_id_fk", referencedColumnName = "id")
    Mandalart mandalart;
}
