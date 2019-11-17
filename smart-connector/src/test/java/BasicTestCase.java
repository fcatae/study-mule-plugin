import org.junit.Test;
import org.mule.functional.junit4.MuleArtifactFunctionalTestCase;
import org.mule.runtime.api.event.Event;

public class BasicTestCase extends MuleArtifactFunctionalTestCase {

	@Override
	protected String getConfigFile() {
		return "test.xml";
	}
	
	@Test
	public void validate() throws Exception {
		Event event = flowRunner("testFlow").run();
		String result = event.getMessage().getPayload().getValue().toString();
		System.out.println("YEAH: " + result);
	}
}
