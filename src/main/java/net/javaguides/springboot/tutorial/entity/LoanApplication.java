/*************************************************************************
* 
* SATIN CREDITCARE NETWORK LIMITED CONFIDENTIAL
* __________________
* 
*  [2018] SATIN CREDITCARE NETWORK LIMITED
*  All Rights Reserved.
* 
* NOTICE:  All information contained herein is, and remains the property of SATIN CREDITCARE NETWORK LIMITED, and
* The intellectual and technical concepts contained herein are proprietary to SATIN CREDITCARE NETWORK LIMITED
* and may be covered by India and Foreign Patents, patents in process, and are protected by trade secret or copyright law.
* Dissemination of this information or reproduction of this material is strictly forbidden unless prior written permission
* is obtained from SATIN CREDITCARE NETWORK LIMITED.
*/

package net.javaguides.springboot.tutorial.entity;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "loan_application")
public class LoanApplication {

	@Id
	@Column(name = "LOAN_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long loanId;

	@Column(name = "USER_ID")
	private Long userId;

	@Column(name = "APPLICATION_AMT", length = 15)
	private BigDecimal applicationAmt;

	@Column(name = "TENURE", length = 3)
	private Integer tenure;

	@Column(name = "LOAN_PURPOSE", length = 15)
	private String loanPurpose;
	
	@Column(name = "EMPLOYMENT_TYPE")
	@Enumerated(EnumType.STRING)
	private EmploymentType employmentType;
	
	@Column(name = "APPLICATION_STATUS")
	@Enumerated(EnumType.STRING)
	private StatusType applicationStatus;

	@Enumerated(EnumType.STRING)
	@Column(name = "COMPLETED_STAGE")
	private StageType completedStage;


	@Column(name = "LMS_STATUS")
	private String lmsStatus;

	@Column(name = "CREATED_BY")
	private String createdBy;

	@Column(name = "MODIFIED_BY")
	private String modifiedBy;

	@Column(name = "ACCEPT_STATUS")
	private String acceptStatus;

	@Column(name = "EMI_DEDUCTION_DAY")
	private Integer emideductionday;

	@Column(name = "REJECT_REASON")
	private String rejectReason;

	@Column(name = "DISBURSED_DATE")
	private LocalDate disbursedDate;

	@Column(name = "DESCRIPTION")
	private String description;

	@Column(name = "OFFER_LETTER")
	private String offerLetter;

	@Column(name = "AMT_TRANSACTION_STATUS")
	private String amtTransactionStatus;

	@Column(name = "referral_code")
	private String referralCode;

	@Column(name = "due_amount")
	private BigDecimal dueAmount;

	@Column(name = "due_date")
	private Date dueDate;

	@Column(name = "un_setteled_balance")
	private BigDecimal unsetteledBalance;

	@Column(name = "SANCTION_AMT")
	private BigDecimal sanctionAmt;

	@Column(name = "sanction_tenure")
	private Integer sanctionTenure;

	@Column(name = "accepted_tenure")
	private Integer acceptedTenure;

	@Column(name = "accepted_amount")
	private BigDecimal acceptedAmount;

	@Column(name = "processing_fee")
	private BigDecimal processingFee;

	@Column(name = "processing_fee_gst")
	private BigDecimal processingFeeGst;

	@Column(name = "insurance_charge")
	private BigDecimal insuranceCharge;

	@Column(name = "insurance_gst_charge")
	private BigDecimal insuranceGstCharge;

	@Column(name = "rate_of_interest")
	private BigDecimal rateOfInterest;

	@Column(name = "cash_back")
	private Integer cashBack;

	@Column(name = "eir_rate")
	private Integer eirRate;

	@Column(name = "penalty_charges")
	private Integer penaltyCharges;

	@Column(name = "broken_interest")
	private BigDecimal brokenInterest;

	@Column(name = "per_day_penalty")
	private BigDecimal perDayPenalty;

	@Column(name = "forclosure_rate")
	private BigDecimal forclosureRate;

	@Column(name = "emi")
	private BigDecimal emi;

	@Column(name = "login_fee")
	private BigDecimal loginFee;

	@Column(name = "total_interest")
	private BigDecimal totalInterest;



	public Long getLoanId() {
		return loanId;
	}

	public void setLoanId(Long loanId) {
		this.loanId = loanId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public BigDecimal getApplicationAmt() {
		return applicationAmt;
	}

	public void setApplicationAmt(BigDecimal applicationAmt) {
		this.applicationAmt = applicationAmt;
	}

	public Integer getTenure() {
		return tenure;
	}

	public void setTenure(Integer tenure) {
		this.tenure = tenure;
	}

	public String getLoanPurpose() {
		return loanPurpose;
	}

	public void setLoanPurpose(String loanPurpose) {
		this.loanPurpose = loanPurpose;
	}
	
	public EmploymentType getEmploymentType() {
		return employmentType;
	}

	public void setEmploymentType(EmploymentType employmentType) {
		this.employmentType = employmentType;
	}
	

	public StatusType getApplicationStatus() {
		return applicationStatus;
	}

	public void setApplicationStatus(StatusType applicationStatus) {
		this.applicationStatus = applicationStatus;
	}

	public StageType getCompletedStage() {
		return completedStage;
	}

	public void setCompletedStage(StageType completedStage) {
		this.completedStage = completedStage;
	}

	public String getLmsStatus() {
		return lmsStatus;
	}

	public void setLmsStatus(String lmsStatus) {
		this.lmsStatus = lmsStatus;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public String getAcceptStatus() {
		return acceptStatus;
	}

	public void setAcceptStatus(String acceptStatus) {
		this.acceptStatus = acceptStatus;
	}

	public Integer getEmideductionday() {
		return emideductionday;
	}

	public void setEmideductionday(Integer emideductionday) {
		this.emideductionday = emideductionday;
	}

	public String getRejectReason() {
		return rejectReason;
	}

	public void setRejectReason(String rejectReason) {
		this.rejectReason = rejectReason;
	}

	public LocalDate getDisbursedDate() {
		return disbursedDate;
	}

	public void setDisbursedDate(LocalDate disbursedDate) {
		this.disbursedDate = disbursedDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getOfferLetter() {
		return offerLetter;
	}

	public void setOfferLetter(String offerLetter) {
		this.offerLetter = offerLetter;
	}

	public String getAmtTransactionStatus() {
		return amtTransactionStatus;
	}

	public void setAmtTransactionStatus(String amtTransactionStatus) {
		this.amtTransactionStatus = amtTransactionStatus;
	}

	public String getReferralCode() {
		return referralCode;
	}

	public void setReferralCode(String referralCode) {
		this.referralCode = referralCode;
	}

	public BigDecimal getDueAmount() {
		return dueAmount;
	}

	public void setDueAmount(BigDecimal dueAmount) {
		this.dueAmount = dueAmount;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public BigDecimal getUnsetteledBalance() {
		return unsetteledBalance;
	}

	public void setUnsetteledBalance(BigDecimal unsetteledBalance) {
		this.unsetteledBalance = unsetteledBalance;
	}

	public BigDecimal getSanctionAmt() {
		return sanctionAmt;
	}

	public void setSanctionAmt(BigDecimal sanctionAmt) {
		this.sanctionAmt = sanctionAmt;
	}

	public Integer getSanctionTenure() {
		return sanctionTenure;
	}

	public void setSanctionTenure(Integer sanctionTenure) {
		this.sanctionTenure = sanctionTenure;
	}

	public Integer getAcceptedTenure() {
		return acceptedTenure;
	}

	public void setAcceptedTenure(Integer acceptedTenure) {
		this.acceptedTenure = acceptedTenure;
	}

	public BigDecimal getAcceptedAmount() {
		return acceptedAmount;
	}

	public void setAcceptedAmount(BigDecimal acceptedAmount) {
		this.acceptedAmount = acceptedAmount;
	}

	public BigDecimal getProcessingFee() {
		return processingFee;
	}

	public void setProcessingFee(BigDecimal processingFee) {
		this.processingFee = processingFee;
	}

	public BigDecimal getProcessingFeeGst() {
		return processingFeeGst;
	}

	public void setProcessingFeeGst(BigDecimal processingFeeGst) {
		this.processingFeeGst = processingFeeGst;
	}

	public BigDecimal getInsuranceCharge() {
		return insuranceCharge;
	}

	public void setInsuranceCharge(BigDecimal insuranceCharge) {
		this.insuranceCharge = insuranceCharge;
	}

	public BigDecimal getInsuranceGstCharge() {
		return insuranceGstCharge;
	}

	public void setInsuranceGstCharge(BigDecimal insuranceGstCharge) {
		this.insuranceGstCharge = insuranceGstCharge;
	}

	public BigDecimal getRateOfInterest() {
		return rateOfInterest;
	}

	public void setRateOfInterest(BigDecimal rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}

	public Integer getCashBack() {
		return cashBack;
	}

	public void setCashBack(Integer cashBack) {
		this.cashBack = cashBack;
	}

	public Integer getEirRate() {
		return eirRate;
	}

	public void setEirRate(Integer eirRate) {
		this.eirRate = eirRate;
	}

	public Integer getPenaltyCharges() {
		return penaltyCharges;
	}

	public void setPenaltyCharges(Integer penaltyCharges) {
		this.penaltyCharges = penaltyCharges;
	}

	public BigDecimal getBrokenInterest() {
		return brokenInterest;
	}

	public void setBrokenInterest(BigDecimal brokenInterest) {
		this.brokenInterest = brokenInterest;
	}

	public BigDecimal getPerDayPenalty() {
		return perDayPenalty;
	}

	public void setPerDayPenalty(BigDecimal perDayPenalty) {
		this.perDayPenalty = perDayPenalty;
	}

	public BigDecimal getForclosureRate() {
		return forclosureRate;
	}

	public void setForclosureRate(BigDecimal forclosureRate) {
		this.forclosureRate = forclosureRate;
	}

	public BigDecimal getEmi() {
		return emi;
	}

	public void setEmi(BigDecimal emi) {
		this.emi = emi;
	}

	public BigDecimal getTotalInterest() {
		return totalInterest;
	}

	public void setTotalInterest(BigDecimal totalInterest) {
		this.totalInterest = totalInterest;
	}

	public BigDecimal getLoginFee() {
		return loginFee;
	}

	public void setLoginFee(BigDecimal loginFee) {
		this.loginFee = loginFee;
	}

}