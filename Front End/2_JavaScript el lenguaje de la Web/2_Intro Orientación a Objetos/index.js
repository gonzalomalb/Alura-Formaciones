/*Importación de clases*/
import {Cliente} from './Cliente.js';
import {CuentaCorriente} from './CuentaCorriente.js';

const cliente = new Cliente("Leonardo", "13804050", "123224");
const cuentaDeLeonardo = new CuentaCorriente('1', '001', cliente);
console.log(cuentaDeLeonardo);
console.log(cuentaDeLeonardo.Cliente);
let saldoLeonardo = cuentaDeLeonardo.verSaldo();

const cliente2 = new Cliente("Maria", "16979809", "8989");
const cuentaDeMaria = new CuentaCorriente('2' ,'002', cliente2);
console.log(cuentaDeMaria);
console.log(cuentaDeMaria.Cliente);
let saldoMaria = cuentaDeMaria.verSaldo();

console.log(`Cantida de cuentas creadas: ` + CuentaCorriente.cantidadCuentas);

saldoLeonardo = cuentaDeLeonardo.depositoEnCuenta(150);
console.log(`El saldo actual de ${cliente.nombreCliente} es de $` + saldoLeonardo);

const variableValor = 100;
cuentaDeLeonardo.transferirParaCuenta(variableValor, cuentaDeMaria);
console.log("El valor de variableValor luego de la operación: " + variableValor);

saldoLeonardo = cuentaDeLeonardo.verSaldo();
saldoMaria = cuentaDeMaria.verSaldo();
console.log(`El saldo actual de ${cliente.nombreCliente} es de $` + saldoLeonardo);
console.log(`El saldo actual de ${cliente2.nombreCliente} es de $` + saldoMaria);







