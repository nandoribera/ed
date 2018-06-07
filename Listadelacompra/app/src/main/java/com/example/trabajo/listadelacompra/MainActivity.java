package com.example.trabajo.listadelacompra;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.StringTokenizer;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> itemList;
    private ArrayAdapter<String> adapter;

    private ListView list;
    private Button btn_add;
    private EditText editItem;

    private SharedPreferences save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list =  findViewById(R.id.list);
        btn_add = findViewById(R.id.btn_add);
        editItem = findViewById(R.id.editItem);

        itemList = new ArrayList<>();
        readSharedPreferences();

        adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                itemList
        );

        list.setAdapter(adapter);

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addItem();
            }
        });

        editItem.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                addItem();
                return true;
            }
        });

        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                removeItem(position);
            }
        });
    }

        private void removeItem(final int position){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle(R.string.confirm);
            builder.setMessage(String.format(
                    "¿Quieres borrar '%s'?",
                    itemList.get(position)
            ));
            builder.setPositiveButton("Confirmar", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    String item = itemList.get(position);
                    StringTokenizer tokenizer = new StringTokenizer(item,":");
                    String name = tokenizer.nextToken().trim();
                    SharedPreferences.Editor editItem = save.edit();
                    editItem.remove(name);
                    editItem.commit();
                    itemList.remove(position);
                    adapter.notifyDataSetChanged();
                }
            });
            builder.setNegativeButton("Cancelar", null);
            builder.create().show();
        }


        private void addItem() {
            String itemText = editItem.getText().toString();
            if(!itemText.isEmpty()){
                itemList.add(itemText);
                adapter.notifyDataSetChanged();
                SharedPreferences.Editor item = save.edit();
                item.putString(itemText,itemText);
                item.commit();
                editItem.setText("");
            }
        }

        public void writeItemList(){
        String FILENAME = "lista.txt";
        String item;
        try {
            FileOutputStream list = openFileOutput(FILENAME, Context.MODE_PRIVATE);
            for (int index = 0; index < itemList.size(); index++) {
                item = itemList.get(index).toString();
                list.write(item.getBytes());
            }
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void onStop(){
            super.onStop();
            writeItemList();
        }

    private void readSharedPreferences() {
        save = getSharedPreferences("list", Context.MODE_PRIVATE);
        Map<String,?> keys = save.getAll();
        for(Map.Entry<String,?> item : keys.entrySet()){
            itemList.add(item.getKey());
        }
    }
}
