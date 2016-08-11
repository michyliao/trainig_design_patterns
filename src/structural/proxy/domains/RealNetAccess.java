package structural.proxy.domains;

import java.util.logging.Logger;

public class RealNetAccess implements NetAccess {

	private int empGrade;

	Logger log = Logger.getLogger(this.getClass().getName());

	
	@Override
	public void grantPermission() {

		log.info("Granted Permission");
		log.info("Open the Borwser and start");

	}

	@Override
	public void setEmpGrade(int empGrade) {
		this.empGrade = empGrade;

	}

}
