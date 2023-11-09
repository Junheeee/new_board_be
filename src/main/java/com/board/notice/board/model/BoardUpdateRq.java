package com.board.notice.board.model;

import java.time.LocalDateTime;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("boardUpdateRq")
public class BoardUpdateRq {
    private int brdSno;
    private String title;
    private String content;
    private String ctgrDivCd;
}
