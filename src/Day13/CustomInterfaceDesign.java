package Day13;

import java.util.logging.Logger;

public class CustomInterfaceDesign implements Adapter.ItemClickListener{

    public static void main(String[] args) {
        Adapter adapter = new Adapter(new CustomInterfaceDesign());
        adapter.onButtonClicked();
    }

    @Override
    public void onItemClicked(int pos) {
        Logger.getGlobal().info("Item is clicked.");
    }
}
