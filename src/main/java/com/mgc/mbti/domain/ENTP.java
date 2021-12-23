package com.mgc.mbti.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ENTP {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "entp_idx")
    private Long ENTPIdx;

    @Column(name = "Song", nullable = false)
    private String Song;

    @Column(name = "content", nullable = false)
    private String artist;
}
