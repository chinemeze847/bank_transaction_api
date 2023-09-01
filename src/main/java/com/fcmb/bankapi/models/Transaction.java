package com.fcmb.bankapi.models;

import java.time.LocalDateTime;
import java.util.Date;

import lombok.*;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.*;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Transaction {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "account_id")
	private Account account;

	@JsonProperty
	private double amount;

	@JsonProperty
	private double discountedAmount;

	@JsonProperty
	private int rate;

	@JsonProperty
	private LocalDateTime transactionDate;

}
