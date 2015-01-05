package jvs.spring.pic.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import jvs.spring.pic.form.PicPorts;
import jvs.spring.pic.service.IOPortService;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

public class IOPortController extends SimpleFormController {

	/** Logger for this class and subclasses */
	protected final Log logger = LogFactory.getLog(getClass());

	private IOPortService iOPortService = null;

	public void setiOPortService(IOPortService iOPortService) {
		this.iOPortService = iOPortService;
	}

	protected Object formBackingObject(HttpServletRequest request) throws ServletException {
		PicPorts picPorts = new PicPorts();
		return picPorts;
	}

	public ModelAndView onSubmit(Object command) throws ServletException {
		PicPorts picPorts = (PicPorts) command;

		iOPortService.changeIOPortsState(picPorts);

		String now = (new java.util.Date()).toString();
		ModelAndView mv = new ModelAndView(getSuccessView());
		mv.addObject("picPorts", picPorts);
		mv.addObject("actualTime", now);

		logger.info("Returning from IOPortController, view to " + getSuccessView());
		return mv;
	}

}