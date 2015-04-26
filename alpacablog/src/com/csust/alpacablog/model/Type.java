package com.csust.alpacablog.model;
/**
 * 类型表
 * @author hjw
 *
 */
public class Type {
	/**类型Id*/
	private int id;
	/**对应类型名*/
	private String typeName;
	
	public Type() {
		super();
	}

	public Type(int id, String typeName) {
		super();
		this.id = id;
		this.typeName = typeName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	
}
