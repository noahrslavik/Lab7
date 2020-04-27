import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class HTMLTests {
	
	@Test
	public void testContainsWhiteSpace() {
			
			String html = "<b>                     </b>";
			
			Assertions.assertTrue(Lab7Regex.validateHTML(html));
			
		}

	@Test
	public void testContainsNumber() {
		
		String html = "<5>   </b>";
		
		Assertions.assertFalse(Lab7Regex.validateHTML(html));
		
	}
	
	@Test
	public void testEmpty() {
		
		String html = "<>         <>";
		
		Assertions.assertFalse(Lab7Regex.validateHTML(html));
		
	}
	
	@Test
	public void testNoCloseBracket() {
		
		String html = "<b>    </b ";
		
		Assertions.assertFalse(Lab7Regex.validateHTML(html));
		
	}
	
	@Test
	public void testCloseFirst() {
		
		String phone = "</b>      <b>";
		
		Assertions.assertFalse(Lab7Regex.validateHTML(phone));
		
	}

}
