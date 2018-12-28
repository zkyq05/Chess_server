package com.zkyq.chinesechess.controller;

import com.zkyq.chinesechess.ai.AI;
import com.zkyq.chinesechess.ai.Chess;
import com.zkyq.chinesechess.ai.node;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.OutputStreamWriter;

@RestController
public class ApiController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
    @RequestMapping("/chess")
    public String chess(String chess){
        AI m_AI = new AI();
        int[] board = Chess.str_to_vec(chess);
        m_AI.m_print(board);
        node root = m_AI.a_b(board, 4);
        board[root.to] = board[root.from];
        board[root.from] = 0;
        System.out.println("返回结果");
        m_AI.m_print(board);

        return Chess.vec_to_str(board);
    }
}
