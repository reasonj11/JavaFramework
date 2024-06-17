package com.rubypaper.persistence; 
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class BoardDAO {
	@Autowired
	private JdbcTemplate spring;
	private final static String BOARD_INSERT=
			"insert into Board (seq, title, writer, count) values(" + "(select nvl(max(seq),0)+1 from board),?,?,?) ";
	private final static String BOARD_LIST
			="select * from board order by seq desc";
	public void insertBoard(Map<String, Object> board) { 
		spring.update(BOARD_INSERT,board.get("title"),
				board.get("writer"), board.get("content"));
	}

	public List<Map<String, Object>> getBoard(){
	return spring.queryForList (BOARD_LIST);
	}
}