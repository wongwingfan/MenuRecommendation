package com.example.menurecommendation;

import android.support.v7.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;
public class recipe extends AppCompatActivity {
    final List<Map<String, Object>> items = new ArrayList<Map<String,Object>>();

    private ListView listView;
    private SimpleAdapter simpleAdapter;
    private int[] image = {
            R.drawable.picture1, R.drawable.picture1, R.drawable.picture1,

    };
    private String[] imgText = {
            "recipe1", "recipe2", "recipe3",};


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recipe_activity);
        listView = (ListView)findViewById(R.id.list_view);

        for (int i = 0; i < image.length; i++) {
            Map<String, Object> item = new HashMap<String, Object>();
            item.put("image", image[i]);
            item.put("text", imgText[i]);
            items.add(item);
        }
        simpleAdapter = new SimpleAdapter(this,
                items, R.layout.listview, new String[]{"image", "text"},
                new int[]{R.id.image, R.id.text});
        listView.setAdapter(simpleAdapter);


        listView.setOnItemClickListener(new OnItemClickListener() {


            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                Map<String, Object> map = items.get(position);
                Toast.makeText(recipe.this, "choose recipe", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(recipe.this, recipeDetail.class);
                intent.putExtra("name", (String) map.get("text"));
                startActivity(intent);
            }
        });


    }

}
