package de.chagemann.tablelayoutdivbyzero

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TableLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tableLayout = findViewById<TableLayout>(R.id.tableLayout)
        // Crash via XML or this property
        //tableLayout.isStretchAllColumns = true
    }
}
