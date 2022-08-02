import { Cliente } from "./Cliente.js";

export class CuentaCorriente
{ 
    numero;
    agencia;
    #cliente;
    #saldo;
    static cantidadCuentas = 0;

    constructor(numero, agencia, cliente) {
        this.numero = numero;
        this.agencia = agencia;
        this.Cliente = cliente;
        this.#saldo = 0;
        CuentaCorriente.cantidadCuentas ++;
    }

    set Cliente(valor) {
        if (valor instanceof Cliente) {
            this.#cliente = valor;
        }
    }
    
    get Cliente() {
        return this.#cliente;
    }

    depositoEnCuenta(valor){
        if(valor > 0) 
            this.#saldo += valor;
        return this.#saldo;    
    }

    retiroDeCuenta(valor){
        if (valor <= this.#saldo)
            this.#saldo -= valor;
        return this.#saldo;    
    }

    verSaldo() {
        return this.#saldo;
    }

    transferirParaCuenta(valor, cuentaDestino) {
        this.retiroDeCuenta(valor);
        cuentaDestino.depositoEnCuenta(valor);
        valor = valor * 1000;
    }
}