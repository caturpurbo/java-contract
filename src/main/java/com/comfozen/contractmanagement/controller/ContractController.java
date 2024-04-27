package com.comfozen.contractmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.comfozen.contractmanagement.dto.Contract;
import com.comfozen.contractmanagement.service.ContractService;

@RestController
@RequestMapping("/api/contracts")
@CrossOrigin(origins = "http://localhost:3000")
public class ContractController {

  private final ContractService contractService;

  @Autowired
  public ContractController(ContractService contractService) {
    this.contractService = contractService;
  }

  @GetMapping
  public List<Contract> getAllContracts() {
    return contractService.getAllContracts();
  }

  @PostMapping
  public ResponseEntity<Contract> addContract(@RequestBody Contract contract) {
    contractService.addContract(contract);
    return ResponseEntity.status(HttpStatus.OK).body(contract); // Added for better response
  }
}