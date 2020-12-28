package com.hansda.TeluskoSpringAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Samsung {
	
	@Autowired
	@Qualifier("mediaTek")
	private MobileProcessor processor;
	
	public MobileProcessor getProcessor() {
		return processor;
	}
	
	public void setProcessor(MobileProcessor processor) {
		this.processor = processor;
	}
	
	public void config() {
		System.out.println("Configuration!");
		processor.process();
	}

}
