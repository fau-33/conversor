package conversor;
import javax.swing.JOptionPane;

public class Conversor {

    public static void main(String[] args) {
        String[] opcoes = { "Conversão de Moedas", "Conversão de Temperaturas" };

        String escolha = (String) JOptionPane.showInputDialog(null, "Escolha uma opção:",
                "Conversor - Opções de Conversão", JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]);

        if (escolha != null) {
            if (escolha.equals("Conversão de Moedas")) {
                MoedaConversor.moedaConversao();
            } else if (escolha.equals("Conversão de Temperaturas")) {
                TemperaturaConversor.temperaturaConversao();
            }
        }
        Finalizador.encerrarPrograma();
    }
}



