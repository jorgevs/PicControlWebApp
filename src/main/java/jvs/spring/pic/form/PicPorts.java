package jvs.spring.pic.form;

import java.io.Serializable;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class PicPorts implements Serializable {

	private static final long serialVersionUID = -5895863755225959496L;

	/** Logger for this class and subclasses */
	protected final Log logger = LogFactory.getLog(getClass());

	private String portA0;
	private String portA1;
	private String portA2;
	private String portA3;
	private String portA4;
	private String portA5;

	private String portB0;
	private String portB1;
	private String portB2;
	private String portB3;
	private String portB4;
	private String portB5;
	private String portB6;
	private String portB7;

	public String getPortA0() {
		return portA0;
	}

	public String getPortA1() {
		return portA1;
	}

	public String getPortA2() {
		return portA2;
	}

	public String getPortA3() {
		return portA3;
	}

	public String getPortA4() {
		return portA4;
	}

	public String getPortA5() {
		return portA5;
	}

	public void setPortA0(String portA0) {
		this.portA0 = portA0;
		// logger.info("this.portA0 = " + portA0);
	}

	public void setPortA1(String portA1) {
		this.portA1 = portA1;
		// logger.info("this.portA1 = " + portA1);
	}

	public void setPortA2(String portA2) {
		this.portA2 = portA2;
		// logger.info("this.portA2 = " + portA2);
	}

	public void setPortA3(String portA3) {
		this.portA3 = portA3;
		// logger.info("this.portA3 = " + portA3);
	}

	public void setPortA4(String portA4) {
		this.portA4 = portA4;
		// logger.info("this.portA4 = " + portA4);
	}

	public void setPortA5(String portA5) {
		this.portA5 = portA5;
		// logger.info("this.portA5 = " + portA5);
	}

	public String getPortB0() {
		return portB0;
	}

	public void setPortB0(String portB0) {
		this.portB0 = portB0;
		// logger.info("this.portB0 = " + portB0);
	}

	public String getPortB1() {
		return portB1;
	}

	public void setPortB1(String portB1) {
		this.portB1 = portB1;
		// logger.info("this.portB1 = " + portB1);
	}

	public String getPortB2() {
		return portB2;
	}

	public void setPortB2(String portB2) {
		this.portB2 = portB2;
		// logger.info("this.portB2 = " + portB2);
	}

	public String getPortB3() {
		return portB3;
	}

	public void setPortB3(String portB3) {
		this.portB3 = portB3;
		// logger.info("this.portB3 = " + portB3);
	}

	public String getPortB4() {
		return portB4;
	}

	public void setPortB4(String portB4) {
		this.portB4 = portB4;
		// logger.info("this.portB4 = " + portB4);
	}

	public String getPortB5() {
		return portB5;
	}

	public void setPortB5(String portB5) {
		this.portB5 = portB5;
		// logger.info("this.portB5 = " + portB5);
	}

	public String getPortB6() {
		return portB6;
	}

	public void setPortB6(String portB6) {
		this.portB6 = portB6;
		// logger.info("this.portB6 = " + portB6);
	}

	public String getPortB7() {
		return portB7;
	}

	public void setPortB7(String portB7) {
		this.portB7 = portB7;
		// logger.info("this.portB7 = " + portB7);
	}

}
