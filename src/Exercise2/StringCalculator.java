package Exercise2;

public class StringCalculator {
	


	public StringCalculator() {
		super();

	}
	
	
	public String add(String str) {
		
		Integer result = 0;
		
		String[] tempTest = str.split("");
		
		if("[\\/,\\s\\n+;.!: ]+".contains(tempTest[0])) {
			
			String[] tempStr = str.split("[\\/,\\s\\n+;.!: ]+");

			for(String s : tempStr) {

				if(!(s.isEmpty()))
					result += Integer.parseInt(s);
				}
			
			
			return "" + result + tempTest[0];
				
		}else {
		
		String[] tempStr = str.split("[\\/,\\s\\n+;.!: ]+");
		if(tempStr.length == 1) {
			
			if(tempStr[0] == "")
				return "0";
			else
				return "" + Integer.parseInt(tempStr[0]);
		}
		else {
	
			
		for(String s : tempStr) {
			
			result += Integer.parseInt(s);
			}
			return "" + result;
		}
		}
	}
}