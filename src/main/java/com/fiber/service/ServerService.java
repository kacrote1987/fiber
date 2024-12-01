package com.fiber.service;

import com.github.pagehelper.PageInfo;
import com.fiber.entity.*;

import java.util.List;

public interface ServerService {
    PageInfo<ServerListForm> serverList(ServerListForm params);
    List<ServerDetForm> serverDet(Long serverId);
    void serverSave(ServerDetForm params);
    void serverDel(Long customerId);
}
