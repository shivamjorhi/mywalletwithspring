package com.cg.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.daos.MyWalletDAO;
import com.cg.entities.MyWallet;
import com.cg.exceptions.ApplicationException;
@Service
public class CountryService {

    @Autowired private MyWalletDAO dao;
    
    
    public List<MyWallet> getAll() {
    	return dao.getAllinfo();
    }
    
    public MyWallet byCode(Integer accId) {
        MyWallet wallet=dao.findByCode(accId);
        if(wallet==null) {
        	throw new ApplicationException("Account with account id " +accId+" does not exist!");
        }
        return wallet;
    }
    
    public void create(MyWallet wallet) {
        MyWallet temp = dao.findByCode(wallet.getAccId());
        if(temp==null)
        {
            dao.save(wallet);
        }else
        	throw new ApplicationException("Country with account id " +wallet.getAccId()+" already exists!");
    }
    
    public void update(MyWallet wallet) {
        MyWallet temp = dao.findByCode(wallet.getAccId());
        if(temp!=null)
        {
            dao.update(wallet);
        }else
            throw new ApplicationException("Account "+wallet.getAccId()+" didn't exists!");
    }
    
    public Integer deleteAll(Integer accId) {
        return dao.deleteAllinfo(accId);
    }
    
    
    
    
}