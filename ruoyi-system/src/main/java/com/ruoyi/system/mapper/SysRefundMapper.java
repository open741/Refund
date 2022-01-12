package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.SysRefund;

/**
 * 退费信息Mapper接口
 * 
 * @author open741
 * @date 2022-01-11
 */
public interface SysRefundMapper 
{
    /**
     * 查询退费信息
     * 
     * @param refundId 退费信息主键
     * @return 退费信息
     */
    public SysRefund selectSysRefundByRefundId(Integer refundId);

    /**
     * 查询退费信息列表
     * 
     * @param sysRefund 退费信息
     * @return 退费信息集合
     */
    public List<SysRefund> selectSysRefundList(SysRefund sysRefund);

    /**
     * 新增退费信息
     * 
     * @param sysRefund 退费信息
     * @return 结果
     */
    public int insertSysRefund(SysRefund sysRefund);

    /**
     * 修改退费信息
     * 
     * @param sysRefund 退费信息
     * @return 结果
     */
    public int updateSysRefund(SysRefund sysRefund);

    /**
     * 删除退费信息
     * 
     * @param refundId 退费信息主键
     * @return 结果
     */
    public int deleteSysRefundByRefundId(Integer refundId);

    /**
     * 批量删除退费信息
     * 
     * @param refundIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSysRefundByRefundIds(String[] refundIds);
}
