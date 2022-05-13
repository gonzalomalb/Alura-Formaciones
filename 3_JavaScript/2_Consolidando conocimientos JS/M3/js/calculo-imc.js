
var pacientes = document.querySelectorAll(".paciente");

for(i = 0; i < pacientes.length; i++){

    var paciente = pacientes[i];
    var peso = paciente.querySelector(".info-peso").textContent;
    var altura = paciente.querySelector(".info-altura").textContent;
    var tdImc = paciente.querySelector(".info-imc");

    var pesoEsValido = validarPeso(peso);
    var alturaEsValida = validarAltura(altura);

    if (!pesoEsValido) {
        console.log("Peso incorrecto");
        tdImc.textContent = "Peso incorecto";
        pesoEsValido = false;
        paciente.classList.add("paciente-incorrecto");
    }

    if (!alturaEsValida) {
        console.log("Altura incorrecta");
        tdImc.textContent = "Altura incorecta";
        alturaEsValida = false; 
        paciente.classList.add("paciente-incorrecto");
    }

    if (pesoEsValido && alturaEsValida){
        tdImc.textContent = calcularIMC(peso,altura);
    }
}

function validarPeso(peso){
    if(peso >= 0 && peso < 1000){
        return true;
    }
    else{
        return;
    }
}

function validarAltura(altura){
    if(altura >= 0 && altura < 3){
        return true;
    }
    else{
        return;
    }
}

function calcularIMC(peso,altura){
    var imc = peso / (altura * altura);
    return imc.toFixed(2);
}
  