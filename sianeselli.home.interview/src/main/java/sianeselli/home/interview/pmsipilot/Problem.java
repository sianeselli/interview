package sianeselli.home.interview.pmsipilot;

public class Problem {
	/**
	 * "Write a program that prints the numbers from 1 to 100. 
	 * But for multiples of five print “pilot” instead of the number and 
	 * for the multiples of three print “PMSI”. 
	 * For numbers which are multiples of both three and five print “PMSIpilot”."
	 */
	public void doitCustom(){
		for (int i=1;i<=100;i++){
			String msg = String.valueOf(i);
			if (i%5 == 0 && i%3==0){
				msg = "Mathildeje t'aime";
			}
			else if (i%5 == 0){
				msg = "je t'aime";
			}
			else if (i%3 == 0){
				msg = "Mathilde";
			}
			System.out.println(msg);
		}
	}
	
	/**
	 * "Write a program that prints the numbers from 1 to 100. 
	 * But for multiples of five print “pilot” instead of the number and 
	 * for the multiples of three print “PMSI”. 
	 * For numbers which are multiples of both three and five print “PMSIpilot”."
	 */
	public void doitPmsiPilot(){
		for (int i=1;i<=100;i++){
			String msg = String.valueOf(i);
			if (i%5 == 0 && i%3==0){
				msg = "PMSIpilot";
			}
			else if (i%5 == 0){
				msg = "pilot";
			}
			else if (i%3 == 0){
				msg = "PMSI";
			}
			System.out.println(msg);
		}
	}
	
	/**
	 * Write a program that prints the numbers from 1 to 100. 
	 * But for multiples of five print “pilot” instead of the number and 
	 * for the multiples of three print “PMSI”. 
	 * For numbers which are multiples of both three and five print “PMSIpilot”.
	 */
	public void doitPmsiPilotImproved(){
		for (int i=1;i<=100;i++){
			String msg = "";
			if (i%3 == 0){
				msg = "PMSI";
			}
			if (i%5 == 0){
				msg += "pilot";
			}
			if (msg.isEmpty()){
				msg = String.valueOf(i);
			}
			System.out.println(msg);
		}
	}
	
	/**
	 * "Write a program that prints the numbers from 1 to 100. 
	 * But for multiples of five print “pilot” instead of the number and 
	 * for the multiples of three print “PMSI”. 
	 * For numbers which are multiples of both three and five print “PMSIpilot”."
	 */
	public void doitPmsiPilotImprovedPlus(){
		for (int i=1;i<=100;i++){
			StringBuilder msg = new StringBuilder();
			if (i%5 == 0){
				msg.append("PMSI");
			}
			if (i%3 == 0){
				msg.append("pilot");
			}
			if (msg.length() == 0){
				msg.append(String.valueOf(i));
			}
			System.out.println(msg);
		}
	}

}
