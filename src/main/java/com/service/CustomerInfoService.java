package com.service;

import com.domain.CustomerLevel;
import com.domain.Customerinfo;
import com.domain.DictionaryTypeInfo;

import java.util.List;

public interface CustomerInfoService {
    public List<Customerinfo> findAll();
    //获取客户等级
    List<CustomerLevel> getCustomerLevel();
    //获取客户性质
    List<DictionaryTypeInfo> getCustomerProperties();
    //获取客户类型
    List<DictionaryTypeInfo> getCustomerType();
    //获取开户银行
    List<DictionaryTypeInfo> getCustomerOpenBank();
    //获取客户来源
    List<DictionaryTypeInfo> getCustomerSource();
    //查询公司名是否重复
    boolean findCustomerName(String customerName);
    //添加客户
    void saveCustomerInfo(Customerinfo customerInfo);
}
