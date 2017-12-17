package algo.DetectPangram;



import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/*
팬그램 (그리스어: παν γράμμα 판 그람마[*], '모든 글자'라는 뜻)은 알파벳의 모든 글자들을 사용해서 만든 문장을 뜻한다.
 팬그램은 로렘 입숨처럼 글꼴 샘플을 보여주거나 장비를 테스트하는 데 사용된다. 예를 들어 The quick brown fox jumps over the lazy dog라는
 팬그램은 웨스턴 유니언사가 텔렉스/TWX 데이터 통신 장비의 정확도와 신뢰도를 테스트하기 위해 개발하였다.

일반적으로 팬그램은 그 길이가 짧으면 짧을수록 더 흥미롭다.
 가능한 한 최소한의 글자의 반복을 포함한 팬그램을 만드는 일은 결코 쉬운 일이 아니다.
  좀 더 긴 팬그램 문장은 특별한 내용을 담거나 익살스럽든지 특이해야 그 자체로써의 주목할 가치가 있다.
   어떤 의미에서 팬그램은 리포그램과 반대되는 개념이라고 할 수 있는데 리포그램은 하나 혹은 그 이상의 특정 문자를 사용하지 않고 문장을 만드는 것이 목표이다.
   
 * */
public class DetectPangramTest {

  @Test
public void testName() throws Exception {
	  String pangram1 = "The quick brown fox jumps over the lazy dog.";
	  DetectPangram dp = new DetectPangram();
	  boolean result = dp.check(pangram1);
	  assertEquals(true, result);
}
  
  @Test
  public void test2() {
    String pangram2 = "You shall not pass!";
    DetectPangram dp = new DetectPangram();
	boolean result = dp.check(pangram2);
    assertEquals(false,result);
  }
  @Test
  public void test3() {
    String pangram1 = "Cwm fjord bank glyphs vext quiz";
    String pangram2 = "Pack my box with five dozen liquor jugs.";
    String pangram3 = "How quickly daft jumping zebras vex.";
    String pangram4 = "ABCD45EFGH,IJK,LMNOPQR56STUVW3XYZ";
    String pangram5 = "abcdefghijklmopqrstuvwxyz";
    DetectPangram pc = new DetectPangram();
   
    assertEquals(true, pc.check(pangram1));
    assertEquals(true, pc.check(pangram2));
    assertEquals(true, pc.check(pangram3));
    assertEquals(true, pc.check(pangram4));
    assertEquals(false, pc.check(pangram5));
  }

}
