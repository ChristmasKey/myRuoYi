package com.ruoyi.test.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.test.mapper.TestUserMapper;
import com.ruoyi.test.domain.TestUser;
import com.ruoyi.test.service.ITestUserService;

/**
 * 测试代码自动生成Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-09-25
 */
@Service
public class TestUserServiceImpl implements ITestUserService 
{
    @Autowired
    private TestUserMapper testUserMapper;

    /**
     * 查询测试代码自动生成
     * 
     * @param id 测试代码自动生成主键
     * @return 测试代码自动生成
     */
    @Override
    public TestUser selectTestUserById(Long id)
    {
        return testUserMapper.selectTestUserById(id);
    }

    /**
     * 查询测试代码自动生成列表
     * 
     * @param testUser 测试代码自动生成
     * @return 测试代码自动生成
     */
    @Override
    public List<TestUser> selectTestUserList(TestUser testUser)
    {
        return testUserMapper.selectTestUserList(testUser);
    }

    /**
     * 新增测试代码自动生成
     * 
     * @param testUser 测试代码自动生成
     * @return 结果
     */
    @Override
    public int insertTestUser(TestUser testUser)
    {
        return testUserMapper.insertTestUser(testUser);
    }

    /**
     * 修改测试代码自动生成
     * 
     * @param testUser 测试代码自动生成
     * @return 结果
     */
    @Override
    public int updateTestUser(TestUser testUser)
    {
        return testUserMapper.updateTestUser(testUser);
    }

    /**
     * 批量删除测试代码自动生成
     * 
     * @param ids 需要删除的测试代码自动生成主键
     * @return 结果
     */
    @Override
    public int deleteTestUserByIds(Long[] ids)
    {
        return testUserMapper.deleteTestUserByIds(ids);
    }

    /**
     * 删除测试代码自动生成信息
     * 
     * @param id 测试代码自动生成主键
     * @return 结果
     */
    @Override
    public int deleteTestUserById(Long id)
    {
        return testUserMapper.deleteTestUserById(id);
    }
}
