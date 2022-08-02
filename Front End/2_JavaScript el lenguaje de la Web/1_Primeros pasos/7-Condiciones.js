console.log(`Trabajando con Condiciones`);

const ciudadesDisponibles = new Array();

ciudadesDisponibles.push(' Bogotá');
ciudadesDisponibles.push(' Caracas');
ciudadesDisponibles.push(' Lima');
console.log(ciudadesDisponibles);

const edadComprador = 16;
const estaAcompanado = true;
const tienePasaje = true;

if (edadComprador >= 18 || estaAcompanado) {
    console.log(`Es posible vender pasajes`);
    console.log(`Ciudades disponibles para viaje${ciudadesDisponibles}.`);
}else {
    console.log(`El comprador NO es mayor de edad y NO esta acompañado`);
    console.log(`No es posible ofrecer viajes`);
}

if (tienePasaje && (edadComprador >= 18 || estaAcompanado)) {
    console.log(`Comprador con pasaje. Feliz viaje`);
} else {
    console.log(`No es posible hacer el embarque`);
}

console.log(`La edad del comprador es mayor o igual (>=) a 18: ${edadComprador >= 18}`);
console.log(`La edad del comprador es mayor (>) a 18: ${edadComprador > 18} `);
console.log(`La edad del comprador es menor o igual (<=) a 18: ${edadComprador <= 18}`);
console.log(`La edad del comprador es menor (<) a 18: ${edadComprador < 18}`);
console.log(`La edad del comprador es igual (==) a 18: ${edadComprador == 18}`);
console.log(`La edad del comprador no es igual (!=) a 18: ${edadComprador != 18}`);