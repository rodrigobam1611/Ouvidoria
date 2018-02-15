package step.definition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class StepEfetuarDenuncia {

	static WebDriver driver;
	WebElement element;
	Actions actions;
	final String  BASE_URL = "http://www.mprj.mp.br/comunicacao/ouvidoria";
	
	@Dado("^que eu deseje efetuar uma denúncia$")
	public void que_eu_deseje_efetuar_uma_denúncia() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Dado("^eu clicar no botão 'Denúncias, sugestões e outros'$")
	public void eu_clicar_no_botão_Denúncias_sugestões_e_outros() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Dado("^ser redirecionado à página 'Comunique à Ouvidoria'$")
	public void ser_redirecionado_à_página_Comunique_à_Ouvidoria() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Quando("^eu clicar no item 'Nova Comunicação'$")
	public void eu_clicar_no_item_Nova_Comunicação() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Então("^eu terei acesso ao formulário de denúncia$")
	public void eu_terei_acesso_ao_formulário_de_denúncia() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
}
