package com.sam.ats.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sam.ats.Mapper.BoardMapper;

@Service
public class BoardService {
	
	@Autowired
	BoardMapper boardMapper;
	
	public List<Map<String,Object>> selectBoardList(){
        List<Map<String, Object>> resultList = boardMapper.selectBoardList();
        return resultList;
    }
	
}
