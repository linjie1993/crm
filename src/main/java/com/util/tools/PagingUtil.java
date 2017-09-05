package com.util.tools;

import java.util.List;

/**
 * 分页工具类
 * 
 * @author Jie
 *
 */
public class PagingUtil {
	private Integer currentPage;// 当前页
	private Integer pageSize;// 页面显示条数
	private Integer allCount;// 总记录数
	// 最大页码
	@SuppressWarnings("unused")
	private Integer maxPage;// 最大页码
	private List<Object> data;// 封装数据

	public PagingUtil() {
	}

	public PagingUtil(Integer currentPage, Integer pageSize, Integer allCount, Integer maxPage, List<Object> data) {
		super();
		this.currentPage = currentPage;
		this.pageSize = pageSize;
		this.allCount = allCount;
		this.maxPage = maxPage;
		this.data = data;
	}

	public Integer getMaxPage() {
		return maxPage = (this.allCount % this.pageSize == 0) ? (this.allCount / this.pageSize)
				: (this.allCount / this.pageSize + 1);
	}

	public void setMaxPage(Integer maxPage) {
		this.maxPage = maxPage;
	}

	public Integer getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getAllCount() {
		return allCount;
	}

	public void setAllCount(Integer allCount) {
		this.allCount = allCount;
	}

	public List<Object> getData() {
		return data;
	}

	public void setData(List<Object> data) {
		this.data = data;
	}

}
