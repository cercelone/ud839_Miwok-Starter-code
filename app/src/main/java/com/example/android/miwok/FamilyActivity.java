package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_words);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("father", "әpә", R.drawable.family_father, R.raw.number_one));
        words.add(new Word("mother", "әṭa", R.drawable.family_mother, R.raw.number_one));
        words.add(new Word("son", "angsi", R.drawable.family_son, R.raw.number_one));
        words.add(new Word("daughter", "tune", R.drawable.family_daughter, R.raw.number_one));
        words.add(new Word("older brother", "taachi", R.drawable.family_older_brother, R.raw.number_one));
        words.add(new Word("younger brother", "chalitti", R.drawable.family_younger_brother, R.raw.number_one));
        words.add(new Word("older sister", "teṭe", R.drawable.family_older_sister, R.raw.number_one));
        words.add(new Word("younger sister", "kolliti", R.drawable.family_younger_sister, R.raw.number_one));
        words.add(new Word("grandmother", "ama", R.drawable.family_grandmother, R.raw.number_one));
        words.add(new Word("grandfather", "paapa", R.drawable.family_grandfather, R.raw.number_one));

        WordAdapter adapter = new WordAdapter(this, R.color.category_family, words);

        ListView listView = (ListView) findViewById(R.id.words_list);
        listView.setAdapter(adapter);
    }
}
