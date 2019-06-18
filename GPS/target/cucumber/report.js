$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("GPS.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: en"
    }
  ],
  "line": 2,
  "name": "calcularDistancia",
  "description": "Como usuário gostaria de verificar a distancia entre duas cidades",
  "id": "calculardistancia",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "calculardistancia.",
  "description": "//Given Eu como usuário vou selecionar calcular distancia entre duas cidades",
  "id": "calculardistancia;calculardistancia.",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "Eu como usuário vou informar o codigo da cidadeA com valor \u002712\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Eu como usuário vou informar o código da cidadeB com valor \u00271\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "O Sistemas deverá apresentar a distancia \u002766\u0027",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "12",
      "offset": 60
    }
  ],
  "location": "GPSSteps.eu_como_usuário_vou_informar_o_codigo_da_cidadeA_com_valor(int)"
});
formatter.result({
  "duration": 347063467,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 60
    }
  ],
  "location": "GPSSteps.eu_como_usuário_vou_informar_o_código_da_cidadeB_com_valor(int)"
});
formatter.result({
  "duration": 118186,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "66",
      "offset": 42
    }
  ],
  "location": "GPSSteps.o_Sistemas_deverá_apresentar_a_distancia(int)"
});
formatter.result({
  "duration": 3403094,
  "error_message": "java.lang.AssertionError: expected:\u003c66.0\u003e but was:\u003c70.0\u003e\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.failNotEquals(Assert.java:834)\r\n\tat org.junit.Assert.assertEquals(Assert.java:553)\r\n\tat org.junit.Assert.assertEquals(Assert.java:683)\r\n\tat com.test.GPS.GPSSteps.o_Sistemas_deverá_apresentar_a_distancia(GPSSteps.java:29)\r\n\tat ✽.Then O Sistemas deverá apresentar a distancia \u002766\u0027(GPS.feature:8)\r\n",
  "status": "failed"
});
});