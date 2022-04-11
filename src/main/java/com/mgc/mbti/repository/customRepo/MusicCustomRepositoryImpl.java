package com.mgc.mbti.repository.customRepo;

import com.mgc.mbti.domain.Music;
import com.mgc.mbti.domain.Playlist;
import com.querydsl.core.types.dsl.Expressions;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.mgc.mbti.domain.QMusic.music1;

@Repository
public class MusicCustomRepositoryImpl implements MusicCustomRepository{

    private final JPAQueryFactory jpaQueryFactory;

    public MusicCustomRepositoryImpl(JPAQueryFactory jpaQueryFactory) {
        this.jpaQueryFactory = jpaQueryFactory;
    }

    @Override
    public List<Music> findAllByPlayList(Playlist playlist){
        return jpaQueryFactory.selectFrom(music1)
                .where(music1.playList.eq(playlist))
                .orderBy(Expressions.numberTemplate(Double.class, "function('rand')").asc())
                .limit(24)
                .fetch();
    }
}
