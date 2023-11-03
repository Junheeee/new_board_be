package com.board.notice.board.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("boardListRs")
public class BoardListRs {
    private int boardSno;
    private String title;
    private LocalDateTime regDate;
    private String cstmrNm;
    private String ctgrDivCd;
    private int views; 
}
