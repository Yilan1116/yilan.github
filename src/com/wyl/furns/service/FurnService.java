package com.wyl.furns.service;

import com.wyl.furns.entity.Furn;
import com.wyl.furns.entity.Page;

import java.util.List;

public interface FurnService {
    public List<Furn> queryFurns();
    public int addFurn(Furn furn);
    public int deleteFurnById(int id);
    public Furn queryFurnById(int id);
    public int updateFurn(Furn furn);
    public Page<Furn> page(int pageNo,int pageSize);
    public Page<Furn> pageByName(int pageNo,int pageSize,String name);
}
