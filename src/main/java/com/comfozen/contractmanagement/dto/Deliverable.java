package com.comfozen.contractmanagement.dto;

public class Deliverable {
  private long id;
  private String description;
  private String targetDate;
  public long getId() {
    return id;
  }
  public void setId(long id) {
    this.id = id;
  }
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }
  public String getTargetDate() {
    return targetDate;
  }
  public void setTargetDate(String targetDate) {
    this.targetDate = targetDate;
  }
  public Deliverable() {
  }
}
