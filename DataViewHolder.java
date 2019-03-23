package oshin.tasnuva.recyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;


public class DataViewHolder extends RecyclerView.ViewHolder {

    TextView name,description;

    public DataViewHolder(@NonNull View itemView) {
        super(itemView);

        name = itemView.findViewById(R.id.name);
        description = itemView.findViewById(R.id.description);
    }
}
