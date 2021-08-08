public class QuestionSecuryt{
	public static void main(String args[]){
	String response_one = "a" ;
	String response_two = "a" ;
	String response_three = "b" ;
	String response_four = "a" ;
	String response_five = "c" ;
	String result = "" ;
	String letter = "" ;
	for(int x = 1 ; x != 6; x ++){
		switch(x){
			case 1 :
				letter = response_one;
				break;
			case 2 :
				letter = response_two;
				break; 
			case 3 :
				letter = response_three;
				break;
			case 4 :
				letter = response_four;
				break;
			case 5 :
				letter = response_five;
				break;
			default: 
				return;		
					}
		switch (letter){
			case "a" :
				result += "a " ;
				break ;
			case "b" :
				result += "b " ;
				break ;
			case "c" :
				result += "c " ;
				break ;
			case "d" :
				result += "d " ;
				break ;
			case "e" : 
				result += "e " ;
				break;
			default: 
				return ;
					}
		System.out.println("> " + result);
		}
	}
}