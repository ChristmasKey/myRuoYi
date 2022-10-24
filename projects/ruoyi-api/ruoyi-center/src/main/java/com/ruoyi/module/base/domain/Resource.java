package com.ruoyi.module.base.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.common.core.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
public class Resource extends BaseEntity {

    /**
     * 资源ID
     */
    private Long id;

    /**
     * 租户号
     */
    private Long tenantId;

    /**
     * 乐观锁
     */
    private Integer revision;

    /**
     * 资源类型
     */
    private String resourceType;

    /**
     * 资源名称
     */
    private String name;

    /**
     * 型号
     */
    private String model;

    /**
     * 购买时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date buyTime;

    /**
     * 基本功能
     */
    private String baseFunction;

    /**
     * 分类标签
     */
    private String category;

    /**
     * 存放地点
     */
    private String location;
}
