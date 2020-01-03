package com.smi.innothink.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ModeOfSelection")
public class ModeOfSelection {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int selectionId;
	private int selectionMode;
	public int getSelectionId() {
		return selectionId;
	}
	public void setSelectionId(int selectionId) {
		this.selectionId = selectionId;
	}
	public int getSelectionMode() {
		return selectionMode;
	}
	public void setSelectionMode(int selectionMode) {
		this.selectionMode = selectionMode;
	}
}
