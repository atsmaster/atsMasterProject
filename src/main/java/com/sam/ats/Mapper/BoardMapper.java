package com.sam.ats.Mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.sam.ats.dao.AbstractDAO;

@Repository("boardMapper")
public class BoardMapper extends AbstractDAO {    
	
    public List<Map<String, Object>> selectBoardList(){
        return (List<Map<String, Object>>)selectList("sampleMapper.selectBoardList");
    }    
}
