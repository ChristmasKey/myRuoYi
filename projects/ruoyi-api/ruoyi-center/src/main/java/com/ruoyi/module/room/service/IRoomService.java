package com.ruoyi.module.room.service;

import com.ruoyi.module.room.domain.Room;

public interface IRoomService {

    /**
     * 新增房间信息
     *
     * @param room 房间信息
     * @return int
     * @date 2022/10/23 17:34
     */
    int insertRoom(Room room);

    /**
     * 更新房间信息
     *
     * @param room 房间信息
     * @return int
     * @date 2022/10/23 20:54
     */
    int updateRoom(Room room);

    /**
     * 根据房间ID删除房间
     *
     * @param roomId 房间ID
     * @return int
     * @date 2022/10/23 20:54
     */
    int deleteRoomById(Long roomId);

    /**
     * 批量删除房间
     *
     * @param roomIds 需要删除的房间ID
     * @return int
     * @date 2022/10/23 20:55
     */
    int deleteRoomByIds(Long[] roomIds);
}
