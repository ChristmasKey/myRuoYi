package com.ruoyi.module.room.domain;

import com.ruoyi.common.core.domain.BaseEntity;
import lombok.*;
import lombok.experimental.Accessors;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class Room extends BaseEntity {

    /**
     * 房间ID
     */
    private Long id;

    /**
     * 房间号
     */
    private String num;

    /**
     * 所在楼层号
     */
    private Integer floorNum;

    /**
     * 面积
     */
    private Float area;

    /**
     * 类型
     */
    private String type;

    /**
     * 状态
     */
    private String status;

    /**
     * 人数容量
     */
    private Integer capacity;

    /**
     * 租户号
     */
    private Long tenantId;

    /**
     * 乐观锁
     */
    private Integer revision;
}
