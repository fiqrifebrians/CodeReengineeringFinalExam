public class Supervisor extends Employee{
	public int getBonus(){
		if(kpi > 3.5)
			return 3 * gaji;
		else if(kpi > 3)
			return 2 * gaji;
		else if(kpi > 2.5)
			return 1 * gaji;
		else
			return 0;
	}

	public void medicalBenefitInfo(){
		System.out.println("Rawat inap : 1.000.000/malam");
		System.out.println("ICU : 2.000.000/malam");
		System.out.println("Medical Checkup : 5.000.000/tahun");
		// and other benefit
	}
}