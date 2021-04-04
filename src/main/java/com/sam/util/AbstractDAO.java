/*
 * package com.sam.util;
 * 
 * 
 * import java.util.List;
 * 
 * import org.apache.ibatis.session.ExecutorType; import
 * org.apache.ibatis.session.SqlSession; import
 * org.apache.logging.log4j.LogManager; import org.apache.logging.log4j.Logger;
 * import org.mybatis.spring.SqlSessionTemplate; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.beans.factory.annotation.Value; import
 * org.springframework.transaction.annotation.Transactional;
 * 
 * public class AbstractDAO {
 * 
 * private final Logger logger = LogManager.getLogger(AbstractDAO.class);
 * 
 * @Autowired private SqlSessionTemplate sqlSession;
 * 
 * @Value("${platform.database.commitinterfal}") private int limitSize;
 * 
 *//**
	 * SqlSessionTemplate.queryId log(DEBUG)
	 * 
	 * @author admin
	 * @since 2019. 8. 5.
	 * @MethodName insert
	 * @param
	 * @return int
	 */
/*
 * protected void printQueryId(String queryId) { if(logger.isDebugEnabled()){
 * logger.debug("\t QueryId  \t:  " + queryId); } }
 * 
 *//**
	 * SqlSessionTemplate.inert 구현체
	 * 
	 * @author admin
	 * @since 2019. 8. 5.
	 * @MethodName insert
	 * @param
	 * @return int
	 */
/*
 * public int insert(String queryId, Object params) throws Exception { //
 * printQueryId(queryId); return sqlSession.insert(queryId, params); }
 * 
 *//**
	 * SqlSessionTemplate.update
	 * 
	 * @author admin
	 * @since 2019. 8. 5.
	 * @MethodName update
	 * @param
	 * @return int
	 */
/*
 * public int update(String queryId, Object params){ // printQueryId(queryId);
 * return sqlSession.update(queryId, params); }
 * 
 *//**
	 * SqlSessionTemplate.delete
	 * 
	 * @author admin
	 * @since 2019. 8. 5.
	 * @MethodName delete
	 * @param
	 * @return int
	 */
/*
 * public int delete(String queryId, Object params){ // printQueryId(queryId);
 * return sqlSession.delete(queryId, params); }
 * 
 *//**
	 * SqlSessionTemplate.select one
	 * 
	 * @author admin
	 * @since 2019. 8. 5.
	 * @MethodName selectOne
	 * @param
	 * @return Object
	 */
/*
 * public Object selectOne(String queryId){ // printQueryId(queryId); return
 * sqlSession.selectOne(queryId); }
 * 
 *//**
	 * SqlSessionTemplate.select one with param
	 * 
	 * @author admin
	 * @since 2019. 8. 5.
	 * @MethodName selectOne
	 * @param
	 * @return Object
	 */
/*
 * public Object selectOne(String queryId, Object params){ //
 * printQueryId(queryId); return sqlSession.selectOne(queryId, params); }
 * 
 *//**
	 * SqlSessionTemplate.select List
	 * 
	 * @author admin
	 * @since 2019. 8. 5.
	 * @MethodName selectList
	 * @param
	 * @return List
	 */
/*
 * @SuppressWarnings("rawtypes") public List selectList(String queryId){ //
 * printQueryId(queryId); return sqlSession.selectList(queryId); }
 * 
 *//**
	 * SqlSessionTemplate.select List by param
	 * 
	 * @author admin
	 * @since 2019. 8. 5.
	 * @MethodName selectList
	 * @param
	 * @return List
	 */
/*
 * @SuppressWarnings("rawtypes") public List selectList(String queryId, Object
 * params){ // printQueryId(queryId);
 * 
 * return sqlSession.selectList(queryId,params); }
 * 
 *//**
	 * SqlSessionTemplate.insert for List
	 * 
	 * @author admin
	 * @since 2019. 8. 5.
	 * @MethodName insertList
	 * @param
	 * @return void
	 */
/*
 * @SuppressWarnings("rawtypes") public void insertList(String queryId, List
 * list,int paramInterfal) {
 * 
 * int commitInterval = paramInterfal; if(commitInterval == 0 ) commitInterval =
 * this.limitSize; insertBatch(queryId,list,commitInterval); }
 * 
 *//**
	 * SqlSessionTemplate.insert for List
	 * 
	 * @author admin
	 * @since 2019. 8. 5.
	 * @MethodName insertList
	 * @param
	 * @return void
	 */
/*
 * @SuppressWarnings("rawtypes") public void insertList(String queryId, List
 * list) { insertBatch(queryId,list,limitSize); }
 * 
 *//**
	 * SqlSessionTemplate.insert for List
	 * 
	 * @author admin
	 * @since 2019. 8. 5.
	 * @MethodName insertList
	 * @param
	 * @return void
	 */
/*
 * @SuppressWarnings("rawtypes")
 * 
 * @Transactional private void insertBatch(String queryId, List list,int
 * commitInterval) { SqlSession batchSqlSession =
 * sqlSession.getSqlSessionFactory().openSession(ExecutorType.BATCH); try { int
 * batCnt = 0; for (Object row : list) { batCnt ++;
 * batchSqlSession.insert(queryId, row); if(batCnt % commitInterval == 0) {
 * batchSqlSession.flushStatements(); batchSqlSession.commit(); batCnt = 0; } }
 * 
 * } finally { //if(list != null)
 * DaemonLog.WriteLine(" CoreDAO insertBatch Result  >> "+ + list.size());
 * batchSqlSession.flushStatements(); batchSqlSession.commit();
 * batchSqlSession.close(); } }
 * 
 *//**
	 * SqlSessionTemplate.update for List
	 * 
	 * @author admin
	 * @since 2019. 8. 5.
	 * @MethodName updateBatch
	 * @param
	 * @return void
	 */
/*
 * @SuppressWarnings("rawtypes") public void updateList(String queryId, List
 * list,int paramInterfal) {
 * 
 * int commitInterval = paramInterfal; if(commitInterval == 0 ) commitInterval =
 * this.limitSize; updateBatch(queryId,list,commitInterval); }
 * 
 *//**
	 * SqlSessionTemplate.update for List
	 * 
	 * @author admin
	 * @since 2019. 8. 5.
	 * @MethodName updateBatch
	 * @param
	 * @return void
	 */
/*
 * @SuppressWarnings("rawtypes") public void updateList(String queryId, List
 * list) { updateBatch(queryId,list,limitSize); }
 * 
 * 
 *//**
	 * SqlSessionTemplate.update for List
	 * 
	 * @author admin
	 * @since 2019. 8. 5.
	 * @MethodName updateBatch
	 * @param
	 * @return void
	 *//*
		 * @SuppressWarnings("rawtypes")
		 * 
		 * @Transactional private void updateBatch(String queryId, List list,int
		 * commitInterval) { SqlSession batchSqlSession =
		 * sqlSession.getSqlSessionFactory().openSession(ExecutorType.BATCH); try { int
		 * batCnt = 0; for (Object row : list) { batCnt ++;
		 * batchSqlSession.update(queryId, row); if(batCnt % commitInterval == 0) {
		 * batchSqlSession.flushStatements(); batchSqlSession.commit(); batCnt = 0; } }
		 * 
		 * } finally { //if(list != null)
		 * DaemonLog.WriteLine(" CoreDAO insertBatch Result  >> "+ + list.size());
		 * batchSqlSession.flushStatements(); batchSqlSession.commit();
		 * batchSqlSession.close(); } } }
		 */