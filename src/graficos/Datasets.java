package graficos;

import org.jfree.data.category.CategoryDataset;
import org.jfree.data.general.PieDataset;

public interface Datasets {

    CategoryDataset getCategoryDataset();

    PieDataset getPieDataset();

}
