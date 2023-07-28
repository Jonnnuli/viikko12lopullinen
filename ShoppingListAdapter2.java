package shopping.list;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ShoppingListAdapter2 extends RecyclerView.Adapter<PurchaseViewHolder2> {
    //työntää oikeat käyttäjät näkymään

    private Context context;
    private ArrayList<Purchase> purchases = new ArrayList<>();

    public ShoppingListAdapter2(Context context, ArrayList<Purchase> purchases) {
        this.context = context;
        this.purchases = purchases;
    }

    @NonNull
    @Override
    public PurchaseViewHolder2 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PurchaseViewHolder2(LayoutInflater.from(context).inflate(R.layout.purchase_view, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull PurchaseViewHolder2 holder, int position) { //laittaa ne oikeet tiedot näkyviin
        holder.newPurchase.setText(purchases.get(position).getPurchase());
        holder.remember.setText(purchases.get(position).getRemember());
    }

    @Override
    public int getItemCount() {
        return purchases.size();
    }
}

