#language: en
Feature: calcularDistancia
Como usuário gostaria de verificar a distancia entre duas cidades
	Scenario: calculardistancia.
	//Given Eu como usuário vou selecionar calcular distancia entre duas cidades 
	When Eu como usuário vou informar o codigo da cidadeA com valor '12' 
	And Eu como usuário vou informar o código da cidadeB com valor '1' 
	Then O Sistemas deverá apresentar a distancia '66'  
	