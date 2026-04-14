import javax.swing.JOptionPane;

public class MainCuentaBancaria {
    public static void main(String[] args) {

        double saldo = 500.0;
        boolean continuar = true;


        while (continuar) {
            String menu = "CAJERO AUTOMÁTICO\n" +
                    "Saldo Actual: Bs" + saldo + "\n\n" +
                    "1) Consultar Saldo\n" +
                    "2) Realizar Depósito\n" +
                    "3) Realizar Retiro\n" +
                    "4) Salir\n\n" +
                    "Seleccione una opción:";

            String seleccion = JOptionPane.showInputDialog(null, menu);

            if (seleccion == null || seleccion.equals("4")) {
                break;
            }

            switch (seleccion) {
                case "1":
                    JOptionPane.showMessageDialog(null, "Tu saldo actual es: $" + saldo);
                    break;

                case "2":
                    String dep = JOptionPane.showInputDialog("Monto a depositar:");
                    if (dep != null) {
                        saldo += Double.parseDouble(dep);
                        JOptionPane.showMessageDialog(null, "Depósito exitoso.");
                    }
                    break;

                case "3":
                    String ret = JOptionPane.showInputDialog("Monto a retirar:");
                    if (ret != null) {
                        double monto = Double.parseDouble(ret);


                        if (monto > saldo) {
                            JOptionPane.showMessageDialog(null, "Error: Fondos insuficientes.");
                        } else if (monto % 10 != 0 && monto % 20 != 0) {
                            JOptionPane.showMessageDialog(null, "Error: El monto debe ser múltiplo de 10 o 20.");
                        } else {
                            saldo -= monto;
                            JOptionPane.showMessageDialog(null, "Retiro exitoso. Saldo restante: $" + saldo);
                        }
                    }
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
                    break;
            }
        }

        JOptionPane.showMessageDialog(null, "Gracias por usar el sistema.");
    }
}