package jvs.spring.pic.util;

import java.io.IOException;
import java.io.InputStream;

public class SerialReader extends Thread {
	String value = "";

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	InputStream in;

	// ----------------------------------------------------------
	public SerialReader(InputStream in) {
		this.in = in;
	}

	// ----------------------------------------------------------
	public void run() {
		int len = -1;
		StringBuilder cadena = new StringBuilder();
		char c;
		try {
			while (true) {
				while ((len = this.in.read()) > -1) {
					c = (char) len;
					if (c == '>') {
						value = cadena.toString();
						cadena = new StringBuilder();
						// System.out.println(value);
					} else {
						cadena.append(c);
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}