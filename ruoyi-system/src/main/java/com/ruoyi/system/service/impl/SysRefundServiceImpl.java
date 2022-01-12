package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysRefundMapper;
import com.ruoyi.system.domain.SysRefund;
import com.ruoyi.system.service.ISysRefundService;
import com.ruoyi.common.core.text.Convert;

/**
 * 退费信息Service业务层处理
 * 
 * @author open741
 * @date 2022-01-11
 */
@Service
public class SysRefundServiceImpl implements ISysRefundService 
{
    @Autowired
    private SysRefundMapper sysRefundMapper;

    /**
     * 查询退费信息
     * 
     * @param refundId 退费信息主键
     * @return 退费信息
     */
    @Override
    public SysRefund selectSysRefundByRefundId(Integer refundId)
    {
        return sysRefundMapper.selectSysRefundByRefundId(refundId);
    }

    /**
     * 查询退费信息列表
     * 
     * @param sysRefund 退费信息
     * @return 退费信息
     */
    @Override
    public List<SysRefund> selectSysRefundList(SysRefund sysRefund)
    {
        return sysRefundMapper.selectSysRefundList(sysRefund);
    }

    /**
     * 新增退费信息
     * 
     * @param sysRefund 退费信息
     * @return 结果
     */
    @Override
    public int insertSysRefund(SysRefund sysRefund)
    {
        return sysRefundMapper.insertSysRefund(sysRefund);
    }

    /**
     * 修改退费信息
     * 
     * @param sysRefund 退费信息
     * @return 结果
     */
    @Override
    public int updateSysRefund(SysRefund sysRefund)
    {
        return sysRefundMapper.updateSysRefund(sysRefund);
    }

    /**
     * 批量删除退费信息
     * 
     * @param refundIds 需要删除的退费信息主键
     * @return 结果
     */
    @Override
    public int deleteSysRefundByRefundIds(String refundIds)
    {
        return sysRefundMapper.deleteSysRefundByRefundIds(Convert.toStrArray(refundIds));
    }

    /**
     * 删除退费信息信息
     * 
     * @param refundId 退费信息主键
     * @return 结果
     */
    @Override
    public int deleteSysRefundByRefundId(Integer refundId)
    {
        return sysRefundMapper.deleteSysRefundByRefundId(refundId);
    }
}
