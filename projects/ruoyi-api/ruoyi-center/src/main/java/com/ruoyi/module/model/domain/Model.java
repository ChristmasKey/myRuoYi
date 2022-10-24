package com.ruoyi.module.model.domain;

import com.ruoyi.module.base.domain.Resource;
import lombok.*;
import lombok.experimental.Accessors;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class Model extends Resource {

    /**
     * 编号
     */
    private String number;

    /**
     * 状态（0：禁用；1：正常/空闲；2：占用；3：维保中；4：其他；）
     */
    private String status;
}
