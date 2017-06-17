package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_words);

        final ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("", "", 0, R.raw.number_one));
        words.add(new Word("", "", 0, R.raw.number_one));
        words.add(new Word("", "", 0, R.raw.number_one));
        words.add(new Word("", "", 0, R.raw.number_one));
        words.add(new Word("", "", 0, R.raw.number_one));
        words.add(new Word("", "", 0, R.raw.number_one));
        words.add(new Word("", "", 0, R.raw.number_one));
        words.add(new Word("", "", 0, R.raw.number_one));
        words.add(new Word("", "", 0, R.raw.number_one));
        words.add(new Word("", "", 0, R.raw.number_one));

        WordAdapter adapter = new WordAdapter(this, R.color.category_phrases, words);

        ListView listView = (ListView) findViewById(R.id.words_list);
        listView.setAdapter(adapter);
    }
}
