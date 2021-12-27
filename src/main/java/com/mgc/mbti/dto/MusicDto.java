package com.mgc.mbti.dto;

import com.mgc.mbti.domain.Music;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MusicDto {
    private String song;

    private String artist;

    public Music toEntity() {
        return Music.builder()
                .song(this.getSong())
                .artist(this.getArtist())
                .build();
    }
}
