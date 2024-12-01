package com.fiber.service;

import com.github.pagehelper.PageInfo;
import com.fiber.entity.CustomerDetForm;
import com.fiber.entity.CustomerListForm;

import java.util.List;

public interface CustomerService {
    PageInfo<CustomerListForm> customerList(CustomerListForm params);
    List<CustomerDetForm> customerDet(Long customerId);
    void customerSave(CustomerDetForm params);
    void customerDel(Long customerId);
}
