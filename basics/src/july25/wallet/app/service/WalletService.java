package july25.wallet.app.service;

import july25.wallet.app.pojo.Wallet;

public interface WalletService {

	Wallet addWallet(Wallet newWallet);

	Wallet updateWallet(Wallet wallet);

	Boolean delteWalletById(Integer walletId);

	Wallet getWalletById(Integer walletId);

	Double addFunds(Integer walletId, Double amount);
	
	Double withdrawFunds(Integer walletId, Double amount);
	
}
