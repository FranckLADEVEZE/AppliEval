package me.kirkhorn.knut.android_sudoku;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.Locale;

import static android.preference.PreferenceManager.getDefaultSharedPreferences;

public class Choix extends AppCompatActivity {
    private final String TAG = "Choix";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkCurrentLocale();

    }

    private void checkCurrentLocale() {
        Log.i(TAG, "Checking current locale");
        SharedPreferences sharedPreferences = getDefaultSharedPreferences(this);

        Configuration configuration = new Configuration();
        Resources resources = getBaseContext().getResources();
        Locale locale = getResources().getConfiguration().locale;
    }

    private void refreshViewLanguages() {
        Button buttonStartNewGame = findViewById(R.id.buttonStartNewGame);
        buttonStartNewGame.setText(R.string.new_game);
        Button buttonShowInstructions = findViewById(R.id.buttonShowInstructions);
        buttonShowInstructions.setText(R.string.show_instructions);
    }

    public void onStartNewGameButtonClicked(View view) {
        Intent intent = new Intent("me.kirkhorn.knut.GameDifficultyActivity");
        startActivity(intent);
    }

    public void onShowInstructionsButtonClicked(View view) {
        Intent intent = new Intent("me.kirkhorn.knut.InstructionsActivity");
        startActivity(intent);
    }
}
