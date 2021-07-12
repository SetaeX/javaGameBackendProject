package GameBackend.Adapters;

import java.rmi.RemoteException;
import java.util.Locale;

import GameBackend.Abstracts.PersonCheckService;
import GameBackend.Entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements PersonCheckService{

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		KPSPublicSoapProxy client= new KPSPublicSoapProxy();
		boolean result=true;
		try {
			result=client.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalityID()), gamer.getFirstName().toUpperCase(), gamer.getLastName().toUpperCase(new Locale("tr")), gamer.getYearOfBirth());
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return result;
	}

}
