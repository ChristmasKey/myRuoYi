package com.ruoyi.test.service;

import java.util.List;
import com.ruoyi.test.domain.TestUser;

/**
 * 测试代码自动生成Service接口
 * 
 * @author ruoyi
 * @date 2022-09-25
 */
public interface ITestUserService 
{
    /**
     * 查询测试代码自动生成
     * 
     * @param id 测试代码自动生成主键
     * @return 测试代码自动生成
     */
    public TestUser selectTestUserById(Long id);

    /**
     * 查询测试代码自动生成列表
     * 
     * @param testUser 测试代码自动生成
     * @return 测试代码自动生成集合
     */
    public List<TestUser> selectTestUserList(TestUser testUser);

    /**
     * 新增测试代码自动生成
     * 
     * @param testUser 测试代码自动生成
     * @return 结果
     */
    public int insertTestUser(TestUser testUser);

    /**
     * 修改测试代码自动生成
     * 
     * @param testUser 测试代码自动生成
     * @return 结果
     */
    public int updateTestUser(TestUser testUser);

    /**
     * 批量删除测试代码自动生成
     * 
     * @param ids 需要删除的测试代码自动生成主键集合
     * @return 结果
     */
    public int deleteTestUserByIds(Long[] ids);

    /**
     * 删除测试代码自动生成信息
     * 
     * @param id 测试代码自动生成主键
     * @return 结果
     */
    public int deleteTestUserById(Long id);
}
