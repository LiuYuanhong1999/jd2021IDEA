package cn.gson.jd2021.model.service.lyh;

import cn.gson.jd2021.model.mapper.lyh.ClReturnVistMapper;
import cn.gson.jd2021.model.mapper.lyh.ClStorageMapper;
import cn.gson.jd2021.model.pojos.ClReturnVist;
import cn.gson.jd2021.model.pojos.ClStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClStorageService {


    @Autowired
    ClReturnVistMapper clReturnVistMapper;

    @Autowired
    ClStorageMapper clStorageMapper;


    //跟表关系字段传值
    public void insert(ClStorage clStorage){
        ClStorage clStorage1=new ClStorage();
        clStorage1.setStorageId(clStorage.getStorageId());
        clStorage1.setFactoryId(clStorage.getFactoryId());
        clStorage1.setBrandId(clStorage.getBrandId());
        clStorage1.setDesignId(clStorage.getDesignId());
        clStorage1.setColorId(clStorage.getColorId());
        clStorage1.setStorageLeaveTime(clStorage.getStorageLeaveTime());
        clStorage1.setStorageVariator(clStorage.getStorageVariator());
        clStorage1.setStorageDisplacement(clStorage.getStorageDisplacement());
        clStorage1.setStorageMileage(clStorage.getStorageMileage());
        clStorage1.setStorageBegain(clStorage.getStorageBegain());
        clStorage1.setStorageCard(clStorage.getStorageCard());
        clStorage1.setStorageType(clStorage.getStorageType());
        clStorage1.setStorageDrive(clStorage.getStorageDrive());
        clStorage1.setStorageEngine(clStorage.getStorageEngine());
        clStorage1.setStorageTap(clStorage.getStorageTap());
        clStorage1.setStorageTransferTimes(clStorage.getStorageTransferTimes());
        clStorage1.setStorageLicense(clStorage.getStorageLicense());
        clStorage1.setStoragePrcie(clStorage.getStoragePrcie());
        clStorage1.setStorageUser(clStorage.getStorageUser());
        clStorage1.setStorageTime(clStorage.getStorageTime());
        clStorageMapper.insert(clStorage1);

    }



    //查询签约的回访单
    public List<ClReturnVist> findByClStorage(){
        return clReturnVistMapper.findByClStorage();
    }

    //根据签约单获取数据
    public List<ClReturnVist> findByClStorage2(String vistId){
        return clReturnVistMapper.findByClStorage2(vistId);
    }




}
