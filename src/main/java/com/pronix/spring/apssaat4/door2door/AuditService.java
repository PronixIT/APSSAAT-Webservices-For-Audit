package com.pronix.spring.apssaat4.door2door;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuditService {
	
	private List<Audit> auditlist;
	
	@Autowired
	private AuditRepository auditRepository;
	
	public List<Audit> giveAuditList() {
		auditlist = new ArrayList<>(); 
		auditlist.add(new Audit(1,"ramu"));
		auditlist.add(new Audit(2,"ramu2"));
		auditlist.add(new Audit(3,"ramu3"));
		auditlist.add(new Audit(4,"ram4"));
		return auditlist;
	}

}
