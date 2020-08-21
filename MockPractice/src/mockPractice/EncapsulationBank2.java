package mockPractice;

public class EncapsulationBank2 {

	public static void main(String[] args) {
		
		EncapsulationBank e = new EncapsulationBank();
		
		e.setAcc_num(569569595L);
		e.setAmount(65335f);
		e.setEmail("abc@gmail.com");
		e.setName("sanket");

		System.out.println(e.getAcc_num()+" "+e.getAmount()+" "+e.getEmail()+" "+e.getName());
		
	}

}
