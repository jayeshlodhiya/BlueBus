package com.example.model;

import com.example.enums.TicketStatus;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class TicketDto {
  private TicketReqDto ticketReqDto;


  public TicketDto(TicketDto ticketDto) {
  }
}
