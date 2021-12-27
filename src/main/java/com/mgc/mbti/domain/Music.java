package com.mgc.mbti.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "music")
public class Music {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "music_idx")
    private Long musicIdx;

    @Column(name = "song", nullable = false)
    private String song;

    @Column(name = "artist", nullable = false)
    private String artist;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "playlistIdx")
    private Playlist playList;
}
