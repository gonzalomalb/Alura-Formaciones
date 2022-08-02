console.log(`Trabajando con Lazos`);

const ciudadesDisponibles = new Array();

ciudadesDisponibles.push('Bogotá');
ciudadesDisponibles.push('Caracas');
ciudadesDisponibles.push('Lima');
ciudadesDisponibles.push('Santiago');

const edadComprador = 16;
const estaAcompanado = true;
const tienePasaje = true;
const ciudadDestino = 'Lima';
let destinoDisponible = false;
let puedeComprar = false

puedeComprar = (edadComprador >= 18 || estaAcompanado);

console.log(ciudadesDisponibles);

/* let posicion = 0;
while (posicion <= ciudadesDisponibles.length ) {
    if (ciudadesDisponibles[posicion] == ciudadDestino) {
        destinoDisponible = true;
        break;
    }
    posicion ++;
} */   

for (posicion = 0; posicion <= ciudadesDisponibles.length; posicion++) {
    if (ciudadesDisponibles[posicion] == ciudadDestino) {
        destinoDisponible = true;
        break;
    }
}

if (puedeComprar && destinoDisponible){
    console.log(`Destino disponible, habilitado para comprar el pasaje`);
} else if (!destinoDisponible) {
    console.log(`Destino NO disponible`);
} else {
    console.log(`No habilitado para comprar el pasaje`);
}
