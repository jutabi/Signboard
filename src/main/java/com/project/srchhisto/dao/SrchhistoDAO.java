package com.project.srchhisto.dao;

import com.project.member.Member;
import com.project.srchhisto.Srchhisto;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SrchhistoDAO implements ISrchhistoDAO{

    private final SqlSession sqlSession;

    @Autowired
    public SrchhistoDAO(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public int storeInsert(Srchhisto srchhisto) {
        ISrchhistoDAO dao = sqlSession.getMapper(ISrchhistoDAO.class);

        return dao.storeInsert(srchhisto);
    }

    @Override
    public List<Srchhisto> storeSelect(Member member) {
        ISrchhistoDAO dao = sqlSession.getMapper(ISrchhistoDAO.class);

        return dao.storeSelect(member);
    }

    @Override
    public List<Srchhisto> bookmarkedStoreSelect(Member member) {
        ISrchhistoDAO dao = sqlSession.getMapper(ISrchhistoDAO.class);

        return dao.bookmarkedStoreSelect(member);
    }

    @Override
    public int storeBookmark(Srchhisto srchhisto) {
        ISrchhistoDAO dao = sqlSession.getMapper(ISrchhistoDAO.class);

        return dao.storeBookmark(srchhisto);
    }

    @Override
    public int storeUnBookmark(Srchhisto srchhisto) {
        ISrchhistoDAO dao = sqlSession.getMapper(ISrchhistoDAO.class);

        return dao.storeUnBookmark(srchhisto);
    }

    @Override
    public int storeDelete(Srchhisto srchhisto) {
        ISrchhistoDAO dao = sqlSession.getMapper(ISrchhistoDAO.class);

        return dao.storeDelete(srchhisto);
    }
}