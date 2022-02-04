package Day13;

import java.util.logging.Logger;

public class Adapter {

   private ItemClickListener itemClickListener;

    Adapter(ItemClickListener itemClickListener){
        this.itemClickListener = itemClickListener;
    }
    void onButtonClicked(){
        Logger.getGlobal().info(" Button is clicked");
        this.itemClickListener.onItemClicked(1245);
    }


    interface  ItemClickListener{

        void onItemClicked(int pos);


    }


}
