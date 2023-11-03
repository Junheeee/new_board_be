package com.board.notice.board.model;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("boardCreateRq")
public class BoardCreateRq {
    private String title;
    private String content;
    private int cstmrSno;
    private String ctgrDivCd;

}
