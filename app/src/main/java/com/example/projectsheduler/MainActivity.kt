package com.example.projectsheduler

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import java.util.Objects

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val addProjectBtn : FloatingActionButton = findViewById(R.id.add_project_btn)
//        val projectsListView : RecyclerView = findViewById(R.id.projects_list)
//        val projectsList : ArrayList<Objects> = ArrayList()
//
//        var arrayAdapter : ArrayAdapter<*>

        addProjectBtn.setOnClickListener {

            val builder = AlertDialog.Builder(this)
            val inflater = layoutInflater
            builder.setTitle("Enter the name of new project")

            val dialogLayout = inflater.inflate(R.layout.add_new_project_dlg, null)
            val enteredProjectName : EditText = dialogLayout.findViewById(R.id.new_project_name)

            builder.setView(dialogLayout)
            builder.setPositiveButton("OK") {
                dialogInterface,
                i -> Toast.makeText(applicationContext, "Project " + enteredProjectName.text.toString() + "was created",
                Toast.LENGTH_SHORT).show()
            }
            builder.setNegativeButton("Cancel", null)

            builder.show()
//            projectsList.add()
//            arrayAdapter = ArrayAdapter(
//                this,
//                android.R.layout.simple_list_item_1, projectsList
//            )
//            projectsListView.adapter = arrayAdapter
        }
    }
}