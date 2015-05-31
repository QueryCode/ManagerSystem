package com.ass.base.model;

import java.util.HashMap;
import java.util.Map;

public class PageQueryModel {
	
	public static final String COUNT_ALL_NAME = "count";
	
	/**
	 * 是否查询所有
	 */
	private boolean queryAll = false;
	
	/**
	 * 是否 计算数量
	 */
	private boolean doCount = true;
	
	/**
	 * 当前页 第一条记录的索引 第一页的第一条记录索引为0
	 */
	private int startPosition = 1;
	
	/**
	 * 一页的记录数
	 */
	private int pageSize = 50;
	
	/**
	 * 要查询的页码
	 */
	private int currentPage = 1;
	
	/**
	 * 按照 某列排序
	 */
	private String sortCol = "";
	
	/**
	 * 排序方式 asc desc
	 */
	private String sortOrder = "";
	
	private Map queryParam = new HashMap();

	public PageQueryModel() {
		super();
	}

	public PageQueryModel(int pageSize, int currentPage, String sortCol,
			String sortOrder) {
		super();
		this.pageSize = pageSize;
		this.currentPage = currentPage;
		this.sortCol = sortCol;
		this.sortOrder = sortOrder;
		
		//初始化的时候设置初始记录的索引
		if(currentPage<1){
			currentPage = 1;
			startPosition = 0;
		}else{
			startPosition = pageSize*(currentPage-1);
		}
	}

	public boolean isQueryAll() {
		return queryAll;
	}

	public void setQueryAll(boolean queryAll) {
		this.queryAll = queryAll;
	}
	
	public String getQueryAll(){
		return String.valueOf(queryAll);
	}

	public boolean isDoCount() {
		return doCount;
	}
	
	public String getDoCount(){
		return String.valueOf(doCount);
	}

	public void setDoCount(boolean doCount) {
		this.doCount = doCount;
	}

	public int getFirstCursorPosition() {
		return startPosition;
	}

	public void setStartPosition(int startPosition) {
		this.startPosition = startPosition;
	}

	public int getLastCursorPosition() {
		return (pageSize+startPosition)-1;
	}
	
	public int getStartPosition(){
		return startPosition;
	}
	
	public int getPageSize(){
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		if(0>=pageSize){
			pageSize = 1;
		}
		this.pageSize = pageSize;
		startPosition = pageSize*(currentPage-1);
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int page) {
		if(page<1){
			currentPage = 1;
			startPosition = 0;
		}else{
			currentPage = page;
			startPosition = pageSize * (page-1);
		}
	}

	public String getSortCol() {
		return sortCol;
	}

	public void setSortCol(String sortCol) {
		this.sortCol = sortCol;
	}

	public String getSortOrder() {
		return sortOrder;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}

	public Map getQueryParam() {
		return queryParam;
	}

	public void setQueryParam(Map queryParam) {
		this.queryParam = queryParam;
	}
	
	public void nextPage(){
		setCurrentPage(getCurrentPage()+1);
	}
	
	public void prePage(){
		setCurrentPage(getCurrentPage()-1);
	}
	
	public void addParameter(Object key,Object value){
		this.queryParam.put(key, value);
	}

}
