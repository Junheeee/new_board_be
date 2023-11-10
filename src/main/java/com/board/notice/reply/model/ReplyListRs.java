package com.board.notice.reply.model;

import java.util.List;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("replyListRs")
public class ReplyListRs {
    private List<ReplyList> replyList;
    private int cnt;
}
