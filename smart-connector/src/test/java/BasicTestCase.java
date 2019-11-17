import org.junit.Test;
import org.mule.functional.junit4.MuleArtifactFunctionalTestCase;

public class BasicTestCase extends MuleArtifactFunctionalTestCase {

	@Override
	protected String getConfigFile() {
		return "test.xml";
	}
	
	@Test
	public void validate() {
		
	}
}
