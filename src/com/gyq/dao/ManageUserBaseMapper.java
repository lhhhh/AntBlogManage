package com.gyq.dao;

import com.gyq.model.ManageUserBase;
import com.gyq.model.ManageUserBaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ManageUserBaseMapper {
    int countByExample(ManageUserBaseExample example);

    int deleteByExample(ManageUserBaseExample example);

    int deleteByPrimaryKey(Integer userid);

    int insert(ManageUserBase record);

    int insertSelective(ManageUserBase record);

    List<ManageUserBase> selectByExample(ManageUserBaseExample example);

    ManageUserBase selectByPrimaryKey(Integer userid);

    int updateByExampleSelective(@Param("record") ManageUserBase record, @Param("example") ManageUserBaseExample example);

    int updateByExample(@Param("record") ManageUserBase record, @Param("example") ManageUserBaseExample example);

    int updateByPrimaryKeySelective(ManageUserBase record);

    int updateByPrimaryKey(ManageUserBase record);
}