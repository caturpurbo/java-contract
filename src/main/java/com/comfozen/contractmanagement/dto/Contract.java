package com.comfozen.contractmanagement.dto;

import java.util.List;

public class Contract {
  private long id;
  private String name;
  private List<Deliverable> deliverables;
  public long getId() {
    return id;
  }
  public void setId(long id) {
    this.id = id;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public List<Deliverable> getDeliverables() {
    return deliverables;
  }
  public void setDeliverables(List<Deliverable> deliverables) {
    this.deliverables = deliverables;
  }
  public Contract() {
  }
}