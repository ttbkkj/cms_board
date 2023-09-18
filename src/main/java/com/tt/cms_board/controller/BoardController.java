package com.tt.cms_board.controller;

import com.tt.cms_board.model.Board;
import com.tt.cms_board.service.BoardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Please explain the class!!
 *
 * @author : TTB KKJ
 * @fileName : BoardController
 * @since : 2023-09-15
 */
@RequestMapping(value="/board")
@RestController
@Slf4j
public class BoardController {

    private final BoardService boardService;

    @Autowired
    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    @GetMapping("/")
    public List<Board> getAllBoards() {
        return boardService.getAllBoards();
    }

    @GetMapping("/{id}")
    public Board getBoardById(@PathVariable Long id) {
        return boardService.getBoardById(id);
    }

    @PostMapping("/save")
    public void saveBoard(@RequestBody Board board, @RequestParam("kk") String kk) {

        boardService.save(board);
    }

}
