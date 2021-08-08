package pesquisaDeSatisfacao;

import javax.swing.*;
import java.awt.*;

public class Main {
  private JFrame janela;
  private JButton btnMuitoSatisfeito;
  private JButton btnSatisfeito;
  private JButton btnInsatisfeito;
  private JLabel rotulo;
  private int totalMuitoSatisfeito;
  private int totalSatisfeito;
  private int totalInsatisfeito;

  public void preparaEventos() {
    btnMuitoSatisfeito.addActionListener(e -> {
      totalMuitoSatisfeito++;
      JOptionPane.showMessageDialog(null, "Clientes muito satisfeitos: " + totalMuitoSatisfeito, "Resultado parcial", JOptionPane.INFORMATION_MESSAGE);
    });
    btnSatisfeito.addActionListener(e -> {
      totalSatisfeito++;
      JOptionPane.showMessageDialog(null, "Clientes satisfeitos: " + totalSatisfeito, "Resultado parcial", JOptionPane.INFORMATION_MESSAGE);
    });
    btnInsatisfeito.addActionListener(e -> {
      totalInsatisfeito++;
      JOptionPane.showMessageDialog(null, "Clientes insatisfeitos: " + totalInsatisfeito, "Resultado parcial", JOptionPane.INFORMATION_MESSAGE);
    });
  }

  public void preparaComponentes() {
    rotulo = new JLabel("Como você se sentiu em nossa loja?");
    btnMuitoSatisfeito = new JButton("Muito satisfeito");
    btnSatisfeito = new JButton("Satisfeito");
    btnInsatisfeito = new JButton("Insatisfeito");
    janela.add(btnInsatisfeito);
    janela.add(rotulo);
    janela.add(btnMuitoSatisfeito);
    janela.add(btnSatisfeito);

  }

  public void preparaJanela() {
    janela = new JFrame("Pesquisa de satisfação");
    janela.setLayout(new FlowLayout());
    janela.setSize(400, 300);
    janela.setVisible(true);
    janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
  
  public static void main(String[] args) {
    Main main = new Main();
    main.preparaJanela();
    main.preparaComponentes();
    main.preparaEventos();
  }
}