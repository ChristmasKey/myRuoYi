package com.ruoyi.module.room.mapper;

import com.ruoyi.module.room.domain.Room;

/**
 * Name: RoomMapper
 * Description: 房间表 数据层
 * Copyright: Copyright (c) 2022 MVWCHINA All rights Reserved
 * Company: 江苏医视教育科技发展有限公司
 *
 * @author 丁佳男
 * @version 1.0
 * @since 2022/10/23 18:27
 */
public interface RoomMapper {

    /**
     * 新增房间信息
     *
     * @param room 房间信息
     * @return int
     * @date 2022/10/23 17:59
     */
    int insertRoom(Room room);

    /**
     * 更新房间信息
     *
     * @param room 房间信息
     * @return int
     * @date 2022/10/23 18:37
     */
    int updateRoom(Room room);

    /**
     * 通过房间ID删除房间
     *
     * @param id 房间ID
     * @return int
     * @date 2022/10/23 19:44
     */
    int deleteRoomById(Long id);

    /**
     * 批量删除房间信息
     *
     * @param ids 需要删除的房间ID
     * @return int
     * @date 2022/10/23 19:45
     */
    int deleteRoomByIds(Long[] ids);
}
