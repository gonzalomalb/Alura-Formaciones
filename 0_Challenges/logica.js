

const windowInput = document.querySelector(".input");
const windowOutput = document.querySelector(".output");
windowInput.focus();

let string = "";
let letras = [];
let resultado = "";

function encriptar() {
    string = windowInput.value;
    for (i = 0; i < string.length + 1; i++) {
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
    string = windowInput.value;
    let i = 0
    while (i < string.length + 1) {
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
    let i = 0;
    encriptar();
    while (i < letras.length - 1) {
        resultado = resultado + letras[i];
        i++;
    }
    windowOutput.value = resultado;
    string = "";
    letras = [];
    resultado = "";
}

function generarDesencriptado() {
    let i = 0;
    desencriptar();
    while (i < letras.length - 1) {
        resultado = resultado + letras[i];
        i++;
    }
    windowOutput.value = resultado;
    string = "";
    letras = [];
    resultado = "";
    return false
}

function copiar(){
    let copiarTexto = windowOutput;
    copiarTexto.select();
    document.execCommand("copy");
}

function borrar(){
    windowInput.value = "";
    windowOutput.value = "";
}
