package pojotask;

import org.base.BaseClass;
import org.pommanager.AmazonPojo;

public class AmazonExe extends BaseClass {
	public static void main(String[] args) throws InterruptedException {
		BrouserLaunch("chrome","https://www.amazon.in/");
		Thread.sleep(2000);
		AmazonPojo ap = new AmazonPojo();
		ap.search("iphone");
		ap.resultstore();
		
		
	}

	
	
	

}
