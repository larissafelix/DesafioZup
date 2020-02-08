package desafioZup;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PesquisaOrdenacaoTeste {

		@SuppressWarnings("deprecation")
		@Test
		public void PesquisaOrdenacaoTeste() {
			
			//Acessar o site
			System.setProperty("webdriver.Chrome.driver", "C:\\Users\\larissa.silveira\\Drivers\\crhomedriver.exe");
			WebDriver navegador = new ChromeDriver();
			navegador.get("https://www.magazineluiza.com.br/");
			navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			
			//Realizar a busca
			navegador.findElement(By.xpath("//input[@id='inpHeaderSearch' and @name='q']")).click();;
			navegador.findElement(By.xpath("//input[@id='inpHeaderSearch' and @name='q']")).sendKeys("Mochila de girafa");;
			navegador.findElement(By.xpath("//*[@id=\"btnHeaderSearch\"]")).click();;
			
			//Ordernar pesquisa
			navegador.findElement(By.xpath("/html/body/div[2]/div[4]/div[1]/div[6]/div[2]/div[4]/div[2]/select")).click();;
			navegador.findElement(By.xpath("/html/body/div[2]/div[4]/div[1]/div[6]/div[2]/div[4]/div[2]/select/option[2]")).click();;

		}
}
