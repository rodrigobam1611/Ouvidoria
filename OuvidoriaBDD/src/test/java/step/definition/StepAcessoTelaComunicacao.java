package step.definition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import browsers.Navegadores;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Ent�o;

public class StepAcessoTelaComunicacao {

	static WebDriver driver;
	WebElement element;
	Actions actions;
	final String  BASE_URL = "http://www.mprj.mp.br/comunicacao/ouvidoria";
	
	@Dado("^que eu esteja na p�gina da Ouvidoria$")
	public void que_eu_esteja_na_p�gina_da_Ouvidoria() throws Throwable {
	    
		driver = Navegadores.GoogleChrome(BASE_URL);
	}

	@Dado("^queira acessar a p�gina de Consultas$")
	public void queira_acessar_a_p�gina_de_Consultas() throws Throwable {
	    
		
	}

	@Ent�o("^devo clicar em Consulta de Comunica��o em Servi�os de �rea$")
	public void devo_clicar_em_Consulta_de_Comunica��o_em_Servi�os_de_�rea() throws Throwable {

		element = driver.findElement(By.xpath("//*[@id='portlet_56_INSTANCE_VT1tBMJgvzsZ']/div/div/div/div[1]/div[2]/a[2]/div/div[2]"));
		element.click();
		
		Thread.sleep(1500);
		driver.quit();
	}
	
}
