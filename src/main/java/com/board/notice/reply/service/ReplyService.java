package com.board.notice.reply.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.board.notice.reply.mapper.ReplyMapper;
import com.board.notice.reply.model.ReplyCreateRq;
import com.board.notice.reply.model.ReplyList;
import com.board.notice.reply.model.ReplyListRs;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
@RequiredArgsConstructor
public class ReplyService {
    private final ReplyMapper replyMapper;

    public int insertReply(ReplyCreateRq rq) {
        return replyMapper.insertReply(rq);
    }

    // 해당 게시글의 부모 댓글 불러오기
    public ReplyListRs getReplyList(int brdSno) {
        List<ReplyList> replyList = replyMapper.getReplyList(brdSno);
        
        for(ReplyList rs: replyList) {
            setChildReplyList(rs);
        }

        int replyListCnt = replyMapper.getReplyCnt(brdSno);
        
        ReplyListRs result = new ReplyListRs();
        result.setReplyList(replyList);
        result.setCnt(replyListCnt);

        return result;
    }

    // 해당 부모 댓글의 자식 댓글 불러오기(재귀함수)
    private void setChildReplyList(ReplyList parent) {
        List<ReplyList> childReplyList = replyMapper.getChildReplyList(parent.getRplySno());

        if(childReplyList.size() > 0) {
            parent.setChildRplyList(childReplyList);

            for(ReplyList child: childReplyList) {
                setChildReplyList(child);
            }
        }
    }
}
