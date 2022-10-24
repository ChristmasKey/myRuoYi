package com.ruoyi.module.consumable.domain;

import com.ruoyi.module.base.domain.Resource;
import lombok.*;
import lombok.experimental.Accessors;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class Consumable extends Resource {

    /**
     * 批次
     */
    private String batch;

    /**
     * 数量
     */
    private Integer amount;

    /**
     * 采购警戒线
     */
    private Integer warningLine;
}
