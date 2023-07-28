package shopping.list;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PurchaseViewHolder2 extends RecyclerView.ViewHolder {
    TextView newPurchase;
    TextView remember;

    public PurchaseViewHolder2(@NonNull View itemView) {
        super(itemView);
        newPurchase = itemView.findViewById(R.id.textViewPurchase);
        remember = itemView.findViewById(R.id.textViewToRemember);
    }
}
