package step.definition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;

public class StepConsultaDenuncia {

	static WebDriver driver;
	WebElement element;
	Actions actions;
	final String  BASE_URL = "http://www.mprj.mp.br/comunicacao/ouvidoria";
	
	@Dado("^que sou um denunciante$")
	public void que_sou_um_denunciante() throws Throwable {
	    
		
	}

	@Dado("^queira consultar uma denúncia feita$")
	public void queira_consultar_uma_denúncia_feita() throws Throwable {
	    
	}

	@Então("^poderei acompanhar o andamento do processo$")
	public void poderei_acompanhar_o_andamento_do_processo() throws Throwable {
	    
	}
	
}
