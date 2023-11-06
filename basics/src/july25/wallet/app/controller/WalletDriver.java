package july25.wallet.app.controller;

import july25.wallet.app.pojo.Wallet;
import july25.wallet.app.service.WalletService;
import july25.wallet.app.service.WalletServiceImpl;

public class WalletDriver {

	public static void main(String[] args) {
		
		WalletService walletService = new WalletServiceImpl();
		
		walletService.addWallet(new Wallet(100, 1000.0, "Tanya"));
		walletService.addWallet(new Wallet(200, 2000.0, "Akanksha"));
		
		Wallet wallet = walletService.getWalletById(100);
		System.out.println(wallet);
		
		walletService.updateWallet(new Wallet(100, 2000.0, "Tanisha"));
		wallet = walletService.getWalletById(101);
		if (wallet != null)
			System.out.println(wallet);
		else
			System.out.println("Wallet not found");
		
		
		walletService.delteWalletById(100);
		Wallet deleteWallet = walletService.getWalletById(100);
		if (wallet != null)
			System.out.println(deleteWallet);
		else
			System.out.println("Wallet not found");
		
		Wallet newWallet = walletService.getWalletById(100);
		System.out.println("-->" + newWallet);
	}
	
	

}
