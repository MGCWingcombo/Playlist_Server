package com.mgc.mbti.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ENTJ {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "entj_idx")
    private Long ENTJIdx;

    @Column(name = "Song", nullable = false)
    private String Song;

    @Column(name = "content", nullable = false)
    private String artist;
}
