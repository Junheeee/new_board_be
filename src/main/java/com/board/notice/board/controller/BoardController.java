package com.board.notice.board.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.board.notice.board.model.BoardCreateRq;
import com.board.notice.board.model.BoardCtgrRs;
import com.board.notice.board.model.BoardDetailRs;
import com.board.notice.board.model.BoardListRs;
import com.board.notice.board.model.BoardUpdateRq;
import com.board.notice.board.service.BoardService;

import lombok.RequiredArgsConstructor;

/**
 * BoardController
 */
@RestController
@RequiredArgsConstructor
@RequestMapping(value= "/board")
public class BoardController {

    private final BoardService boardService;
    
    @GetMapping("/list")
    public ResponseEntity<List<BoardListRs>> getBoardList(@RequestParam("ctgrDivCd") String ctgrDivCd) {
        List<BoardListRs> list = boardService.getBoardList(ctgrDivCd);

        return ResponseEntity.ok(list);
    }

    @PostMapping("/create")
    public ResponseEntity<Integer> insertBoard(@RequestBody BoardCreateRq rq) {
        Integer result = boardService.insertBoard(rq);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/detail")
    public ResponseEntity<BoardDetailRs> getBoardDetail(@RequestParam("brdSno") int brdSno) {
        BoardDetailRs detail = boardService.getBoardDetail(brdSno);
        return ResponseEntity.ok(detail);
    }

    @PostMapping("/update")
    public ResponseEntity<Integer> updateBoard(@RequestBody BoardUpdateRq rq) {
        Integer result = boardService.updateBoard(rq);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/delete")
    public ResponseEntity<Integer> deleteBoard(@RequestParam("brdSno") int brdSno) {
        Integer result = boardService.deleteBoard(brdSno);
        return ResponseEntity.ok(result);
    }
    
    @GetMapping("/ctgrList")
    public ResponseEntity<List<BoardCtgrRs>> getBoardCtgrList() {
        List<BoardCtgrRs> list = boardService.getBoardCtgrList();
        return ResponseEntity.ok(list);
    }

    @PostMapping("/updateViews")
    public ResponseEntity<Integer> updateViews(@RequestParam("brdSno") int brdSno) {
        Integer result = boardService.updateViews(brdSno);
        return ResponseEntity.ok(result);
    }
    
}