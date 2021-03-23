package com.dgl114.improvedtodolist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GestureDetectorCompat;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.GestureDetector;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    private EditText mItemEditText;
    private TextView mItemListTextView;
    private ToDoList mToDoList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Get view
        mItemEditText = findViewById(R.id.toDoItem);
        mItemListTextView = findViewById(R.id.itemList);

        //Get model
        mToDoList = new ToDoList(this);

    }

    @Override
    protected void onResume() {
        super.onResume();

        try {
            // Attempt to load a previously saved list
            mToDoList.readFromFile();
            displayList();
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    protected void onPause() {
        super.onPause();

        try {
            // Save list for later
            mToDoList.saveToFile();
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void addButtonClick(View view) {
      // Ignore any leading or trailing spaces
      String item = mItemEditText.getText().toString().trim();

      // Clear the EditText so it's ready for another item
      mItemEditText.setText("");

      //Add the item to the list and display it
        if (item.length() > 0) {
            mToDoList.addItem(item);
            displayList(); 
        }
    }

    private void displayList() {
        // Display a numbered list of items
        StringBuffer itemText = new StringBuffer();
        String[] items = mToDoList.getItems();
        for (int i = 0; i < items.length; i++) {
            itemText.append(i + 1).append(". ").append(items[i]).append("\n");
        }
        mItemListTextView.setText(itemText);
    }

    public void clearButtonClick(View view) {
        //clear to-do list data from view
        //Call on ToDoList method
        mToDoList.clear();
        displayList();
    }
}