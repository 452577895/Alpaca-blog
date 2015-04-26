package com.csust.alpacablog.model;

import java.util.Date;

/**
 * 用户表
 * @author hjw
 *
 */

public class User {
	/**主键，自增*/
	private int id;
	/**用户名*/
	private String username;
	/**密码*/
	private String password;
	/**昵称*/
	private String nickname;
	/**性别*/
	private String sex;
	/**生日*/
	private Date borthday;
	/**个人介绍*/
	private String introduce;
	/**积分*/
	private int integral;
	/**邮箱*/
	private String e_mail;
	/**QQ*/
	private String qq;
	/**github地址*/
	private String git_address;
	/**行业*/
	private String trade;
	/**职位*/
	private String position;
	/**籍贯*/
	private String province;
	/**资料完善度*/
	private double data_integrity;
	
	
	
	public User() {
		super();
	}

	public User(int id, String username, String password, String nickname,
			String sex, Date borthday, String introduce, int integral,
			String e_mail, String qq, String git_address, String trade,
			String position, String province, double data_integrity) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.nickname = nickname;
		this.sex = sex;
		this.borthday = borthday;
		this.introduce = introduce;
		this.integral = integral;
		this.e_mail = e_mail;
		this.qq = qq;
		this.git_address = git_address;
		this.trade = trade;
		this.position = position;
		this.province = province;
		this.data_integrity = data_integrity;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Date getBorthday() {
		return borthday;
	}
	public void setBorthday(Date borthday) {
		this.borthday = borthday;
	}
	public String getIntroduce() {
		return introduce;
	}
	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}
	public int getIntegral() {
		return integral;
	}
	public void setIntegral(int integral) {
		this.integral = integral;
	}
	public String getE_mail() {
		return e_mail;
	}
	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}
	public String getQQ() {
		return qq;
	}
	public void setQQ(String qq) {
		this.qq = qq;
	}
	public String getGit_address() {
		return git_address;
	}
	public void setGit_address(String git_address) {
		this.git_address = git_address;
	}
	public String getTrade() {
		return trade;
	}
	public void setTrade(String trade) {
		this.trade = trade;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public double getData_integrity() {
		return data_integrity;
	}
	public void setData_integrity(double data_integrity) {
		this.data_integrity = data_integrity;
	}
	
}
