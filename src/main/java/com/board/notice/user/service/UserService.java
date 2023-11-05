package com.board.notice.user.service;

import org.springframework.stereotype.Service;

import com.board.notice.user.mapper.UserMapper;
import com.board.notice.user.model.UserJoinRq;
import com.board.notice.user.model.UserLoginRq;
import com.board.notice.user.model.UserLoginRs;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserService {
    private final UserMapper userMapper;

    public int insertUserJoin(UserJoinRq rq) {
        return userMapper.insertUserJoin(rq);
    }

    public boolean anyUserLogin(UserLoginRq rq) {
        boolean account = userMapper.anyUserLogin(rq);
        return account;
    }
}
