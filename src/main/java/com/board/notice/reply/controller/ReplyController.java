package com.board.notice.reply.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.board.notice.reply.model.ReplyCreateRq;
import com.board.notice.reply.model.ReplyListRs;
import com.board.notice.reply.service.ReplyService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping(value= "/reply")
public class ReplyController {
    
    private final ReplyService replyService;

    @GetMapping("/list")
    public ResponseEntity<ReplyListRs> getReplyList(@RequestParam("brdSno") int brdSno) {
        ReplyListRs result = replyService.getReplyList(brdSno);
        return ResponseEntity.ok(result);
    }

    @PostMapping("/create")
    public ResponseEntity<Integer> insertReply(@RequestBody ReplyCreateRq rq) {
        Integer result = replyService.insertReply(rq);
        return ResponseEntity.ok(result);
    }
}
