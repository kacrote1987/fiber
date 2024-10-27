package com.idcmis.controller;

import com.github.pagehelper.PageInfo;
import com.idcmis.config.Result;
import com.idcmis.entity.CustomerDetForm;
import com.idcmis.entity.CustomerListForm;
import com.idcmis.service.CustomerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Api(description = "客户管理")
@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Resource
    CustomerService customerService;

    @ApiOperation("客户列表")
    @PostMapping("/customerList")
    public Result customerList(CustomerListForm params){
        PageInfo<CustomerListForm> customerList= customerService.customerList(params);
        return Result.success(customerList);
    }

    @ApiOperation("客户详细")
    @PostMapping("/customerDet")
    public Result customerDet(@RequestBody Long prodId){
        List<CustomerDetForm> customerDet= customerService.customerDet(prodId);
        return Result.success(customerDet);
    }
}
