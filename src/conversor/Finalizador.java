package conversor;

import javax.swing.JOptionPane;

public class Finalizador {
    public static void encerrarPrograma() {
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja encerrar o programa?", "Encerrar Programa",
                JOptionPane.YES_NO_OPTION);

        if (opcao == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Programa encerrado. Obrigado por usar o Conversor!",
                    "Encerrando o Programa", JOptionPane.INFORMATION_MESSAGE);
        } else {
            // Voltar para o menu de escolha de conversão
            Conversor.main(null);
        }
    }
}