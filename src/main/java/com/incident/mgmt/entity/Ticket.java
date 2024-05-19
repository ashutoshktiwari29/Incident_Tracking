package com.incident.mgmt.entity;

import java.sql.Date;

public class Ticket {
	
	private int ticketId;
	private int resolverUserId;
	private int createrUserId;
	private String merchantId;
	private String description;
	private String title;
	private String status;
	private Date createDate;
	private Date lastDate;
	
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getLastDate() {
		return lastDate;
	}
	public void setLastDate(Date lastDate) {
		this.lastDate = lastDate;
	}
	public int getTicketId() {
		return ticketId;
	}
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}
	
	public int getResolverUserId() {
		return resolverUserId;
	}
	public void setResolverUserId(int resolverUserId) {
		this.resolverUserId = resolverUserId;
	}
	public int getCreaterUserId() {
		return createrUserId;
	}
	public void setCreaterUserId(int createrUserId) {
		this.createrUserId = createrUserId;
	}
	public String getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Ticket [ticketId=" + ticketId + ", resolverUserId=" + resolverUserId + ", createrUserId="
				+ createrUserId + ", merchantId=" + merchantId + ", description=" + description + ", title=" + title
				+ ", status=" + status + ", createDate=" + createDate + ", lastDate=" + lastDate + "]";
	}
	
	

	

}
