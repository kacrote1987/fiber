package com.fiber.mapper;

import com.fiber.entity.CustomerDetForm;
import com.fiber.entity.CustomerListForm;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CustomerMapper {
    List<CustomerListForm> customerList(@Param("params") CustomerListForm params);
    List<CustomerDetForm> customerDet(Long customerId);
    boolean insertCustomer(@Param("params") CustomerDetForm params);
    boolean updateCustomer(@Param("params") CustomerDetForm params);
    boolean deleteCustomer(Long customerId);
}
