import graficos.GerenciadorAcidentes;
import model.Acidente;
import model.TipoAcidente;

import javax.swing.*;
import java.awt.*;


public class Main {
    public static void main(String[] args) {
        GerenciadorAcidentes gerenciador = new GerenciadorAcidentes();

        gerenciador.adicionarAcidente(new Acidente(TipoAcidente.MOTO, true));
        gerenciador.adicionarAcidente(new Acidente(TipoAcidente.CARRO, false));
        gerenciador.adicionarAcidente(new Acidente(TipoAcidente.CARRO, false));
        gerenciador.adicionarAcidente(new Acidente(TipoAcidente.CARRO, false));
        gerenciador.adicionarAcidente(new Acidente(TipoAcidente.CARRO, false));
        gerenciador.adicionarAcidente(new Acidente(TipoAcidente.CARRO, false));
        gerenciador.adicionarAcidente(new Acidente(TipoAcidente.CARRO, false));
        gerenciador.adicionarAcidente(new Acidente(TipoAcidente.CARRO, false));
        gerenciador.adicionarAcidente(new Acidente(TipoAcidente.CARRO, false));
        gerenciador.adicionarAcidente(new Acidente(TipoAcidente.CARRO, false));
        gerenciador.adicionarAcidente(new Acidente(TipoAcidente.CARRO, false));
        gerenciador.adicionarAcidente(new Acidente(TipoAcidente.PEDESTRE, true));
        gerenciador.adicionarAcidente(new Acidente(TipoAcidente.PEDESTRE, true));
        gerenciador.adicionarAcidente(new Acidente(TipoAcidente.PEDESTRE, true));
        gerenciador.adicionarAcidente(new Acidente(TipoAcidente.PEDESTRE, true));
        gerenciador.adicionarAcidente(new Acidente(TipoAcidente.PEDESTRE, true));
        gerenciador.adicionarAcidente(new Acidente(TipoAcidente.PEDESTRE, true));
        gerenciador.adicionarAcidente(new Acidente(TipoAcidente.PEDESTRE, true));
        gerenciador.adicionarAcidente(new Acidente(TipoAcidente.CARRO, true));
        gerenciador.adicionarAcidente(new Acidente(TipoAcidente.MOTO, false));
        gerenciador.adicionarAcidente(new Acidente(TipoAcidente.MOTO, false));
        gerenciador.adicionarAcidente(new Acidente(TipoAcidente.MOTO, false));
        gerenciador.adicionarAcidente(new Acidente(TipoAcidente.MOTO, false));
        gerenciador.adicionarAcidente(new Acidente(TipoAcidente.MOTO, false));
        gerenciador.adicionarAcidente(new Acidente(TipoAcidente.MOTO, false));
        gerenciador.adicionarAcidente(new Acidente(TipoAcidente.MOTO, false));
        gerenciador.adicionarAcidente(new Acidente(TipoAcidente.MOTO, false));
        gerenciador.adicionarAcidente(new Acidente(TipoAcidente.MOTO, false));
        gerenciador.adicionarAcidente(new Acidente(TipoAcidente.MOTO, false));
        gerenciador.adicionarAcidente(new Acidente(TipoAcidente.MOTO, false));
        gerenciador.adicionarAcidente(new Acidente(TipoAcidente.MOTO, false));
        gerenciador.adicionarAcidente(new Acidente(TipoAcidente.MOTO, false));
        gerenciador.adicionarAcidente(new Acidente(TipoAcidente.MOTO, false));
        gerenciador.adicionarAcidente(new Acidente(TipoAcidente.MOTO, false));
        gerenciador.adicionarAcidente(new Acidente(TipoAcidente.MOTO, false));
        gerenciador.adicionarAcidente(new Acidente(TipoAcidente.MOTO, false));
        gerenciador.adicionarAcidente(new Acidente(TipoAcidente.MOTO, false));
        gerenciador.adicionarAcidente(new Acidente(TipoAcidente.MOTO, false));
        gerenciador.adicionarAcidente(new Acidente(TipoAcidente.MOTO, false));
        gerenciador.adicionarAcidente(new Acidente(TipoAcidente.MOTO, false));
        gerenciador.adicionarAcidente(new Acidente(TipoAcidente.MOTO, false));
        gerenciador.adicionarAcidente(new Acidente(TipoAcidente.MOTO, false));
        gerenciador.adicionarAcidente(new Acidente(TipoAcidente.MOTO, false));
        gerenciador.adicionarAcidente(new Acidente(TipoAcidente.MOTO, false));
        gerenciador.adicionarAcidente(new Acidente(TipoAcidente.MOTO, true));
        gerenciador.adicionarAcidente(new Acidente(TipoAcidente.MOTO, true));

        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Estatísticas de Acidentes de Trânsito");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JTabbedPane tabbedPane = new JTabbedPane();

            tabbedPane.addTab("Gráfico de Pizza", gerenciador.criarPainelDoGrafico(gerenciador.criarGraficoDePizza()));
            tabbedPane.addTab("Gráfico de Barras", gerenciador.criarPainelDoGrafico(gerenciador.criarGraficoDeBarra()));
//            tabbedPane.addTab("Gráfico de Linha", gerenciador.criarPainelDoGrafico(gerenciador.criarGraficoDeLinha()));

            frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);
            frame.setSize(800, 600);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}