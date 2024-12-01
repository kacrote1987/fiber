package com.fiber.controller;

import com.fiber.config.Result;
import com.fiber.entity.ServerDetForm;
import com.fiber.entity.ServerListForm;
import com.fiber.service.ServerService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Api(description = "规则管理")
@RestController
@RequestMapping("/rule")
public class RuleController {
    @Resource
    ServerService serverService;

    @ApiOperation("规则列表")
    @PostMapping("/ruleList")
    public Result serverList(ServerListForm params){
        PageInfo<ServerListForm> serverList= serverService.serverList(params);
        return Result.success(serverList);
    }

    @ApiOperation("规则详细")
    @PostMapping("/ruleDet")
    public Result serverDet(@RequestBody Long serverId){
        List<ServerDetForm> serverDet= serverService.serverDet(serverId);
        return Result.success(serverDet);
    }

    @ApiOperation("规则保存")
    @PostMapping("/ruleSave")
    public Result serverSave(@RequestBody ServerDetForm params){
        serverService.serverSave(params);
        return Result.success();
    }

    @ApiOperation("规则删除")
    @PostMapping("/ruleDel")
    public Result serverDel(@RequestParam Long customerId){
        serverService.serverDel(customerId);
        return Result.success();
    }
}
