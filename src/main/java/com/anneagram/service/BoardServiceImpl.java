package com.anneagram.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anneagram.dao.BoardDAO;
import com.anneagram.vo.BoardVO;

@Service
public class BoardServiceImpl implements BoardService{

	@Autowired
	private BoardDAO boardDAO;

	@Override
	public void insertBoard(BoardVO bo) {
		boardDAO.insertBoard(bo);
	}

	@Override
	public List<BoardVO> selectList(BoardVO bo) {
		return boardDAO.selectList(bo);
	}

	@Override
	public BoardVO selectboard(int bno) {
		return boardDAO.selectboard(bno);
	}

	@Override
	public void boardUpdate(BoardVO b) {
		boardDAO.boardUpdate(b);
	}

	@Override
	public void boardDelete(int bno) {
		boardDAO.boardDelete(bno);
	}

	@Override
	public List<BoardVO> boardCount() {
		return boardDAO.boardCount();
	}
}
