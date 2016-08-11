package creation.facade.apps;

import java.util.*;

import creation.facade.domains.ReservationFacade;

public class FacadeClient {

	public static void main(String[] agrs){
		ReservationFacade facade = new ReservationFacade();
		
		double indigo = facade.getFlightStatus().airCadStatus(new Date());
		
		
	}
	
}
