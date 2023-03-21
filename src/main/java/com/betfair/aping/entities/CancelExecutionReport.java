package com.betfair.aping.entities;

import java.util.List;

import com.betfair.aping.enums.ExecutionReportErrorCode;
import com.betfair.aping.enums.ExecutionReportStatus;

public class CancelExecutionReport {

	private String customRef, marketId;
	private ExecutionReportStatus status;
	private ExecutionReportErrorCode erroCode;
	private List<CancelInstructionReport> instructionReports;
	public String getCustomRef() {
		return customRef;
	}
	public void setCustomRef(String customRef) {
		this.customRef = customRef;
	}
	public String getMarketId() {
		return marketId;
	}
	public void setMarketId(String marketId) {
		this.marketId = marketId;
	}
	public ExecutionReportStatus getStatus() {
		return status;
	}
	public void setStatus(ExecutionReportStatus status) {
		this.status = status;
	}
	public ExecutionReportErrorCode getErroCode() {
		return erroCode;
	}
	public void setErroCode(ExecutionReportErrorCode erroCode) {
		this.erroCode = erroCode;
	}
	public List<CancelInstructionReport> getInstructionReports() {
		return instructionReports;
	}
	public void setInstructionReports(List<CancelInstructionReport> instructionReports) {
		this.instructionReports = instructionReports;
	}
	
}
