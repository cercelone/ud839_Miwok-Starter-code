package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_words);

        final ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("red", "weṭeṭṭi", R.drawable.color_red, R.raw.number_one));
        words.add(new Word("green", "chokokki", R.drawable.color_green, R.raw.number_one));
        words.add(new Word("brown", "ṭakaakki", R.drawable.color_brown, R.raw.number_one));
        words.add(new Word("gray", "ṭopoppi", R.drawable.color_gray, R.raw.number_one));
        words.add(new Word("black", "kululli", R.drawable.color_black, R.raw.number_one));
        words.add(new Word("white", "kelelli", R.drawable.color_white, R.raw.number_one));
        words.add(new Word("dusty yellow", "ṭopiisә", R.drawable.color_dusty_yellow, R.raw.number_one));
        words.add(new Word("mustard yellow","chiwiiṭә", R.drawable.color_mustard_yellow, R.raw.number_one));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, R.color.category_colors, words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_words.xml layout file.
        ListView listView = (ListView) findViewById(R.id.words_list);
        listView.setAdapter(adapter);
    }
}
