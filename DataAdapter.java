package oshin.tasnuva.recyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class DataAdapter extends RecyclerView.Adapter<DataViewHolder> {

    MyClick myClick;
    Context context;
    ArrayList<DataList>arrayList;

    public DataAdapter(MyClick myClick, Context context, ArrayList<DataList> arrayList) {
        this.myClick = myClick;
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public DataViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(context).inflate(R.layout.per_row,viewGroup,false);

        final DataViewHolder dataViewHolder = new DataViewHolder(view);


        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                myClick.OnMyClick(view,dataViewHolder.getPosition());

            }
        });


        return dataViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull DataViewHolder dataViewHolder, int i) {




        DataList dataList = arrayList.get(i);
        dataViewHolder.name.setText(dataList.getName());
        dataViewHolder.description.setText(dataList.getDescription());



    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}
