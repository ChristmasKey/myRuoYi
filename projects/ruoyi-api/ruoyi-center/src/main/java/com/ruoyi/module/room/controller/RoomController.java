package com.ruoyi.module.room.controller;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.module.room.domain.Room;
import com.ruoyi.module.room.service.IRoomService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Name: RoomController
 * Description: 房间管理控制器
 * Copyright: Copyright (c) 2022 MVWCHINA All rights Reserved
 * Company: 江苏医视教育科技发展有限公司
 *
 * @author 丁佳男
 * @version 1.0
 * @since 2022/10/21 23:46
 */
@Api("房间管理")
@RestController
@RequestMapping("/center/room")
public class RoomController extends BaseController {

    @Resource
    private IRoomService roomService;

    @ApiOperation("新增房间")
    @PostMapping
    public AjaxResult add(@Validated @RequestBody Room room) {
        //TODO:数据合法性校验
        //TODO:业务合法性校验
        //为新增的房间设置创建人
        room.setCreateBy(getUsername());
        //为新增的房间设置租户号（当前登录账号的部门ID）
        room.setTenantId(getDeptId());
        //插入数据
        return toAjax(roomService.insertRoom(room));
    }

    @ApiOperation("修改房间")
    @PutMapping
    public AjaxResult edit(@Validated @RequestBody Room room) {
        //TODO:数据合法性校验
        //TODO:业务合法性校验
        //为修改的房间设置更新人
        room.setUpdateBy(getUsername());
        //插入数据
        return toAjax(roomService.updateRoom(room));
    }
}
