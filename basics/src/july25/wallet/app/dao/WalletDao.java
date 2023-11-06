package july25.wallet.app.dao;

import july25.wallet.app.pojo.Wallet;

public interface WalletDao {
	
	Wallet createWallet(Wallet wallet);
	Wallet readWalletById(Integer walletId);
	Wallet updateWallet(Wallet wallet);
	Boolean deleteWalletById(Integer walletId);

}
