package net.lightwing.mediweb.dao;

import java.util.List;
import net.lightwing.mediweb.pojo.MBanner;
import net.lightwing.mediweb.pojo.MBannerExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MBannerDao {
    long countByExample(MBannerExample example);

    int deleteByExample(MBannerExample example);

    int deleteByPrimaryKey(Integer bid);

    int insert(MBanner record);

    int insertSelective(MBanner record);

    List<MBanner> selectByExample(MBannerExample example);

    MBanner selectByPrimaryKey(Integer bid);

    int updateByExampleSelective(@Param("record") MBanner record, @Param("example") MBannerExample example);

    int updateByExample(@Param("record") MBanner record, @Param("example") MBannerExample example);

    int updateByPrimaryKeySelective(MBanner record);

    int updateByPrimaryKey(MBanner record);
}