package Assignment;


import org.openqa.selenium.edge.EdgeDriver;

public class Task2 {

	public static void main(String[] args) {
		
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.baskinrobbinsmea.com/en/");
		String titleOfWebBrowser=driver.getTitle();
		System.out.println(titleOfWebBrowser);
	}

}
