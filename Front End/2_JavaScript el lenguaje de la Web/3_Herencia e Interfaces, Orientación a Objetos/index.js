/*Importación de clases*/
import { Cuenta } from './Cuentas/Cuenta.js';
import {CuentaCorriente} from './Cuentas/CuentaCorriente.js';
import {CuentaAhorro} from './Cuentas/CuentaAhorro.js';
import { CuentaNomina } from './Cuentas/CuentaNomina.js';
import { Empleado } from './Empleados/Empleado.js';
import { Gerente } from './Empleados/Gerente.js';
import { Director } from './Empleados/Director.js';
import { Cliente } from './Cliente.js';
import { SistemaAutenticacion } from './SistemaAutenticacion.js';

const empleado = new Empleado ('Juan Perez', '1234343', 10000);
console.log('El sueldo de Juan Perez con el bono es: ' + empleado.verBonificacion());
empleado.asignarClave('12345');
console.log('Juan Perez está autentificado: ' + SistemaAutenticacion.login(empleado, '12345'));

const gerente = new Gerente ('Pedro Rivas', '232344', 12000);
console.log('El sueldo de Pedro Rivas con el bono es: ' + gerente.verBonificacion());
gerente.asignarClave('6556');
console.log('Pedro Rivas está autentificado: ' + SistemaAutenticacion.login(gerente, '6556'));

const director = new Director ('Elena Moreno', '232323', 15000);
console.log('El sueldo de Elena Moreno con el bono es: ' + director.verBonificacion());

const cliente = new Cliente('Leonardo','13804050','123224');
cliente.asignarClave('1111');
console.log('El cliente Leonardo está autentificado: ' + SistemaAutenticacion.login(cliente, '1111'));

const cliente2 = new Cliente('María','16979808','8989');

const cuentaDeLeonardo = new CuentaCorriente(cliente, '1', '001');
const cuentaDeMaria = new CuentaCorriente(cliente2,'2','002');

const cuentaAhorroLeonardo = new CuentaAhorro(cliente, '9985', '001', 0);
const cuentaNominaLeonardo = new CuentaNomina(cliente, '9985', '001', 100);

console.log(cuentaNominaLeonardo);
cuentaNominaLeonardo.depositoEnCuenta(150);
console.log(cuentaNominaLeonardo.verSaldo());

cuentaNominaLeonardo.retirarDeCuenta(50);
console.log(cuentaNominaLeonardo.verSaldo());

console.log(cuentaDeLeonardo);
cuentaDeLeonardo.depositoEnCuenta(150);
console.log(cuentaDeLeonardo.verSaldo());
cuentaDeLeonardo.retirarDeCuenta(70);
console.log(cuentaDeLeonardo.verSaldo());

console.log(cuentaAhorroLeonardo);
cuentaAhorroLeonardo.depositoEnCuenta(200);
console.log(cuentaAhorroLeonardo.verSaldo());
cuentaAhorroLeonardo.retirarDeCuenta(120);
console.log(cuentaAhorroLeonardo.verSaldo());




