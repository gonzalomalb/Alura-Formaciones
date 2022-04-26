var button = document.querySelector("button");
var input = document.querySelector("input");
input.focus();

var string = "";
var letras = [];
var resultado = "";

function encriptar() {
    string = input.value;
    for (i = 0; i < string.length; i++) {
        if (string[i] == "a") {
            letras.push("ai");
        }
        else if (string[i] == "e") {
            letras.push("enter");
        }
        else if (string[i] == "i") {
            letras.push("imes");
        }
        else if (string[i] == "o") {
            letras.push("ober");
        }
        else if (string[i] == "u") {
            letras.push("ufat");
        }
        else {
            letras.push(string[i])
        }
    }
}

function desencriptar() {
    string = input.value;
    var i = 0
    while (i < string.length) {
        if (string[i] == "a") {
            letras.push("a");
            i = i + 2;
        }
        else if (string[i] == "e") {
            letras.push("e");
            i = i + 5;
        }
        else if (string[i] == "i") {
            letras.push("i");
            i = i + 4;
        }
        else if (string[i] == "o") {
            letras.push("o");
            i = i + 4;
        }
        else if (string[i] == "u") {
            letras.push("u");
            i = i + 4;
        }
        else {
            letras.push(string[i]);
            i = i + 1
        }
    }
}

function generarEncriptado() {
    var i = 0;
    encriptar();
    while (i < letras.length - 1) {
        resultado = resultado + letras[i];
        i++;
    }
    alert(resultado);
    string = "";
    letras = [];
    resultado = "";
}

function generarDesencriptado() {
    var i = 0;
    desencriptar();
    while (i < letras.length - 1) {
        resultado = resultado + letras[i];
        i++;
    }
    alert(resultado);
    string = "";
    letras = [];
    resultado = "";
    return false
}

button.onclick = generarEncriptado;
button.oncontextmenu = generarDesencriptado;