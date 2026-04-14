public class CuentaBancaria {
    private double saldo;

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
        }
    }

    public String retirar(double monto) {

        if (monto > saldo) {
            return "Error: Fondos insuficientes.";
        }

        if (monto % 10 != 0 && monto % 20 != 0) {
            return "Error: El monto debe ser múltiplo de 10 o 20.";
        }

        saldo -= monto;
        return "Retiro exitoso. Saldo restante: $" + saldo;
    }
}