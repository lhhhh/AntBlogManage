package com.gyq.dao;

import com.gyq.model.ManageTabInfo;
import com.gyq.model.ManageTabInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ManageTabInfoMapper {
    int countByExample(ManageTabInfoExample example);

    int deleteByExample(ManageTabInfoExample example);

    int deleteByPrimaryKey(Integer tabid);

    int insert(ManageTabInfo record);

    int insertSelective(ManageTabInfo record);

    List<ManageTabInfo> selectByExample(ManageTabInfoExample example);

    ManageTabInfo selectByPrimaryKey(Integer tabid);

    int updateByExampleSelective(@Param("record") ManageTabInfo record, @Param("example") ManageTabInfoExample example);

    int updateByExample(@Param("record") ManageTabInfo record, @Param("example") ManageTabInfoExample example);

    int updateByPrimaryKeySelective(ManageTabInfo record);

    int updateByPrimaryKey(ManageTabInfo record);
}