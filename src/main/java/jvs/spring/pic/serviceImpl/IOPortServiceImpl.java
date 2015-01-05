package jvs.spring.pic.serviceImpl;

import jvs.spring.pic.dao.IOPortDAO;
import jvs.spring.pic.form.PicPorts;
import jvs.spring.pic.service.IOPortService;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class IOPortServiceImpl implements IOPortService {

	/** Logger for this class and subclasses */
	protected final Log logger = LogFactory.getLog(getClass());

	IOPortDAO iOPortDAO;

	public IOPortServiceImpl() {
	}

	public void setiOPortDAO(IOPortDAO iOPortDAO) {
		this.iOPortDAO = iOPortDAO;
	}

	public void changeIOPortsState(PicPorts picPorts) {

		if (picPorts != null) {

			// usbSendCommand.sendCommand(picCommand.getPortA0() == null ?
			// "A0:0" :
			// "A0:1");
			iOPortDAO.updateIOPortState(picPorts.getPortA1() == null ? "A1:0<" : "A1:1<");
			iOPortDAO.updateIOPortState(picPorts.getPortA2() == null ? "A2:0<" : "A2:1<");
			iOPortDAO.updateIOPortState(picPorts.getPortA3() == null ? "A3:0<" : "A3:1<");
			iOPortDAO.updateIOPortState(picPorts.getPortA4() == null ? "A4:0<" : "A4:1<");
			iOPortDAO.updateIOPortState(picPorts.getPortA5() == null ? "A5:0<" : "A5:1<");

			iOPortDAO.updateIOPortState(picPorts.getPortB0() == null ? "B0:0<" : "B0:1<");
			iOPortDAO.updateIOPortState(picPorts.getPortB1() == null ? "B1:0<" : "B1:1<");
			iOPortDAO.updateIOPortState(picPorts.getPortB2() == null ? "B2:0<" : "B2:1<");
			iOPortDAO.updateIOPortState(picPorts.getPortB3() == null ? "B3:0<" : "B3:1<");
			iOPortDAO.updateIOPortState(picPorts.getPortB4() == null ? "B4:0<" : "B4:1<");
			iOPortDAO.updateIOPortState(picPorts.getPortB5() == null ? "B5:0<" : "B5:1<");
			iOPortDAO.updateIOPortState(picPorts.getPortB6() == null ? "B6:0<" : "B6:1<");
			iOPortDAO.updateIOPortState(picPorts.getPortB7() == null ? "B7:0<" : "B7:1<");
		}
	}

	public String retrieveTemperatureValue() {
		return iOPortDAO.readTemperature();
	}

}