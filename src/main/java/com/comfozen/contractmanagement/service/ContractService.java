package com.comfozen.contractmanagement.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.comfozen.contractmanagement.dto.Contract;

@Service
public class ContractService {
  private List<Contract> contracts = new ArrayList<>();

  public List<Contract> getAllContracts() {

    return contracts;
  }

  public void addContract(Contract contract) {

    contracts.add(contract);
  }
}
