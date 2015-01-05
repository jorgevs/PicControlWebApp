package jvs.spring.pic.util;

import gnu.io.CommPort;
import gnu.io.CommPortIdentifier;
import gnu.io.SerialPort;

import java.io.InputStream;
import java.io.OutputStream;

public class SerialComm {

	public InputStream in;
	public OutputStream out;

	public SerialReader tRead1;

	CommPortIdentifier portIdentifier;
	CommPort commPort;
	SerialPort serialPort;

	// ----------------------------------------------------------
	public SerialComm() {
		super();
	}

	// ----------------------------------------------------------
	public void connect(String portName) throws Exception {
		portIdentifier = CommPortIdentifier.getPortIdentifier(portName);

		if (!portIdentifier.isCurrentlyOwned()) {
			commPort = portIdentifier.open(this.getClass().getName(), 2000);
			if (commPort instanceof SerialPort) {
				serialPort = (SerialPort) commPort;
				serialPort.setSerialPortParams(9600, SerialPort.DATABITS_8, SerialPort.STOPBITS_1, SerialPort.PARITY_NONE);

				in = serialPort.getInputStream();
				out = serialPort.getOutputStream();

				tRead1 = new SerialReader(in);
				tRead1.start();

			} else {
				System.out.println("The selected port, is not a SerialPort");
			}
		} else {
			// System.out.println("Port is currently in use");
		}

	}

	// ----------------------------------------------------------
	public static void main(String[] args) {
		SerialComm serialComm = new SerialComm();

		try {
			serialComm.connect("COM7");

			byte[] bout = new byte[5];

			bout[0] = (byte) 'A'; // sample: 'A'
			bout[1] = (byte) '1'; // sample: '1'
			bout[2] = (byte) ':'; // sample: ':'
			bout[3] = (byte) '1'; // sample: '1'
			bout[4] = (byte) '<'; // sample: '<'
			serialComm.out.write(bout);

			bout[0] = (byte) 'A'; // sample: 'A'
			bout[1] = (byte) '3'; // sample: '3'
			bout[2] = (byte) ':'; // sample: ':'
			bout[3] = (byte) '1'; // sample: '1'
			bout[4] = (byte) '<'; // sample: '<'
			serialComm.out.write(bout);

			bout[0] = (byte) 'A'; // sample: 'A'
			bout[1] = (byte) '5'; // sample: '5'
			bout[2] = (byte) ':'; // sample: ':'
			bout[3] = (byte) '1'; // sample: '1'
			bout[4] = (byte) '<'; // sample: '<'
			serialComm.out.write(bout);

			for (int i = 0; i < 5; i++) {
				System.out.println("Reading tRead1: " + serialComm.tRead1.getValue());
				Thread.sleep(500);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Closing port and ending thread");
			serialComm.tRead1 = null;

		}
	}
}