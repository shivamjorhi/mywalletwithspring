package com.cg.daos;

import java.util.List;

import com.cg.entities.MyWallet;

public interface MyWalletDAO {
	
	    void save(MyWallet country);
	    MyWallet findByCode(Integer accId);
	    void update(MyWallet wallet);
	    List<MyWallet> getAllinfo();
	    public Integer deleteAllinfo(Integer accId);
	

}
