var paciente = document.querySelector("#primer-paciente");
var peso = paciente.querySelector(".info-peso").textContent;
var altura = paciente.querySelector(".info-altura").textContent;
var tdImc = paciente.querySelector(".info-imc");

var pesoEsValido = true;
var alturaEsValida = true;

if ((peso < 0) || (peso > 1000)) {
    console.log("Peso incorrecto");
    tdImc.textContent = "Peso incorecto";
    pesoEsValido = false;
}

if ((altura < 0) || (altura > 3)) {
    console.log("Altura incorrecta");
    tdImc.textContent = "Altura incorecta";
    alturaEsValida = false; 
}

if (pesoEsValido && alturaEsValida){
    var imc = peso / (altura * altura);
    tdImc.textContent = imc;
}
  