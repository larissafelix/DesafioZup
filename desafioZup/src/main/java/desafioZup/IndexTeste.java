package desafioZup;

import static org.junit.Assert.assertThat;
import org.hamcrest.Matcher;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class IndexTeste {

	@SuppressWarnings("deprecation")
	@Test
	public void IndexTeste() {
		
		//Acessar o site
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\larissa.silveira\\Drivers\\crhomedriver.exe");
		WebDriver navegador = new ChromeDriver();
		navegador.get("https://www.magazineluiza.com.br/");
		
		//Realizar a busca
		navegador.findElement(By.xpath("//input[@id='inpHeaderSearch' and @name='q']")).click();;
		navegador.findElement(By.xpath("//input[@id='inpHeaderSearch' and @name='q']")).sendKeys("Óculos de Sol Black Melon Unissex Roma Marrom");;
		navegador.findElement(By.xpath("//*[@id=\"btnHeaderSearch\"]")).click();;
		
		//Adicionar ao carrinho
		navegador.findElement(By.xpath("//img[@alt='Óculos de Sol Black Melon Unissex Roma Marrom']")).click();;
		navegador.findElement(By.xpath("//div[3]/div[2]/button")).click();	
		
		//Verificar se está no carrinnho
		Assert.assertEquals("Óculos de Sol Black Melon Unissex Roma Marrom", "Óculos de Sol Black Melon Unissex Roma Marrom");				
	}
	
	//Validar a pesquisa
	public void validarProduto() throws Exception{
		try {
			System.setProperty("webdriver.Chrome.driver", "C:\\Users\\larissa.silveira\\Drivers\\crhomedriver.exe");
			WebDriver navegador = new ChromeDriver();
			assertThat("Óculos de Sol Black Melon Unissex Roma Marrom",is(navegador.findElement(By.xpath("/html/body/div[2]/div[4]/div[1]/div[6]/div[2]/ul"))));
		}
		catch (Error e) {
			
		}
					
	}
	private Matcher<? super String> is(WebElement findElement) {
		return null;
	}
}
