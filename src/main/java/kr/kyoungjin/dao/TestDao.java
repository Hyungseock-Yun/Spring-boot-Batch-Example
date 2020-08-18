package kr.kyoungjin.dao;

import kr.kyoungjin.vo.TestVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface TestDao {
	public TestVo getTestInfo(TestVo vo) throws Exception;

	public int insertTestInfo(TestVo vo) throws Exception;
}
