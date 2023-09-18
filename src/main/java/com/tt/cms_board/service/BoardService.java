package com.tt.cms_board.service;

import com.tt.cms_board.model.Board;
import com.tt.cms_board.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Please explain the class!!
 *
 * @author : TTB KKJ
 * @fileName : BoardService
 * @since : 2023-09-15
 */
@Service
public class BoardService {

    private final BoardRepository boardRepository;

    @Autowired
    public BoardService(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    public List<Board> getAllBoards() {
        return boardRepository.findAll();
    }

    public Board getBoardById(Long id) {
        return boardRepository.findById(id).orElse(null);
    }

    public void save(Board board) {
        boardRepository.save(board);
    }

}
