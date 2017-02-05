package sianeselli.home.interview.pmsipilot;

import org.junit.Test;

public class ProblemTest {
	
	private Problem pb = new Problem();

	@Test
	public void runItCustom(){
		pb.doitCustom();
	}
	
	@Test
	public void runItSimple(){
		pb.doitPmsiPilot();
	}
	
	@Test
	public void runItImproved(){
		pb.doitPmsiPilotImproved();
	}
	
	@Test
	public void runItImprovedPlus(){
		pb.doitPmsiPilotImprovedPlus();
	}
	
}
