package jvs.spring.pic.service;

import jvs.spring.pic.form.PicPorts;

public interface IOPortService {

	public void changeIOPortsState(PicPorts picPorts);

	public String retrieveTemperatureValue();

}
