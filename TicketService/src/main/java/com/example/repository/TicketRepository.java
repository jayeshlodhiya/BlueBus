package com.example.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.enums.TicketStatus;
import com.example.model.TicketReqDto;


@Repository
public interface TicketRepository extends JpaRepository<TicketReqDto,Long> {
  @Transactional
  @Modifying
  @Query("update TicketReqDto  set ticketStatus = :status where pnrNumber = :pnrNumber")
  void cancelTicket(@Param("pnrNumber") String pnrNumber,@Param("status") TicketStatus status);
}
