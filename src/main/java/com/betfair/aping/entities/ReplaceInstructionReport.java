package com.betfair.aping.entities;

import com.betfair.aping.enums.InstructionReportErrorCode;
import com.betfair.aping.enums.InstructionReportStatus;

public class ReplaceInstructionReport {
	
	InstructionReportStatus status;
	InstructionReportErrorCode errorCode;
	CancelInstructionReport cancelInstructionReport;
	PlaceInstructionReport placeInstructionReport;
	public InstructionReportStatus getStatus() {
		return status;
	}
	public void setStatus(InstructionReportStatus status) {
		this.status = status;
	}
	public InstructionReportErrorCode getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(InstructionReportErrorCode errorCode) {
		this.errorCode = errorCode;
	}
	public CancelInstructionReport getCancelInstructionReport() {
		return cancelInstructionReport;
	}
	public void setCancelInstructionReport(CancelInstructionReport cancelInstructionReport) {
		this.cancelInstructionReport = cancelInstructionReport;
	}
	public PlaceInstructionReport getPlaceInstructionReport() {
		return placeInstructionReport;
	}
	public void setPlaceInstructionReport(PlaceInstructionReport placeInstructionReport) {
		this.placeInstructionReport = placeInstructionReport;
	}

}
