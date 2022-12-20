package com.example.services.impl;

import org.apache.commons.lang.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.enums.TicketStatus;
import com.example.model.TicketDto;
import com.example.model.TicketReqDto;

import com.example.repository.TicketRepository;
import com.example.services.api.TicketCancelManager;
import com.example.services.api.TicketServiceManager;


@Service
public class TicketServiceImpl implements TicketServiceManager {

  @Autowired
  TicketRepository ticketRepository;

  @Autowired
  TicketCancelManager ticketCancelManager;


  @Override
  public TicketDto createTicket(TicketReqDto req) {
    req.setPnrNumber(RandomStringUtils.randomAlphanumeric(20).toUpperCase());
    req.setTicketStatus(TicketStatus.OPEN);
    ticketRepository.save(req);
    return new TicketDto(req);
  }

  @Override
  public void deleteTicket(String pnr) {
  //  ticketRepository.delete();
  }

  @Override
  public TicketDto getTicketByPnr(String pnr) {
    return null;
  }

  @Override
  public void cancelTicket(String pnr) {
    ticketRepository.cancelTicket(pnr,TicketStatus.CANCEL);
 String res =   ticketCancelManager.onTicketCancellation(pnr);
 System.out.println("Result == "+res);
  }

}
