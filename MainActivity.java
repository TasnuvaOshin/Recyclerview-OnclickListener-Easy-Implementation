package oshin.tasnuva.recyclerview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<DataList> arrayList;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        arrayList =  new ArrayList<DataList>();



          DataList dataList = new DataList("Mr Mike","He is a good coder");
          arrayList.add(dataList);
        dataList = new DataList("Mr Mike","He is a good coder");
        arrayList.add(dataList);
        dataList = new DataList("Mr kike","He is  coder");
        arrayList.add(dataList);
        dataList = new DataList("Mr Bike","He iscoder");
        arrayList.add(dataList);
        dataList = new DataList("Mr Coke","He is a good cor");
        arrayList.add(dataList);
        dataList = new DataList("Mr Lok","He is a good cor");
        arrayList.add(dataList);
        dataList = new DataList("Mr Mij","He is agood coder");
        arrayList.add(dataList);
        dataList = new DataList("Mr Jack"," a good coder");
        arrayList.add(dataList);
        dataList = new DataList("Mr Mik","He good coder");
        arrayList.add(dataList);










        DataAdapter dataAdapter = new DataAdapter(new MyClick() {
            @Override
            public void OnMyClick(View view, int position) {

                String name = arrayList.get(position).getName();
                Intent i = new Intent(MainActivity.this,Main2Activity.class);
                i.putExtra("name",name);
                     startActivity(i);


            }
        },getApplicationContext(),arrayList);



        recyclerView.setAdapter(dataAdapter);

    }
}
