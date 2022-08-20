package com.banquito.core.accounts.dto;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.math.BigInteger;

@Data
@Builder
public class DepositDTO {
  private String referenceId;

  private BigInteger accountNumber;

  private BigDecimal amount;

  private String notes;

  private String transactionChannel;

  private String documentNumber;

  private String transactionNumber;
}
