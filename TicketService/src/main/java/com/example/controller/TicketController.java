package com.example.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.TicketDto;
import com.example.model.TicketReqDto;
import com.example.services.api.TicketServiceManager;
import jakarta.validation.Valid;

@RestController

public class TicketController {
  private static final String template = "I am running";
  private final AtomicLong counter = new AtomicLong();
  @Autowired
  TicketServiceManager ticketService;



  @PostMapping("/createTicket")
  public ResponseEntity<TicketDto> createTicket(@Valid @RequestBody TicketReqDto ticketReqDto) {
    final TicketDto createdTicket =ticketService.createTicket(ticketReqDto);
    return ResponseEntity.status(HttpStatus.CREATED).body(createdTicket);
  }

  @GetMapping("/healthcheckTest")
  public String healthcheck(){
    return template;
  }

  @PutMapping("/cancelTicket/{id}")
  public String cancelTicket(@PathVariable String id){
    ticketService.cancelTicket(id);
    return "Cancelled Successfully";
  }
}
