package com.teste;
import org.junit.Test;
import org.mule.functional.junit4.*;
import org.mule.runtime.api.event.Event;

public class BasicTestCase extends ArtifactFunctionalTestCase {

	@Override
	protected String getConfigFile() {
		return "test-mule-config.xml";
	}
	
	//@Test
	public void sayHi() throws Exception {
		//Event event = this.flowRunner("testeFlow1").run();
		//String payload = event.getMessage().getPayload().getValue().toString();
		//System.out.println("HEY: " + payload);
	}
	
	@Test
	public void A() {
		
	}
	
	@Test 
	public void B() {
		
	}
	
}
