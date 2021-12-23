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

@Table(name = "music")
public class Music {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "music_idx")
    private Long musicIdx;

    @Column(name = "song", nullable = false)
    private String song;

    @Column(name = "content", nullable = false)
    private String artist;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "playlistIdx")
    private PlayList playList;
}
