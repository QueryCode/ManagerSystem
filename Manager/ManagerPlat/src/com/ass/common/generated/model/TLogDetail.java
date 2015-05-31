package com.ass.common.generated.model;

public class TLogDetail {

	private Long id;
	
	private Long tLogId;

	private String tableName;

	private Long recordId;

	private String fieldName;

	private String fieldOldValue;

	private String fieldNewValue;

	private String comment;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long gettLogId() {
		return tLogId;
	}

	public void settLogId(Long tLogId) {
		this.tLogId = tLogId;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName == null ? null : tableName.trim();
	}


	public Long getRecordId() {
		return recordId;
	}

	public void setRecordId(Long recordId) {
		this.recordId = recordId;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName == null ? null : fieldName.trim();
	}

	public String getFieldOldValue() {
		return fieldOldValue;
	}


	public void setFieldOldValue(String fieldOldValue) {
		this.fieldOldValue = fieldOldValue == null ? null : fieldOldValue
				.trim();
	}

	public String getFieldNewValue() {
		return fieldNewValue;
	}

	public void setFieldNewValue(String fieldNewValue) {
		this.fieldNewValue = fieldNewValue == null ? null : fieldNewValue
				.trim();
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment == null ? null : comment.trim();
	}
}