// GerenciadorAcidentes.java
package graficos;

import model.Acidente;
import model.TipoAcidente;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

public class GerenciadorAcidentes {
    private DefaultCategoryDataset barDataset;
    private DefaultPieDataset pieDataset;
//    private XYSeries lineDataset;

    public GerenciadorAcidentes() {
        barDataset = new DefaultCategoryDataset();
        pieDataset = new DefaultPieDataset();
//        lineDataset = new XYSeries("Número de Acidentes");

        // Inicializa as categorias nos conjuntos de dados
        for (TipoAcidente tipo : TipoAcidente.values()) {
            String categoria = tipo.toString();
            barDataset.addValue(0, "Com Morte", categoria);
            barDataset.addValue(0, "Sem Morte", categoria);
            pieDataset.setValue(categoria, 0);
        }
    }

    public void adicionarAcidente(Acidente acidente) {
        String categoria = acidente.getTipo().toString();
        String serie = acidente.isMorte() ? "Com Morte" : "Sem Morte";

        // Adiciona valores ao conjunto de dados de barras
        int valorBar = barDataset.getValue(serie, categoria) != null
                ? ((Number) barDataset.getValue(serie, categoria)).intValue()  // Obtém o valor existente como Number e converte para int
                : 0;
        barDataset.addValue(valorBar + 1, serie, categoria);

        // Adiciona valores ao conjunto de dados de pizza
        double valorPie = pieDataset.getValue(categoria) != null
                ? pieDataset.getValue(categoria).doubleValue()
                : 0;
        pieDataset.setValue(categoria, valorPie + 1);

        // Adiciona valores ao conjunto de dados de linha
//        double valorLine = lineDataset.getY(categoria) != null ? lineDataset.getY(categoria).doubleValue() : 0;
//        lineDataset.addOrUpdate(categoria, valorLine + 1.0);
    }


    public JFreeChart criarGraficoDePizza() {
        return ChartFactory.createPieChart(
                "Estatísticas de Acidentes de Trânsito",
                pieDataset,
                true, // legenda
                true, // tooltips
                false // URLs
        );
    }

    public JFreeChart criarGraficoDeBarra() {
        return ChartFactory.createBarChart(
                "Estatísticas de Acidentes de Trânsito",
                "Tipo de Acidente",
                "Número de Acidentes",
                barDataset
        );
    }

//    public JFreeChart criarGraficoDeLinha() {
//        XYSeriesCollection dataset = new XYSeriesCollection(lineDataset);
//        return ChartFactory.createXYLineChart(
//                "Estatísticas de Acidentes de Trânsito",
//                "Tipo de Acidente",
//                "Número de Acidentes",
//                dataset
//        );


    public ChartPanel criarPainelDoGrafico(JFreeChart chart) {
        return new ChartPanel(chart);
    }
};