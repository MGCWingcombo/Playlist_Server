package com.mgc.mbti.domain;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ENFJ {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "enfj_idx")
    private Long ENFJIdx;

    @Column(name = "Song", nullable = false)
    private String Song;

    @Column(name = "content", nullable = false)
    private String artist;
}

