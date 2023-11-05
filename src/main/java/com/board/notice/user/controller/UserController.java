package com.board.notice.user.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.board.notice.user.model.UserJoinRq;
import com.board.notice.user.model.UserLoginRq;
import com.board.notice.user.model.UserLoginRs;
import com.board.notice.user.service.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/user")
public class UserController {
    
    private final UserService userService;

    @PostMapping("/join")
    public ResponseEntity<Integer> insertUserJoin(@RequestBody UserJoinRq rq) {
        Integer result = userService.insertUserJoin(rq);
        return ResponseEntity.ok(result);
    }

    @PostMapping("/login")
    public ResponseEntity<Boolean> anyUserLogin(@RequestBody UserLoginRq rq) {
        boolean result = userService.anyUserLogin(rq);
        return ResponseEntity.ok(result);
    }
}
