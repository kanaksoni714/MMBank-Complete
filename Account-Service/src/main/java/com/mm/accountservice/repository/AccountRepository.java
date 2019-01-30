package com.mm.accountservice.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mm.accountservice.app.entity.SavingsAccount;

@Repository
public interface AccountRepository extends  MongoRepository<SavingsAccount, Integer>{
	
}
