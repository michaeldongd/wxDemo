package com.zd.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zd.entity.Area;
import com.zd.service.AreaService;

@RestController
@RequestMapping("/superadmin")
public class AreaController {

	@Autowired
	private AreaService areaService;
	
	@RequestMapping(value="/listArea",method = RequestMethod.GET)
	private Map<String,Object> listArea(){
		Map<String,Object> modelMap = new HashMap<String,Object>();
		List<Area> list = areaService.getAreaList(); 
		modelMap.put("areaList", list);
		return modelMap;
	}
	
	@RequestMapping(value="/getAreaById",method = RequestMethod.GET)
	private Map<String,Object> getAreaById(Integer areaId){
		Map<String,Object> modelMap = new HashMap<String,Object>();
		Area area = areaService.getAreaById(areaId);
		modelMap.put("areaList", area);
		return modelMap;
	}
	
	@RequestMapping(value="/addArea",method = RequestMethod.POST)
	private Map<String,Object> addArea(@RequestBody Area area){
		Map<String,Object> modelMap = new HashMap<String,Object>();
		modelMap.put("success", areaService.addArea(area));
		return modelMap;
	}
	
	@RequestMapping(value="/modifyArea",method = RequestMethod.POST)
	private Map<String,Object> modifyArea(@RequestBody Area area){
		Map<String,Object> modelMap = new HashMap<String,Object>();
		modelMap.put("success", areaService.modifyArea(area));
		return modelMap;
	}
	
	@RequestMapping(value="/removeArea",method = RequestMethod.GET)
	private Map<String,Object> removeArea(Integer areaId){
		Map<String,Object> modelMap = new HashMap<String,Object>();
		modelMap.put("success", areaService.deleteArea(areaId));
		return modelMap;
	}
	
}
