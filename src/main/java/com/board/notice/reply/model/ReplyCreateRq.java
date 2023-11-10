package com.board.notice.reply.model;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("replyCreateRq")
public class ReplyCreateRq {
    private int brdSno;
    private int trgRplySno;
    private String reply;
    private int cstmrSno;
}
