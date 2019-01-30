package com.mm.accountservice.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.listener.exception.ListenerExecutionFailedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mm.accountservice.resource.AccountResource;
import com.mm.transactionservice.app.entity.Transaction;

@Component
public class Receiver {
 
    @Autowired
    private AccountResource accountResource;
    
    
    @RabbitListener(queues="AccountQ")
    public void updateCurrentBalance(Transaction transaction) throws ListenerExecutionFailedException{
        accountResource.updateBalance(transaction.getAccountNumber(), transaction.getCurrentBalance());
    }
    
}