package com.toj.dto.daily;

import com.querydsl.core.annotations.QueryProjection;
import lombok.*;

@Getter
@Setter
public class GetRankingResponse {

    private Long memberId;
    private Integer totalScore;
    private Integer ranking;

    public GetRankingResponse(Integer ranking) {
        this.ranking = ranking;
    }

    @QueryProjection
    public GetRankingResponse(Long memberId, Integer totalScore) {
        this.memberId = memberId;
        this.totalScore = totalScore;
    }
}
