package com.board.notice.board.model;

import java.time.LocalDateTime;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("boardListRs")
public class BoardListRs {
    private int brdSno;
    private String title;
    private LocalDateTime regDt;
    private String cstmrNm;
    private String ctgrDivCd;
    private int views; 
}
