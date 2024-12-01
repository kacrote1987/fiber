package com.fiber.controller;

import com.github.pagehelper.PageInfo;
import com.fiber.config.Result;
import com.fiber.entity.CustomerDetForm;
import com.fiber.entity.CustomerListForm;
import com.fiber.service.CustomerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Api(description = "套管仓库")
@RestController
@RequestMapping("/pipe")
public class PipeController {
    @Resource
    CustomerService customerService;

    @ApiOperation("套管列表")
    @PostMapping("/pipeList")
    public Result customerList(CustomerListForm params){
        PageInfo<CustomerListForm> customerList= customerService.customerList(params);
        return Result.success(customerList);
    }

    @ApiOperation("套管详细")
    @PostMapping("/pipeDet")
    public Result customerDet(@RequestBody Long customerId){
        List<CustomerDetForm> customerDet= customerService.customerDet(customerId);
        return Result.success(customerDet);
    }

    @ApiOperation("套管保存")
    @PostMapping("/pipeSave")
    public Result customerSave(@RequestBody CustomerDetForm params){
        customerService.customerSave(params);
        return Result.success();
    }

    @ApiOperation("套管删除")
    @PostMapping("/pipeDel")
    public Result customerDel(@RequestParam Long customerId){
        customerService.customerDel(customerId);
        return Result.success();
    }
}
