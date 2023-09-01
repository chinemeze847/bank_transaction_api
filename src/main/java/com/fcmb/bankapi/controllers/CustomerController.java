package com.fcmb.bankapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fcmb.bankapi.dtos.BuyAirtimeDto;
import com.fcmb.bankapi.dtos.TransferDto;
import com.fcmb.bankapi.services.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	public CustomerController(CustomerService customerService) {
		this.customerService = customerService;
	}

	@PostMapping("/transfer")
	public void doTransfer(@RequestBody TransferDto transferDto){

		customerService.doTransfer(
				transferDto.getSourceAcct(),
				transferDto.getSourceAcct(),
				transferDto.getAmount());
	}

	@PostMapping("/buy-airtime")
	public void buyAirtime(@RequestBody BuyAirtimeDto buyAirtimeDto){
		customerService.buyAirtime(
				buyAirtimeDto.getSourceAcct(),
				buyAirtimeDto.getNetworkProvider(),
				buyAirtimeDto.getAmount(),
				buyAirtimeDto.getPhoneNumber()
		);
	}


}
