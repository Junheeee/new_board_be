package com.board.notice.reply.model;

import java.time.LocalDateTime;
import java.util.List;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("replyList")
public class ReplyList {
    private int rplySno;
    private int trgRplySno;
    private String reply;
    private int cstmrSno;
    private String cstmrNm;
    private LocalDateTime regDt;
    private LocalDateTime updDt;
    private List<ReplyList> childRplyList;
}
