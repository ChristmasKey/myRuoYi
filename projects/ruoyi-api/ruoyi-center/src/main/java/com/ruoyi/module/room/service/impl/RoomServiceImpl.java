package com.ruoyi.module.room.service.impl;

import com.ruoyi.module.room.domain.Room;
import com.ruoyi.module.room.mapper.RoomMapper;
import com.ruoyi.module.room.service.IRoomService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class RoomServiceImpl implements IRoomService {

    @Resource
    private RoomMapper roomMapper;

    /**
     * 新增房间信息
     *
     * @param room 房间信息
     * @return int
     * @date 2022/10/23 17:34
     */
    @Override
    public int insertRoom(Room room) {
        //新增房间信息
        return roomMapper.insertRoom(room);
    }

    /**
     * 更新房间信息
     *
     * @param room 房间信息
     * @return int
     * @date 2022/10/23 20:54
     */
    @Override
    public int updateRoom(Room room) {
        //更新房间信息
        return roomMapper.updateRoom(room);
    }

    /**
     * 根据房间ID删除房间
     *
     * @param roomId 房间ID
     * @return int
     * @date 2022/10/23 20:54
     */
    @Override
    public int deleteRoomById(Long roomId) {
        //删除房间信息
        return roomMapper.deleteRoomById(roomId);
    }

    /**
     * 批量删除房间
     *
     * @param roomIds 需要删除的房间ID
     * @return int
     * @date 2022/10/23 20:55
     */
    @Override
    public int deleteRoomByIds(Long[] roomIds) {
        //批量删除房间信息
        return roomMapper.deleteRoomByIds(roomIds);
    }
}
