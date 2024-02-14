package com.example.recyclerviewdemo

import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewdemo.ui.theme.RecyclerViewDemoTheme

class MainActivity : ComponentActivity() {
    val fruitsList = listOf<Fruit   >(
        Fruit("Mango", "Joe") ,
        Fruit ("Apple", "Alex"),
        Fruit("Banana", "Frank"),
        Fruit("Orange", "Joe"),
        Fruit("Pear", "Tim"),
        Fruit("Banana", "Frank"),
        Fruit("Orange", "Joe"),
        Fruit("Pear", "Tim"),
        Fruit("Banana", "Frank"),
        Fruit("Orange", "Joe"),
        Fruit("Pear", "Tim"))
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
            val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.setBackgroundColor(Color.DKGRAY)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = MyRecyclerViewAdapter(fruitsList)

    }
}