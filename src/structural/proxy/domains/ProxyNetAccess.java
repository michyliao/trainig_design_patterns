package structural.proxy.domains;

import java.util.logging.*;

public class ProxyNetAccess implements NetAccess {

	private int empGrade;
	private NetAccess real;

	Logger log = Logger.getLogger(this.getClass().getName());

	@Override
	public void grantPermission() {

		/**
		 * Stimulating Controlled Access/
		 */
		if (empGrade > 5) {
			real = new RealNetAccess();
			real.grantPermission();
		} else {
			log.warning("Not Authorized to Access");
		}

	}

	@Override
	public void setEmpGrade(int empGrade) {
		this.empGrade = empGrade;
	}

}
