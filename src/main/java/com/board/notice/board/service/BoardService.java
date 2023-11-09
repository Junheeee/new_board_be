package com.board.notice.board.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.board.notice.board.mapper.BoardMapper;
import com.board.notice.board.model.BoardCreateRq;
import com.board.notice.board.model.BoardCtgrRs;
import com.board.notice.board.model.BoardDetailRs;
import com.board.notice.board.model.BoardListRs;
import com.board.notice.board.model.BoardUpdateRq;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardMapper boardMapper;


    public List<BoardListRs> getBoardList(String ctgrDivCd) {
        return boardMapper.getBoardList(ctgrDivCd);
    }

    public int insertBoard(BoardCreateRq rq) {
        return boardMapper.insertBoard(rq);
    }

    public BoardDetailRs getBoardDetail(int brdSno) {
        return boardMapper.getBoardDetail(brdSno);
    }

    public int updateBoard(BoardUpdateRq rq) {
        return boardMapper.updateBoard(rq);
    }

    public int deleteBoard(int brdSno) {
        return boardMapper.deleteBoard(brdSno);
    }

    public List<BoardCtgrRs> getBoardCtgrList() {
        return boardMapper.getBoardCtgrList();
    }

    public int updateViews(int brdSno) {
        return boardMapper.updateViews(brdSno);
    }

}
