package com.csust.alpacablog.model;


import java.util.Date;
/**
 * 评论表
 * @author hjw
 *
 */
public class Comment {
	/**评论Id*/
	private int id;
	/**文章Id*/
	private int articleId;
	/**发表人用户的Id*/
	private int userId;
	/**评论时间*/
	private Date commentTime;
	/**内容*/
	private String content;
	/**评论楼层*/
	private int floor;
	/**回复的对象，以楼层为标准，默认楼主是0楼*/
	private int responseWho;
	
	public Comment() {
		super();
	}
	
	public Comment(int id, int articleId, int userId, Date commentTime,
			String content, int floor, int responseWho) {
		super();
		this.id = id;
		this.articleId = articleId;
		this.userId = userId;
		this.commentTime = commentTime;
		this.content = content;
		this.floor = floor;
		this.responseWho = responseWho;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getArticleId() {
		return articleId;
	}
	public void setArticleId(int articleId) {
		this.articleId = articleId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public Date getCommentTime() {
		return commentTime;
	}
	public void setCommentTime(Date commentTime) {
		this.commentTime = commentTime;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	public int getResponseWho() {
		return responseWho;
	}
	public void setResponseWho(int responseWho) {
		this.responseWho = responseWho;
	}
	
	

}
