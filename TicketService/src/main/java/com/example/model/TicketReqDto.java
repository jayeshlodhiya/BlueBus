package com.example.model;

import java.util.Date;
import java.util.List;

import org.springframework.orm.jpa.vendor.Database;

import com.example.enums.TicketStatus;
import jakarta.annotation.Nullable;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@Getter
@AllArgsConstructor
@Builder
@Entity
@NoArgsConstructor
@Table(name = "Tickets")
public class TicketReqDto {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String customerName;

  @OneToMany(cascade= CascadeType.ALL)
  @JoinColumn(name="ticketId")
  private List<TravellersDto> travellersDto;

  private String bookingDate;
  private int sourceId;
  private int destinationId;
  @Nullable
  private String pnrNumber;
  @Enumerated(EnumType.STRING)
  @Column(name="status")
  private TicketStatus ticketStatus;
}
