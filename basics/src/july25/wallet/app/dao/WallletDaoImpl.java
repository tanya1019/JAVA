package july25.wallet.app.dao;

import java.util.HashMap;
import java.util.Map;

import july18.wallet;
import july25.wallet.app.pojo.Wallet;

public class WallletDaoImpl implements WalletDao {
	
	Map<Integer, Wallet> walletMap = new HashMap<>();

	@Override
	public Wallet createWallet(Wallet wallet) {
		
		this.walletMap.put(wallet.getId(), wallet);
		return null;
	}

	@Override
	public Wallet readWalletById(Integer walletId) {
		
		return this.walletMap.get(walletId);
	}

	@Override
	public Wallet updateWallet(Wallet wallet) {

		this.walletMap.replace(wallet.getId(), wallet);
		return this.walletMap.get(wallet.getId());
	}

	@Override
	public Boolean deleteWalletById(Integer walletId) {
		
		if(this.walletMap.remove(walletId) != null) {
			return true;
		}
		else {
			return false;
		}
	}

}
