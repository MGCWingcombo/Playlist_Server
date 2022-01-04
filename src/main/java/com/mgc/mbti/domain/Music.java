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

    @Column(name = "music", nullable = false)
    private String music;

    @Column(name = "artist", nullable = false)
    private String artist;

    @Column(name = "url", nullable = false)
    private String url;

    @Column(name = "urlImg", nullable = false)
    private String urlImg;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "playlistIdx")
    private Playlist playList;
}
