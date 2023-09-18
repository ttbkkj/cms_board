package com.tt.cms_board.repository;

import com.tt.cms_board.model.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Please explain the class!!
 *
 * @author : TTB KKJ
 * @fileName : BoardRepository
 * @since : 2023-09-15
 */
@Repository
public interface BoardRepository extends JpaRepository<Board, Long> {

}
