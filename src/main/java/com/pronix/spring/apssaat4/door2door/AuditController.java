package com.pronix.spring.apssaat4.door2door;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/apssaat")
public class AuditController {
	
	@Autowired
	private AuditService auditService;
	
	@RequestMapping("/door2door")
	public List<Audit> giveAuditList() {
		return auditService.giveAuditList();
	}
	
	@RequestMapping("/hello")
	public void printHello() {
		System.out.println("APSSAAT");
	}

}
