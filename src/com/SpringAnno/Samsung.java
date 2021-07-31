package com.SpringAnno;

import org.springframework.beans.factory.annotation.Autowired;

public class Samsung {
	
//	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	@Autowired
	MobileProcessor cpu;
	
	public MobileProcessor getCpu() {
		return cpu;
	}

	public void setCpu(MobileProcessor cpu) {
		this.cpu = cpu;
	}

	public void config() {
		System.out.println("Octo Core, 12MP");
		cpu.process();
	}
	
}
