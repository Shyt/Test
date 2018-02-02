package resource;

import java.awt.*;
import java.util.ListResourceBundle;

public class resource_ru extends ListResourceBundle {
    public static final Object[][] contents =
            {
                    { "test", "Russian" },
                    { "backgroundColor", Color.black },
                    { "defaultPaperSize", new double[] { 210, 297 } }
            };
    public Object[][] getContents(){ return contents;}
}
