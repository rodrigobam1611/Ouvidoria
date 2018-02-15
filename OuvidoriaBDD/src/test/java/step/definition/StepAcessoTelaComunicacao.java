package step.definition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import browsers.Navegadores;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;

public class StepAcessoTelaComunicacao {

	static WebDriver driver;
	WebElement element;
	Actions actions;
	final String  BASE_URL = "http://www.mprj.mp.br/comunicacao/ouvidoria";
	
	@Dado("^que eu esteja na página da Ouvidoria$")
	public void que_eu_esteja_na_página_da_Ouvidoria() throws Throwable {
	    
		driver = Navegadores.GoogleChrome(BASE_URL);
	}

	@Dado("^queira acessar a página de Consultas$")
	public void queira_acessar_a_página_de_Consultas() throws Throwable {
	    
		
	}

	@Então("^devo clicar em Consulta de Comunicação em Serviços de Área$")
	public void devo_clicar_em_Consulta_de_Comunicação_em_Serviços_de_Área() throws Throwable {

		element = driver.findElement(By.xpath("//*[@id='portlet_56_INSTANCE_VT1tBMJgvzsZ']/div/div/div/div[1]/div[2]/a[2]/div/div[2]"));
		element.click();
		
		Thread.sleep(1500);
		driver.quit();
	}
	
}
