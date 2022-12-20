package com.example.services.api;

import com.example.model.TicketDto;
import com.example.model.TicketReqDto;

public interface TicketServiceManager {
  TicketDto createTicket(TicketReqDto req);
  void deleteTicket(String pnr);
  TicketDto getTicketByPnr(String pnr);
  void cancelTicket(String pnr);

}
