package step.definition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Ent�o;
import cucumber.api.java.pt.Quando;

public class StepEfetuarDenuncia {

	static WebDriver driver;
	WebElement element;
	Actions actions;
	final String  BASE_URL = "http://www.mprj.mp.br/comunicacao/ouvidoria";
	
	@Dado("^que eu deseje efetuar uma den�ncia$")
	public void que_eu_deseje_efetuar_uma_den�ncia() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Dado("^eu clicar no bot�o 'Den�ncias, sugest�es e outros'$")
	public void eu_clicar_no_bot�o_Den�ncias_sugest�es_e_outros() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Dado("^ser redirecionado � p�gina 'Comunique � Ouvidoria'$")
	public void ser_redirecionado_�_p�gina_Comunique_�_Ouvidoria() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Quando("^eu clicar no item 'Nova Comunica��o'$")
	public void eu_clicar_no_item_Nova_Comunica��o() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Ent�o("^eu terei acesso ao formul�rio de den�ncia$")
	public void eu_terei_acesso_ao_formul�rio_de_den�ncia() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
}
