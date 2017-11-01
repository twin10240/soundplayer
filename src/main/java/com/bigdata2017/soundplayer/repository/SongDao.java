package com.bigdata2017.soundplayer.repository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bigdata2017.soundplayer.vo.SongVo;

@Repository
public class SongDao {

	@Autowired
	private SqlSession sqlSession;
	
	public int insert(SongVo vo) {
		return sqlSession.insert("song_past.insertsong", vo);
		
	}
	
}
