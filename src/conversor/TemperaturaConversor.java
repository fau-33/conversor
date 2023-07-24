package conversor;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class TemperaturaConversor {
    public static void temperaturaConversao() {
        String valorString = JOptionPane.showInputDialog(null, "Digite a temperatura em Celsius:",
                "Conversor - Conversão de Temperaturas", JOptionPane.PLAIN_MESSAGE);

        if (valorString != null && !valorString.isEmpty()) {
            // Utilizando uma expressão regular para verificar se contém apenas números
            if (valorString.matches("[0-9]+")) {
                try {
                    double valor = Double.parseDouble(valorString);
                    double valorConvertido = (valor * 9 / 5) + 32; // Exemplo de conversão para Fahrenheit
                    
                    // Formatando o valorConvertido para exibir com duas casas decimais
                    DecimalFormat df = new DecimalFormat("#.00");
                    String valorConvertidoFormatado = df.format(valorConvertido);

                    JOptionPane.showMessageDialog(null,
                            "Temperatura em Celsius: " + valor + "\nTemperatura convertida em Fahrenheit: "
                                    + valorConvertidoFormatado,
                            "Conversão de Temperaturas - Resultado", JOptionPane.INFORMATION_MESSAGE);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Digite um valor numérico válido.", "Erro - Valor Inválido",
                            JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Digite apenas números válidos.", "Erro - Valor Inválido",
                        JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Digite um valor para realizar a conversão.", "Aviso - Valor Vazio",
                    JOptionPane.WARNING_MESSAGE);
        }
    }
}
