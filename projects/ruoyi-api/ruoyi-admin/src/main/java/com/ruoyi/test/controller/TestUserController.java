package com.ruoyi.test.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.test.domain.TestUser;
import com.ruoyi.test.service.ITestUserService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 测试代码自动生成Controller
 * 
 * @author ruoyi
 * @date 2022-09-25
 */
@RestController
@RequestMapping("/test/testUser")
public class TestUserController extends BaseController
{
    @Autowired
    private ITestUserService testUserService;

    /**
     * 查询测试代码自动生成列表
     */
    @PreAuthorize("@ss.hasPermi('test:testUser:list')")
    @GetMapping("/list")
    public TableDataInfo list(TestUser testUser)
    {
        startPage();
        List<TestUser> list = testUserService.selectTestUserList(testUser);
        return getDataTable(list);
    }

    /**
     * 导出测试代码自动生成列表
     */
    @PreAuthorize("@ss.hasPermi('test:testUser:export')")
    @Log(title = "测试代码自动生成", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TestUser testUser)
    {
        List<TestUser> list = testUserService.selectTestUserList(testUser);
        ExcelUtil<TestUser> util = new ExcelUtil<TestUser>(TestUser.class);
        util.exportExcel(response, list, "测试代码自动生成数据");
    }

    /**
     * 获取测试代码自动生成详细信息
     */
    @PreAuthorize("@ss.hasPermi('test:testUser:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(testUserService.selectTestUserById(id));
    }

    /**
     * 新增测试代码自动生成
     */
    @PreAuthorize("@ss.hasPermi('test:testUser:add')")
    @Log(title = "测试代码自动生成", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TestUser testUser)
    {
        return toAjax(testUserService.insertTestUser(testUser));
    }

    /**
     * 修改测试代码自动生成
     */
    @PreAuthorize("@ss.hasPermi('test:testUser:edit')")
    @Log(title = "测试代码自动生成", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TestUser testUser)
    {
        return toAjax(testUserService.updateTestUser(testUser));
    }

    /**
     * 删除测试代码自动生成
     */
    @PreAuthorize("@ss.hasPermi('test:testUser:remove')")
    @Log(title = "测试代码自动生成", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(testUserService.deleteTestUserByIds(ids));
    }
}
