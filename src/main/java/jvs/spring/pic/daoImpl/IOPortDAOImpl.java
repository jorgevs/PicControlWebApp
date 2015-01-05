package jvs.spring.pic.daoImpl;

import java.io.IOException;

import jvs.spring.pic.dao.IOPortDAO;
import jvs.spring.pic.util.SerialComm;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class IOPortDAOImpl implements IOPortDAO {

	/** Logger for this class and subclasses */
	protected final Log logger = LogFactory.getLog(getClass());

	SerialComm serialComm;

	public IOPortDAOImpl() {
	}

	public void setSerialComm(SerialComm serialComm) {
		this.serialComm = serialComm;
	}

	public void updateIOPortState(String instruction) {

		try {
			serialComm.connect("COM7");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (instruction != null) {

			byte[] bout = new byte[5];
			bout[0] = (byte) instruction.charAt(0); // sample: 'A'
			bout[1] = (byte) instruction.charAt(1); // sample: '0'
			bout[2] = (byte) instruction.charAt(2); // sample: ':'
			bout[3] = (byte) instruction.charAt(3); // sample: '1'
			bout[4] = (byte) instruction.charAt(4); // sample: '<'
													// '0' = OFF / '1' = ON
			String value = new String(bout);
			logger.info("Writting: " + value);

			try {
				serialComm.out.write(bout);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	public String readTemperature() {
		try {
			serialComm.connect("COM7");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Reads the value from the readingThread
		return this.serialComm.tRead1.getValue();
	}

}