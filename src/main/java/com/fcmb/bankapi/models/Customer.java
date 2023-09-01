package com.fcmb.bankapi.models;

import java.util.Set;

import lombok.*;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.*;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public  class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;

	@JsonProperty
	private String name;

	@JsonProperty
	private String email;

	@JsonProperty
	private String phoneNumber;

	@JsonProperty
	private int AirtimeBalance;



	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Account> accounts;


	@Enumerated(EnumType.STRING)
	private CustomerType customerType;

}
