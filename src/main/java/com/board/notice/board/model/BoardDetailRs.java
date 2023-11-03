package com.board.notice.board.model;

import java.time.LocalDateTime;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("boardDetailRs")
public class BoardDetailRs {
    private int boardSno;
    private String title;
    private String content;
    private int cstmrSno;
    private String cstmrNm;
    private LocalDateTime regDate;
    private String ctgrDivCd;
    private int views;
}
