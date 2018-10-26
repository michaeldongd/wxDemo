package com.zd.service;

import java.util.List;

import com.zd.entity.Area;

public interface AreaService {
	List<Area> getAreaList();

	Area getAreaById(int areaId);

	boolean addArea(Area area);

	boolean modifyArea(Area area);

	boolean deleteArea(int areaId);
}
