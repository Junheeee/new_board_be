package com.board.notice.reply.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.board.notice.reply.model.ReplyCreateRq;
import com.board.notice.reply.model.ReplyList;
import com.board.notice.reply.model.ReplyListRs;

@Mapper
public interface ReplyMapper {
    int insertReply(ReplyCreateRq rq);

    List<ReplyList> getReplyList(int brdSno);

    List<ReplyList> getChildReplyList(int trgRplySno);

    int getReplyCnt(int brdSno);
}
