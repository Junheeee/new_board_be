package com.board.notice.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.board.notice.board.model.BoardCreateRq;
import com.board.notice.board.model.BoardCtgrRs;
import com.board.notice.board.model.BoardDetailRs;
import com.board.notice.board.model.BoardListRs;
import com.board.notice.board.model.BoardUpdateRq;

@Mapper
public interface BoardMapper {
    List<BoardListRs> getBoardList(String ctgrDivCd);

    int insertBoard(BoardCreateRq rq);

    BoardDetailRs getBoardDetail(int boardSno);

    int updateBoard(BoardUpdateRq rq);

    int deleteBoard(int boardSno);

    List<BoardCtgrRs> getBoardCtgrList();

    int updateViews(int boardSno);
}
