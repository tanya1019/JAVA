package july25.wallet.app.service;

import july25.wallet.app.dao.WalletDao;
import july25.wallet.app.dao.WallletDaoImpl;
import july25.wallet.app.pojo.Wallet;

public class WalletServiceImpl implements WalletService {
	
	WalletDao walletDao = new WallletDaoImpl();

	@Override
	public Wallet addWallet(Wallet newWallet) {
		
		return this.walletDao.createWallet(newWallet);
	}

	@Override
	public Wallet updateWallet(Wallet wallet) {
		
		return this.walletDao.updateWallet(wallet);
	}

	
	@Override
	public Boolean delteWalletById(Integer walletId) {
		
		return this.walletDao.deleteWalletById(walletId);
	}

	
	@Override
	public Wallet getWalletById(Integer walletId) {
		
		return this.walletDao.readWalletById(walletId);
	}

	@Override
	public Double addFunds(Integer walletId, Double amount) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Double withdrawFunds(Integer walletId, Double amount) {
		
		return null ;
	}

}
