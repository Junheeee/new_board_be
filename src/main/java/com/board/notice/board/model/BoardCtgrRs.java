package com.board.notice.board.model;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("boardCtgrRs")
public class BoardCtgrRs {
    private String ctgrDivCd;
    private String ctgrNm;
}
