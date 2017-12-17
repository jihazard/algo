package algo.DetectPangram;

public class DetectPangram {
	public static void main(String[] args) {
		String pangram1 = "The quick brown fox jumps over the lazy dog.";
		String pangram2 = "You shall not pass!";
		String pangram3 = "I sang, and thought I sang very well; but he just looked up into my face with a very quizzical expression, and said, 'How long have been singing, Mademoiselle?'";
		String pangram4 = "JoBlo's movie review of The Yards: Mark Wahlberg, Joaquin Phoenix, Charlize Theron...";
		System.out.println(check(pangram4));
	}
	public static boolean check(String sentence){
	    //code
		sentence = sentence.toUpperCase();
		String alpha= "";
		boolean result = true;
		for (char i = 'A';  i< 'Z'; i++) {
			if(sentence.contains(String.valueOf(i))){
				System.out.println(sentence + "에 " + i +" 는 있습니다.");
			}else {
				System.out.println(sentence + "에 " + i +" 는 없습니다.");
				result = false;
			}
		}
		System.out.println(alpha);
		return result;
	  }
}
