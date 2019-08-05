package com.cg.daos;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import com.cg.entities.MyWallet;
@Repository
public class MyWalletDAOImpl implements MyWalletDAO {

    List<MyWallet> wallets = new LinkedList<MyWallet>();
    
    
    @PostConstruct
    public void populateSample() {
    	wallets.add(new MyWallet(101, (long) 964321877, "Shivam", 45000.00));
    	wallets.add(new MyWallet(102, (long) 964321855, "Shobhit", 50000.00));
    	wallets.add(new MyWallet(103, (long) 964321866, "Naman", 55000.00));
    }
    
    public void save(MyWallet country) {
        wallets.add(country);
    }
    
    public MyWallet findByCode(Integer accId) {
        MyWallet cn = null;
        Optional<MyWallet> opt = wallets.stream()
                                .filter( c -> c.getAccId().equals(accId))
                                .findFirst();
        if(opt.isPresent()) {
            cn = opt.get();
        }
        return cn;
    }


    public void update(MyWallet wallet) {
        MyWallet temp = findByCode(wallet.getAccId());
        if(temp != null) {
        	temp.setAccNumber(wallet.getAccNumber());
        	temp.setAccName(wallet.getAccName());
            temp.setIniBal(wallet.getIniBal());
            
            
        }
    }

	public List<MyWallet> getAllinfo() {
		return wallets;
	}

	@Override
	public Integer deleteAllinfo(Integer accId) {
		 MyWallet temp1 = findByCode(accId);
		 wallets.remove(temp1);
		 return 1;
	}

	
	
}
	
