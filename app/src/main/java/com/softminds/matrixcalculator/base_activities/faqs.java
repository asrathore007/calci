/*
 * Copyright (C) 2017 Ashar Khan <ashar786khan@gmail.com>
 *
 * This file is part of Matrix Calculator.
 *
 * Matrix Calculator is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Matrix Calculator is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Matrix Calculator.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package com.softminds.matrixcalculator.base_activities;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.widget.TextView;

import com.softminds.matrixcalculator.R;

public class faqs extends AppCompatActivity {

    boolean isDark;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        isDark=preferences.getBoolean("DARK_THEME_KEY",false);
        if(isDark)
            setTheme(R.style.AppThemeDark);
        else
            setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.help_layout);
        if(isDark)
        {
            SetThisColorToCard(ContextCompat.getColor(this,R.color.DarkcolorPrimary));
            SetThisColorToAllQuestions(ContextCompat.getColor(this,R.color.DarkcolorAccent));
        }
        else
        {
            SetThisColorToCard(ContextCompat.getColor(this,R.color.cardColor));
            SetThisColorToAllQuestions(ContextCompat.getColor(this,R.color.colorAccent));
        }

    }
    private void SetThisColorToCard(int id)
    {
        //grab all 7 cards
        CardView cardView1 = (CardView) findViewById(R.id.QA1);
        CardView cardView2 = (CardView) findViewById(R.id.QA2);
        CardView cardView3 = (CardView) findViewById(R.id.QA3);
        CardView cardView4 = (CardView) findViewById(R.id.QA4);
        CardView cardView5 = (CardView) findViewById(R.id.QA5);
        CardView cardView6 = (CardView) findViewById(R.id.QA6);
        CardView cardView7 = (CardView) findViewById(R.id.QA7);
        CardView cardView8 = (CardView) findViewById(R.id.QA8);
        CardView cardView9 = (CardView) findViewById(R.id.QA9);
        CardView cardView10 = (CardView) findViewById(R.id.QA10);
        //set the background color
        cardView1.setCardBackgroundColor(id);
        cardView2.setCardBackgroundColor(id);
        cardView3.setCardBackgroundColor(id);
        cardView4.setCardBackgroundColor(id);
        cardView5.setCardBackgroundColor(id);
        cardView6.setCardBackgroundColor(id);
        cardView7.setCardBackgroundColor(id);
        cardView8.setCardBackgroundColor(id);
        cardView9.setCardBackgroundColor(id);
        cardView10.setCardBackgroundColor(id);
    }
    private void SetThisColorToAllQuestions(int id)
    {
        //grab all 7 TextViews
        TextView textView1 = (TextView) findViewById(R.id.Q1);
        TextView textView2 = (TextView) findViewById(R.id.Q2);
        TextView textView3 = (TextView) findViewById(R.id.Q3);
        TextView textView4 = (TextView) findViewById(R.id.Q4);
        TextView textView5 = (TextView) findViewById(R.id.Q5);
        TextView textView6 = (TextView) findViewById(R.id.Q6);
        TextView textView7 = (TextView) findViewById(R.id.Q7);
        TextView textView8 = (TextView) findViewById(R.id.Q8);
        TextView textView9 = (TextView) findViewById(R.id.Q9);
        TextView textView10 = (TextView) findViewById(R.id.Q10);
        //set the background color
        textView1.setTextColor(id);
        textView2.setTextColor(id);
        textView3.setTextColor(id);
        textView4.setTextColor(id);
        textView5.setTextColor(id);
        textView6.setTextColor(id);
        textView7.setTextColor(id);
        textView8.setTextColor(id);
        textView9.setTextColor(id);
        textView10.setTextColor(id);
    }
}