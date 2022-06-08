var botonAdicionar =  document.querySelector("#adicionar-paciente");
botonAdicionar.addEventListener("click",function(event){
    event.preventDefault();

    var form = document.querySelector("#form-adicionar");
    var nombre = form.nombre.value;
    var peso = form.peso.value;
    var altura = form.altura.value;
    var gordura = form.gordura.value;

    var tabla = document.querySelector("#tabla-pacientes")

    pacienteTr = document.createElement("tr");
    nombreTd = document.createElement("td");
    pesoTd = document.createElement("td");
    alturaTd = document.createElement("td");
    gorduraTd = document.createElement("td");
    imcTd = document.createElement("td");

    nombreTd.textContent = nombre;
    pesoTd.textContent = peso;
    alturaTd.textContent = altura;
    gorduraTd.textContent = gordura; 

    pacienteTr.appendChild(nombreTd);
    pacienteTr.appendChild(pesoTd);
    pacienteTr.appendChild(alturaTd);
    pacienteTr.appendChild(gorduraTd);

    tabla.appendChild(pacienteTr)

});

var pacientes = document.querySelectorAll(".paciente");

for(i = 0; i < pacientes.length; i++){

    var paciente = pacientes[i];
    var peso = paciente.querySelector(".info-peso").textContent;
    var altura = paciente.querySelector(".info-altura").textContent;
    var tdImc = paciente.querySelector(".info-imc");
    var pesoEsValido = true;
    var alturaEsValida = true;

    if ((peso < 0) || (peso > 1000)) {
        console.log("Peso incorrecto");
        tdImc.textContent = "Peso incorecto";
        pesoEsValido = false;
        paciente.classList.add("paciente-incorrecto");
    }

    if ((altura < 0) || (altura > 3)) {
        console.log("Altura incorrecta");
        tdImc.textContent = "Altura incorecta";
        alturaEsValida = false; 
        paciente.classList.add("paciente-incorrecto");
    }

    if (pesoEsValido && alturaEsValida){
        var imc = peso / (altura * altura);
        tdImc.textContent = imc.toFixed(2);
    }
}


  