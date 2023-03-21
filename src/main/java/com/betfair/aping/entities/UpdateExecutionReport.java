package com.betfair.aping.entities;

import java.util.List;

import com.betfair.aping.enums.ExecutionReportErrorCode;
import com.betfair.aping.enums.ExecutionReportStatus;

public class UpdateExecutionReport {
	
	String customRef,marketId;
	ExecutionReportStatus status;
	ExecutionReportErrorCode errorCode;
	List<UpdateInstructionReport> instructionReports;
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
	public ExecutionReportErrorCode getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(ExecutionReportErrorCode errorCode) {
		this.errorCode = errorCode;
	}
	public List<UpdateInstructionReport> getInstructionReports() {
		return instructionReports;
	}
	public void setInstructionReports(List<UpdateInstructionReport> instructionReports) {
		this.instructionReports = instructionReports;
	}

}
