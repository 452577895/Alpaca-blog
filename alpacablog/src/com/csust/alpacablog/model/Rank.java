package com.csust.alpacablog.model;
/**
 * 等级表
 * @author hjw
 *
 */
public class Rank {
	/**等级id*/
	private int id;
	/**积分*/
	private int integral;
	/**与积分对应的等级名称*/
	private String rankName;
	
	
	public Rank() {
		super();
	}


	public Rank(int id, int integral, String rankName) {
		super();
		this.id = id;
		this.integral = integral;
		this.rankName = rankName;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getIntegral() {
		return integral;
	}


	public void setIntegral(int integral) {
		this.integral = integral;
	}


	public String getRankName() {
		return rankName;
	}


	public void setRankName(String rankName) {
		this.rankName = rankName;
	}
	
	
}
