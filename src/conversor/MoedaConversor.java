package conversor;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class MoedaConversor {
    public static void moedaConversao() {
        String valorString = JOptionPane.showInputDialog(null, "Digite o valor:",
                "Conversor - Conversão de Moedas", JOptionPane.PLAIN_MESSAGE);

        if (valorString != null && !valorString.isEmpty()) {
            // Validando se o valor contém apenas números usando uma expressão regular
            if (valorString.matches("[0-9]+")) {
                double valor = Double.parseDouble(valorString);

                String[] moedas = { "Dólar", "Euro", "Libra Esterlina", "Peso Argentino", "Peso Chileno" };
                String moedaEscolhida = (String) JOptionPane.showInputDialog(null,
                        "Escolha a moeda de conversão:", "Conversor - Moedas", JOptionPane.PLAIN_MESSAGE, null,
                        moedas, moedas[0]);

                if (moedaEscolhida != null) {
                    double valorConvertido = 0.0;

                    if (moedaEscolhida.equals("Dólar")) {
                        valorConvertido = converterReaisParaDolar(valor);
                    } else if (moedaEscolhida.equals("Euro")) {
                        valorConvertido = converterReaisParaEuro(valor);
                    } else if (moedaEscolhida.equals("Libra Esterlina")) {
                        valorConvertido = converterReaisParaLibraEsterlina(valor);
                    } else if (moedaEscolhida.equals("Peso Argentino")) {
                        valorConvertido = converterReaisParaPesoArgentino(valor);
                    } else if (moedaEscolhida.equals("Peso Chileno")) {
                        valorConvertido = converterReaisParaPesoChileno(valor);
                    }

                    DecimalFormat df = new DecimalFormat("#.00");
                    String valorConvertidoFormatado = df.format(valorConvertido);

                    JOptionPane.showMessageDialog(null,
                            "Valor: " + df.format(valor) + " Reais\nValor convertido para " + moedaEscolhida + ": "
                                    + valorConvertidoFormatado,
                            "Conversão de Moedas - Resultado", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Digite um valor numérico válido.", "Erro - Valor Inválido",
                        JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Digite um valor para realizar a conversão.", "Aviso - Valor Vazio",
                    JOptionPane.WARNING_MESSAGE);
        }
    }

    private static double converterReaisParaDolar(double valor) {
        return valor * 5.29; // Exemplo de conversão para dólar
    }

    private static double converterReaisParaEuro(double valor) {
        return valor * 6.18; // Exemplo de conversão para euro
    }

    private static double converterReaisParaLibraEsterlina(double valor) {
        return valor * 7.14; // Exemplo de conversão para libra esterlina
    }

    private static double converterReaisParaPesoArgentino(double valor) {
        return valor * 0.054; // Exemplo de conversão para peso argentino
    }

    private static double converterReaisParaPesoChileno(double valor) {
        return valor * 0.007; // Exemplo de conversão para peso chileno
    }

    public static void main(String[] args) {
        moedaConversao();
    }
}

