package com.zd.dao;

import java.util.List;

import com.zd.entity.Area;

public interface AreaDao {

	List<Area> queryArea();

	Area queryAreaById(int areaId);

	int insertArea(Area area);

	int updateArea(Area area);

	int deleteArea(int areaId);
}
