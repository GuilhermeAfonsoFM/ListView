package com.example.aluno.listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        String [] lista = {"Tela A","Tela B","Tela C"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,lista);

        ListView listView = (ListView) findViewById(R.id.listview);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                Intent intencaoa = null;
                if (position==0){
                    Toast.makeText(getBaseContext(),"Voce clicou na Tela A",Toast.LENGTH_LONG).show();
                    intencaoa = new Intent(MainActivity.this,TelaA.class);
                }
                else if (position==1){
                    Toast.makeText(getBaseContext(),"Voce clicou na Tela B",Toast.LENGTH_LONG).show();
                    Intent intencaob = new Intent(MainActivity.this,TelaB.class);
                }
                else if (position==2){
                    Toast.makeText(getBaseContext(),"Voce clicou na Tela C",Toast.LENGTH_LONG).show();
                    Intent intencaoc = new Intent(MainActivity.this,TelaC.class);
                }
                startActivity(intencaoa);

            }
        });
    }
}
