package com.fiber.controller;

import com.github.pagehelper.PageInfo;
import com.fiber.config.Result;
import com.fiber.entity.*;
import com.fiber.service.ServerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Api(description = "光纤仓库")
@RestController
@RequestMapping("/fiber")
public class FiberController {
    @Resource
    ServerService serverService;

    @ApiOperation("光纤列表")
    @PostMapping("/fiberList")
    public Result serverList(ServerListForm params){
        PageInfo<ServerListForm> serverList= serverService.serverList(params);
        return Result.success(serverList);
    }

    @ApiOperation("服务器详细")
    @PostMapping("/fiberDet")
    public Result serverDet(@RequestBody Long serverId){
        List<ServerDetForm> serverDet= serverService.serverDet(serverId);
        return Result.success(serverDet);
    }

    @ApiOperation("光纤保存")
    @PostMapping("/fiberSave")
    public Result serverSave(@RequestBody ServerDetForm params){
        serverService.serverSave(params);
        return Result.success();
    }

    @ApiOperation("光纤删除")
    @PostMapping("/fiberDel")
    public Result serverDel(@RequestParam Long customerId){
        serverService.serverDel(customerId);
        return Result.success();
    }
}
