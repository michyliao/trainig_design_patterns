package creation.facade.domains;

import java.util.*;

public class ReservationFacade {

		private HotelAvailability hotelStatus;
		private FlightAvailablitiy flightStatus;
		
		
		public Map<String,List<Integer>> getAllStatus(Date date){
			Map<String, List<Integer>> list = new HashMap<String, List<Integer>>();
			
			List<Integer> flightList = new ArrayList<Integer>();
			flightList.add(flightStatus.airCadStatus(date));
			flightList.add(flightStatus.westJetStatus(date));
			
			List<Integer> hotelList = new ArrayList<Integer>();
			hotelList.add(hotelStatus.HiltonHotelStatus(date));
			hotelList.add(hotelStatus.WestinHotelStatus(date));
			
			
			list.put("FlightStatus", flightList);
			list.put("HotelStatus", hotelList);
			
			return list;
		}
		
		
		/**
		 * @return the hotelStatus
		 */
		public HotelAvailability getHotelStatus() {
			return hotelStatus;
		}



		/**
		 * @return the flightStatus
		 */
		public FlightAvailablitiy getFlightStatus() {
			return flightStatus;
		}



		public ReservationFacade(){
			hotelStatus = new HotelAvailability();
			flightStatus = new FlightAvailablitiy();
		}
		
		
	
}
