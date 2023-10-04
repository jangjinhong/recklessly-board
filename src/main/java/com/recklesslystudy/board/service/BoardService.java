package com.recklesslystudy.board.service;

import com.recklesslystudy.board.entity.Board;
import com.recklesslystudy.board.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {
    @Autowired
    private BoardRepository boardRepository;
    public void write(Board board) {
        boardRepository.save(board);
    }
}
