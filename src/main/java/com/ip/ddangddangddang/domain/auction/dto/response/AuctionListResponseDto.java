package com.ip.ddangddangddang.domain.auction.dto.response;

import com.ip.ddangddangddang.domain.auction.entity.StatusEnum;
import java.time.LocalDateTime;
import lombok.Getter;

@Getter
public class AuctionListResponseDto {

    private Long auctionId;
    private String title;
    private StatusEnum status;
    private LocalDateTime finishedAt;

    public AuctionListResponseDto(Long auctionId, String title, StatusEnum status,
        LocalDateTime finishedAt) {
        this.auctionId = auctionId;
        this.title = title;
        this.status = status;
        this.finishedAt = finishedAt;
    }
}