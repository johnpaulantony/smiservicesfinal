package com.smi.innothink.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;

@Entity
@Table(name="Attendance")
@NamedStoredProcedureQuery(name = "in_and_out_test_attendance", 
procedureName = "sample",
parameters = {
   @StoredProcedureParameter(mode = ParameterMode.IN, name = "inParam", type = String.class),
   @StoredProcedureParameter(mode = ParameterMode.IN, name = "inParam1", type = String.class),
   @StoredProcedureParameter(mode = ParameterMode.IN, name = "outParam1", type = String.class),
   @StoredProcedureParameter(mode = ParameterMode.OUT, name = "outParam2", type = String.class)
})
public class Attendance {
	@Id
	private String attendanceId;
	private String batchId;
	private String studentId;
	private String attendanceDate;
	private boolean forenoonSession;
	private boolean afternoonSession;
	public String getAttendanceId() {
		return attendanceId;
	}
	public void setAttendanceId(String attendanceId) {
		this.attendanceId = attendanceId;
	}
	public String getBatchId() {
		return batchId;
	}
	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getAttendanceDate() {
		return attendanceDate;
	}
	public void setAttendanceDate(String attendanceDate) {
		this.attendanceDate = attendanceDate;
	}
	public boolean isForenoonSession() {
		return forenoonSession;
	}
	public void setForenoonSession(boolean forenoonSession) {
		this.forenoonSession = forenoonSession;
	}
	public boolean isAfternoonSession() {
		return afternoonSession;
	}
	public void setAfternoonSession(boolean afternoonSession) {
		this.afternoonSession = afternoonSession;
	}
	
	
	
}
