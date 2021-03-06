package is.kings;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class HumanPlayerTest{

	@Test
	public void testCheckInput(){
		HumanPlayer h = new HumanPlayer();
		assertEquals(true, h.checkInput("7"));
	}

	@Test
	public void testCheckInputForString(){
		HumanPlayer h = new HumanPlayer();
		assertEquals(false, h.checkInput("Checking"));
	}

	@Test
	public void testCheckInputForSymbol(){
		HumanPlayer h = new HumanPlayer();
		assertEquals(false, h.checkInput("$"));
	}

	@Test
	public void testCheckInputForChar(){
		HumanPlayer h = new HumanPlayer();
		assertEquals(false, h.checkInput("H"));
	}

	@Test
	public void testCheckInputForTheNumberNine(){
		HumanPlayer h = new HumanPlayer();
		assertEquals(true, h.checkInput("9"));
	}

	@Test
	public void testCheckInputForTheNumberOne(){
		HumanPlayer h = new HumanPlayer();
		assertEquals(true, h.checkInput("1"));
	}

	@Test
	public void testCheckInputForTheNumberFive(){
		HumanPlayer h = new HumanPlayer();
		assertEquals(true, h.checkInput("5"));
	}

	@Test
	public void testCheckInputForANumberThatIsTooSmall(){
		HumanPlayer h = new HumanPlayer();
		assertEquals(false, h.checkInput("0"));
	}

	@Test
	public void testCheckInputForANegativeNumber(){
		HumanPlayer h = new HumanPlayer();
		assertEquals(false, h.checkInput("-21"));
	}

	@Test
	public void testCheckInputForANumberThatIsTooBig(){
		HumanPlayer h = new HumanPlayer();
		assertEquals(false, h.checkInput("10"));
	}

	@Test
	public void testPlayerMove(){
		Grid g = new Grid();
		HumanPlayer h = new HumanPlayer();
		assertEquals(true, h.playerMove(g, 4));
	}

	@Test
	public void testToMovePlayerIntoAMarkedField(){
		Grid g = new Grid();
		HumanPlayer h = new HumanPlayer();
		g.insertToGridPosition(1, 'X');
		assertEquals(false, h.playerMove(g, 1));
	}

	@Test
	public void tryToMovePlayerTwiceToTheSameField(){
		Grid g = new Grid();
		HumanPlayer h = new HumanPlayer();
		h.playerMove(g, 1);
		assertEquals(false, h.playerMove(g, 1));
	}

}
