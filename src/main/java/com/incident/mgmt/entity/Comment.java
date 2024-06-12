package com.incident.mgmt.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown=true)
public class Comment {
	
	private int id;
	private Date commentDate;
	private String CommentDetail;
	private int userId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDate() {
		return commentDate;
	}
	public void setDate(Date commentDate) {
		this.commentDate = commentDate;
	}
	public String getCommentDetail() {
		return CommentDetail;
	}
	public void setCommentDetail(String commentDetail) {
		CommentDetail = commentDetail;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	@Override
	public String toString() {
		return "Comment [id=" + id + ", commentDate=" + commentDate + ", CommentDetail=" + CommentDetail + ", userId=" + userId + "]";
	}
	
	




}
