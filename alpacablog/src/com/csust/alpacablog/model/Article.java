package com.csust.alpacablog.model;

import java.util.Date;
/**
 * 文章表
 * @author hjw
 *
 */
public class Article {
	/**主键，自增*/
	private int id;
	/**文章标题*/
	private String title;
	/**作者用户Id*/
	private int userId;
	/**文章内容*/
	private String content;
	/**点赞数量*/
	private int goodCount;
	/**浏览数量*/
	private int glanceCount;
	/**发表时间*/
	private Date reportTime;
	/**类型Id*/
	private int typeId;
	
	public Article() {
		super();
	}

	public Article(int id, String title, int userId, String content,
			int goodCount, int glanceCount, Date reportTime, int typeId) {
		super();
		this.id = id;
		this.title = title;
		this.userId = userId;
		this.content = content;
		this.goodCount = goodCount;
		this.glanceCount = glanceCount;
		this.reportTime = reportTime;
		this.typeId = typeId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getGoodCount() {
		return goodCount;
	}

	public void setGoodCount(int goodCount) {
		this.goodCount = goodCount;
	}

	public int getGlanceCount() {
		return glanceCount;
	}

	public void setGlanceCount(int glanceCount) {
		this.glanceCount = glanceCount;
	}

	public Date getReportTime() {
		return reportTime;
	}

	public void setReportTime(Date reportTime) {
		this.reportTime = reportTime;
	}

	public int getTypeId() {
		return typeId;
	}

	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}

}
