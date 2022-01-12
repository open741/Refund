package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 退费信息对象 refund_tbl
 * 
 * @author open741
 * @date 2022-01-11
 */
public class SysRefund extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Integer refundId;

    /** 提交日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "提交日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date submissionDate;

    /** 提交批次 */
    @Excel(name = "提交批次")
    private String submitBatch;

    /** 公司名称 */
    @Excel(name = "公司名称")
    private String companyName;

    /** 税号 */
    @Excel(name = "税号")
    private String taxNum;

    /** 所属区域 */
    @Excel(name = "所属区域")
    private String area;

    /** 所属团队 */
    @Excel(name = "所属团队")
    private String team;

    /** 发票代码 */
    @Excel(name = "发票代码")
    private String receiptCode;

    /** 发票号码 */
    @Excel(name = "发票号码")
    private String receiptNum;

    /** 开票日期 */
    @Excel(name = "开票日期")
    private String dealDate;

    /** 公司性质 */
    @Excel(name = "公司性质")
    private String companyType;

    /** 开户行 */
    @Excel(name = "开户行")
    private String bankAddr;

    /** 账户名 */
    @Excel(name = "账户名")
    private String accountName;

    /** 银行账号 */
    @Excel(name = "银行账号")
    private String accountNum;

    /** 红字发票代码 */
    @Excel(name = "红字发票代码")
    private String redCode;

    /** 红字发票号码 */
    @Excel(name = "红字发票号码")
    private String redNum;

    /** 联系人 */
    @Excel(name = "联系人")
    private String contactName;

    /** 联系电话 */
    @Excel(name = "联系电话")
    private String phoneNum;

    /** 退费日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "退费日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date refundDate;

    /** 退费状态 */
    @Excel(name = "退费状态")
    private String refundStatus;

    /** 未退原因 */
    @Excel(name = "未退原因")
    private String failedResult;

    /** 备注 */
    @Excel(name = "备注")
    private String notes;

    public void setRefundId(Integer refundId) 
    {
        this.refundId = refundId;
    }

    public Integer getRefundId() 
    {
        return refundId;
    }
    public void setSubmissionDate(Date submissionDate) 
    {
        this.submissionDate = submissionDate;
    }

    public Date getSubmissionDate() 
    {
        return submissionDate;
    }
    public void setSubmitBatch(String submitBatch) 
    {
        this.submitBatch = submitBatch;
    }

    public String getSubmitBatch() 
    {
        return submitBatch;
    }
    public void setCompanyName(String companyName) 
    {
        this.companyName = companyName;
    }

    public String getCompanyName() 
    {
        return companyName;
    }
    public void setTaxNum(String taxNum) 
    {
        this.taxNum = taxNum;
    }

    public String getTaxNum() 
    {
        return taxNum;
    }
    public void setArea(String area) 
    {
        this.area = area;
    }

    public String getArea() 
    {
        return area;
    }
    public void setTeam(String team) 
    {
        this.team = team;
    }

    public String getTeam() 
    {
        return team;
    }
    public void setReceiptCode(String receiptCode) 
    {
        this.receiptCode = receiptCode;
    }

    public String getReceiptCode() 
    {
        return receiptCode;
    }
    public void setReceiptNum(String receiptNum) 
    {
        this.receiptNum = receiptNum;
    }

    public String getReceiptNum() 
    {
        return receiptNum;
    }
    public void setDealDate(String dealDate) 
    {
        this.dealDate = dealDate;
    }

    public String getDealDate() 
    {
        return dealDate;
    }
    public void setCompanyType(String companyType) 
    {
        this.companyType = companyType;
    }

    public String getCompanyType() 
    {
        return companyType;
    }
    public void setBankAddr(String bankAddr) 
    {
        this.bankAddr = bankAddr;
    }

    public String getBankAddr() 
    {
        return bankAddr;
    }
    public void setAccountName(String accountName) 
    {
        this.accountName = accountName;
    }

    public String getAccountName() 
    {
        return accountName;
    }
    public void setAccountNum(String accountNum) 
    {
        this.accountNum = accountNum;
    }

    public String getAccountNum() 
    {
        return accountNum;
    }
    public void setRedCode(String redCode) 
    {
        this.redCode = redCode;
    }

    public String getRedCode() 
    {
        return redCode;
    }
    public void setRedNum(String redNum) 
    {
        this.redNum = redNum;
    }

    public String getRedNum() 
    {
        return redNum;
    }
    public void setContactName(String contactName) 
    {
        this.contactName = contactName;
    }

    public String getContactName() 
    {
        return contactName;
    }
    public void setPhoneNum(String phoneNum) 
    {
        this.phoneNum = phoneNum;
    }

    public String getPhoneNum() 
    {
        return phoneNum;
    }
    public void setRefundDate(Date refundDate) 
    {
        this.refundDate = refundDate;
    }

    public Date getRefundDate() 
    {
        return refundDate;
    }
    public void setRefundStatus(String refundStatus) 
    {
        this.refundStatus = refundStatus;
    }

    public String getRefundStatus() 
    {
        return refundStatus;
    }
    public void setFailedResult(String failedResult) 
    {
        this.failedResult = failedResult;
    }

    public String getFailedResult() 
    {
        return failedResult;
    }
    public void setNotes(String notes) 
    {
        this.notes = notes;
    }

    public String getNotes() 
    {
        return notes;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("refundId", getRefundId())
            .append("submissionDate", getSubmissionDate())
            .append("submitBatch", getSubmitBatch())
            .append("companyName", getCompanyName())
            .append("taxNum", getTaxNum())
            .append("area", getArea())
            .append("team", getTeam())
            .append("receiptCode", getReceiptCode())
            .append("receiptNum", getReceiptNum())
            .append("dealDate", getDealDate())
            .append("companyType", getCompanyType())
            .append("bankAddr", getBankAddr())
            .append("accountName", getAccountName())
            .append("accountNum", getAccountNum())
            .append("redCode", getRedCode())
            .append("redNum", getRedNum())
            .append("contactName", getContactName())
            .append("phoneNum", getPhoneNum())
            .append("refundDate", getRefundDate())
            .append("refundStatus", getRefundStatus())
            .append("failedResult", getFailedResult())
            .append("notes", getNotes())
            .toString();
    }
}
