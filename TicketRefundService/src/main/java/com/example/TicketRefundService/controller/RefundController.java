package com.example.TicketRefundService.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RefundController {
  @GetMapping("/generateRefundCase/{pnr}")
  public String generateRefundCase(@PathVariable String pnr){
   System.out.println("Pnr in TicketRefundService="+pnr);
   return "OK";
  }
}
