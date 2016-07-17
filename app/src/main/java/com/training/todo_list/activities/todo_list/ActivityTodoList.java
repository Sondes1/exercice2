package com.training.todo_list.activities.todo_list;

import android.app.AlertDialog;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.training.todo_list.R;

import java.util.ArrayList;

public class ActivityTodoList extends ListActivity {

    private ArrayList<String> mSItems;
    private ArrayAdapter<String> mSItemsAdapter;
    private ListView mLvItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lt_act_todo_list);

        mLvItems = (ListView) findViewById(R.id.mLvItems);
        mSItems = new ArrayList<String>();
        mSItemsAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, mSItems);
        mLvItems.setAdapter(mSItemsAdapter);
        mSItems.add("Item 1");
        mSItems.add("Item 2");
        mSItems.add("Item 3");
        mSItems.add("Item 4");
        mSItems.add("Item 5");
        mSItems.add("Item 6");
        mSItems.add("Item 7");
    }


    public void askAddTodo(View pView) {
        Toast.makeText(this, "Ask add todo", Toast.LENGTH_SHORT).show();
        EditText tEtNewItem = (EditText) findViewById(R.id.etNewItem);
        String tSItemText = tEtNewItem.getText().toString();
        mSItemsAdapter.add(tSItemText);
        tEtNewItem.setText("");
    }


    public void askSurprise(View pView) {
        AlertDialog.Builder tBuilder = new AlertDialog.Builder(this);
        tBuilder.setTitle(R.string.dialog_title_surprise);
        tBuilder.setMessage(R.string.dialog_message_surprise);
        tBuilder.setPositiveButton(R.string.confirm, null);
        tBuilder.show();
    }
}
