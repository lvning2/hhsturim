package rebotstudio.hhsturim.mapper;


import org.apache.ibatis.annotations.Param;
import rebotstudio.hhsturim.entity.Place;
import rebotstudio.hhsturim.entity.PlaceExample;

import java.util.List;

public interface PlaceMapper {
    long countByExample(PlaceExample example);

    int deleteByExample(PlaceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Place record);

    int insertSelective(Place record);

    List<Place> selectByExampleWithBLOBs(PlaceExample example);

    List<Place> selectByExample(PlaceExample example);

    Place selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Place record, @Param("example") PlaceExample example);

    int updateByExampleWithBLOBs(@Param("record") Place record, @Param("example") PlaceExample example);

    int updateByExample(@Param("record") Place record, @Param("example") PlaceExample example);

    int updateByPrimaryKeySelective(Place record);

    int updateByPrimaryKeyWithBLOBs(Place record);

    int updateByPrimaryKey(Place record);
}