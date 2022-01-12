package com.ruoyi.web.controller.system;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.SysRefund;
import com.ruoyi.system.service.ISysRefundService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 退费信息Controller
 * 
 * @author open741
 * @date 2022-01-11
 */
@Controller
@RequestMapping("/system/refund")
public class SysRefundController extends BaseController
{
    private String prefix = "system/refund";

    @Autowired
    private ISysRefundService sysRefundService;

    @RequiresPermissions("system:refund:view")
    @GetMapping()
    public String refund()
    {
        return prefix + "/refund";
    }

    /**
     * 查询退费信息列表
     */
    @RequiresPermissions("system:refund:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(SysRefund sysRefund)
    {
        startPage();
        List<SysRefund> list = sysRefundService.selectSysRefundList(sysRefund);
        return getDataTable(list);
    }

    /**
     * 导出退费信息列表
     */
    @RequiresPermissions("system:refund:export")
    @Log(title = "退费信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(SysRefund sysRefund)
    {
        List<SysRefund> list = sysRefundService.selectSysRefundList(sysRefund);
        ExcelUtil<SysRefund> util = new ExcelUtil<SysRefund>(SysRefund.class);
        return util.exportExcel(list, "退费信息数据");
    }

    /**
     * 新增退费信息
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存退费信息
     */
    @RequiresPermissions("system:refund:add")
    @Log(title = "退费信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(SysRefund sysRefund)
    {
        return toAjax(sysRefundService.insertSysRefund(sysRefund));
    }

    /**
     * 修改退费信息
     */
    @RequiresPermissions("system:refund:edit")
    @GetMapping("/edit/{refundId}")
    public String edit(@PathVariable("refundId") Integer refundId, ModelMap mmap)
    {
        SysRefund sysRefund = sysRefundService.selectSysRefundByRefundId(refundId);
        mmap.put("sysRefund", sysRefund);
        return prefix + "/edit";
    }

    /**
     * 修改保存退费信息
     */
    @RequiresPermissions("system:refund:edit")
    @Log(title = "退费信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(SysRefund sysRefund)
    {
        return toAjax(sysRefundService.updateSysRefund(sysRefund));
    }

    /**
     * 删除退费信息
     */
    @RequiresPermissions("system:refund:remove")
    @Log(title = "退费信息", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(sysRefundService.deleteSysRefundByRefundIds(ids));
    }
}
