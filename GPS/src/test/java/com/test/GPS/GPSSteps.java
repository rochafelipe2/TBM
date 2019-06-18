package com.test.GPS;

import org.junit.Assert;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GPSSteps {

	private int cidadeA, cidadeB;
	private Cidade cidade;
	
	@When("^Eu como usuário vou informar o codigo da cidadeA com valor '(\\d+)'$")
	public void eu_como_usuário_vou_informar_o_codigo_da_cidadeA_com_valor(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    cidade = new Cidade(arg1);
	}

	@When("^Eu como usuário vou informar o código da cidadeB com valor '(\\d+)'$")
	public void eu_como_usuário_vou_informar_o_código_da_cidadeB_com_valor(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    cidadeB = arg1;
	}

	@Then("^O Sistemas deverá apresentar a distancia '(\\d+)'$")
	public void o_Sistemas_deverá_apresentar_a_distancia(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    Assert.assertEquals(66, cidade.verificarDistancia(cidadeB),0);
	}

}
