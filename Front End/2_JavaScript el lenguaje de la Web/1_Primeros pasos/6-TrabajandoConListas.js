console.log(`trabajando con Listas`);

const bogota = "Bogotá";
const lima = "Lima";
const santiago = "Santiago";
const buenosAires = "Buenos Aires";
console.log(bogota, lima, santiago, buenosAires);

/* const ciudadesDisponibles = ["Bogotá", "Lima", "Santiago", "Buenos Aires"]; */
const ciudadesDisponibles = new Array();

ciudadesDisponibles.push('Bogotá');
ciudadesDisponibles.push('Caracas');
ciudadesDisponibles.push('Lima');
console.log(ciudadesDisponibles)

const ciudadesMasVendidas = [];
ciudadesMasVendidas.push("Sao Paulo");
ciudadesMasVendidas.push("Buenos Aires");
console.log(ciudadesMasVendidas);

console.log(ciudadesDisponibles[2]);
console.log(ciudadesMasVendidas[0]);

const cantidadCiudades = ciudadesDisponibles.length;
console.log(`Tenemos ${cantidadCiudades} ciudades disponibles`);

ciudadesDisponibles.splice(1,1);
console.log(ciudadesDisponibles);