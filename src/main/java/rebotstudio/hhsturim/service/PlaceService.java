package rebotstudio.hhsturim.service;

import rebotstudio.hhsturim.entity.Place;

import java.util.List;

public interface PlaceService {

    List getAll();  //获取所有出租的信息

    Place getById(Integer id);  //根据id获取一个出租信息


}
