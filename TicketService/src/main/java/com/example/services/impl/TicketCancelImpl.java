package com.example.services.impl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.services.api.TicketCancelManager;
import com.netflix.discovery.EurekaClient;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class TicketCancelImpl implements TicketCancelManager {
  @Autowired
  private EurekaClient discoveryClient;

  @Override
  public String onTicketCancellation(String pnr) {
   System.out.println("PNR = "+pnr);
    String url = discoveryClient.getNextServerFromEureka("TicketRefundService", false).getHomePageUrl();
    return new RestTemplate().getForEntity(url + "/generateRefundCase/"+pnr, String.class).getBody();
  }
}
