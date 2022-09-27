package com.example.digitallibrary;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import android.os.Bundle;

public class Library extends AppCompatActivity {
    TextView uname;
    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);
        Button btn1 = (Button) findViewById(R.id.btn1);
        registerForContextMenu(btn1);
        Button btn2 = (Button) findViewById(R.id.btn2);
        registerForContextMenu(btn2);
        Button btn3 = (Button) findViewById(R.id.btn3);
        registerForContextMenu(btn3);
        ImageButton bookshelfpg = (ImageButton) findViewById(R.id.bookshelfpg);
        bookshelfpg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Library.this,BookShelf.class);
                startActivity(i);
            }
        });
        ImageButton libpg = (ImageButton) findViewById(R.id.libpg);
        libpg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Library.this,Library.class);
                startActivity(i);
            }
        });
        ImageButton profilepg = (ImageButton) findViewById(R.id.profilepg);
        profilepg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Library.this,Profile.class);
                startActivity(i);
            }
        });
    }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        if(v.getId() == R.id.btn1) {
            menu.setHeaderTitle("Theoritical Computer Science");
            menu.add(0, v.getId(), 0, "Computational Complexity");
            menu.add(0, v.getId(), 0, "Algorithms");
            menu.add(0, v.getId(), 0, "Information Theory");
            menu.add(0, v.getId(), 0, "Computability Theory");
            menu.add(0, v.getId(), 0, "Cryptography");
            menu.add(0, v.getId(), 0, "Hardware");
            menu.add(0, v.getId(), 0, "Turing Machine");
            menu.add(0, v.getId(), 0, "Logic");
            menu.add(0, v.getId(), 0, "Graph Theory");
            menu.add(0, v.getId(), 0, "Computational Geometry");
            menu.add(0, v.getId(), 0, "Automata Theory");
            menu.add(0, v.getId(), 0, "Quantum Computation");
            menu.add(0, v.getId(), 0, "Parallel Programming");
            menu.add(0, v.getId(), 0, "Data Structures");
        }
        else if(v.getId() == R.id.btn2)
        {
            menu.setHeaderTitle("Computer Engineering");
            menu.add(0, v.getId(), 0, "Scheduling");
            menu.add(0, v.getId(), 0, "Computer Architecture");
            menu.add(0, v.getId(), 0, "Software and Programming Languages");
            menu.add(0, v.getId(), 0, "Compilers");
            menu.add(0, v.getId(), 0, "Operating Systems");
            menu.add(0, v.getId(), 0, "Software Engineering");
            menu.add(0, v.getId(), 0, "Networking");
            menu.add(0, v.getId(), 0, "Performance");
            menu.add(0, v.getId(), 0, "Computer Graphics");
        }
        else
        {
            menu.setHeaderTitle("Applications");
            menu.add(0, v.getId(), 0, "Optimisation");
            menu.add(0, v.getId(), 0, "Boolean Satisfiability");
            menu.add(0, v.getId(), 0, "Artificial Intelligence");
            menu.add(0, v.getId(), 0, "Machine Learning");
            menu.add(0, v.getId(), 0, "Computer Vision ");
            menu.add(0, v.getId(), 0, "Image Processing");
            menu.add(0, v.getId(), 0, "Natural Language processing");
            menu.add(0, v.getId(), 0, "Knowledge Representation");
            menu.add(0, v.getId(), 0, "Big Data");
            menu.add(0, v.getId(), 0, "Internet of Things");
            menu.add(0, v.getId(), 0, "Hacking");
            menu.add(0, v.getId(), 0, "Computational Science");
            menu.add(0, v.getId(), 0, "Super Computing");
            menu.add(0, v.getId(), 0, "Simulation");
            menu.add(0, v.getId(), 0, "Human Computer Interaction");
            menu.add(0, v.getId(), 0, "Virtual Reality");
            menu.add(0, v.getId(), 0, "Augmented Reality");
            menu.add(0, v.getId(), 0, "Teleprescence");
            menu.add(0, v.getId(), 0, "Robotics");
        }
    }
    @Override
    public boolean onContextItemSelected(MenuItem item) {
        if(item.getTitle()=="Computational Complexity"){
            Intent in1 = new Intent(this,Book1.class);
            startActivity(in1);
            Toast.makeText(getApplicationContext(),"Computational Complexity",Toast.LENGTH_LONG).show();
        }
        else if(item.getTitle()=="Algorithms"){
            Intent in2 = new Intent(this,Book3.class);
            startActivity(in2);
            Toast.makeText(getApplicationContext(),"Algorithms",Toast.LENGTH_LONG).show();
        }
        else if(item.getTitle()=="Information Theory"){
            Intent in2 = new Intent(this,Emptylist.class);
            startActivity(in2);
            Toast.makeText(getApplicationContext(),"Information Theory",Toast.LENGTH_LONG).show();
        }
        else if(item.getTitle()=="Computability Theory"){
            Intent in2 = new Intent(this,Emptylist.class);
            startActivity(in2);
            Toast.makeText(getApplicationContext(),"Computability Theory",Toast.LENGTH_LONG).show();
        }
        else if(item.getTitle()=="Cryptography"){
            Intent in2 = new Intent(this,Emptylist.class);
            startActivity(in2);
            Toast.makeText(getApplicationContext(),"Cryptography",Toast.LENGTH_LONG).show();
        }
        else if(item.getTitle()=="Hardware"){
            Intent in2 = new Intent(this,Emptylist.class);
            startActivity(in2);
            Toast.makeText(getApplicationContext(),"Hardware",Toast.LENGTH_LONG).show();
        }
        else if(item.getTitle()=="Turing Machine"){
            Intent in2 = new Intent(this,Emptylist.class);
            startActivity(in2);
            Toast.makeText(getApplicationContext(),"Turing Machine",Toast.LENGTH_LONG).show();
        }
        else if(item.getTitle()=="Logic"){
            Intent in2 = new Intent(this,Emptylist.class);
            startActivity(in2);
            Toast.makeText(getApplicationContext(),"Logic",Toast.LENGTH_LONG).show();
        }
        else if(item.getTitle()=="Graph Theory"){
            Intent in2 = new Intent(this,Emptylist.class);
            startActivity(in2);
            Toast.makeText(getApplicationContext(),"Graph Theory",Toast.LENGTH_LONG).show();
        }
        else if(item.getTitle()=="Computational Geometry"){
            Intent in2 = new Intent(this,Emptylist.class);
            startActivity(in2);
            Toast.makeText(getApplicationContext(),"Computational Geometry",Toast.LENGTH_LONG).show();
        }
        else if(item.getTitle()=="Automata Theory"){
            Intent in2 = new Intent(this,Emptylist.class);
            startActivity(in2);
            Toast.makeText(getApplicationContext(),"Automata Theory",Toast.LENGTH_LONG).show();
        }
        else if(item.getTitle()=="Quantum Computation"){
            Intent in2 = new Intent(this,Emptylist.class);
            startActivity(in2);
            Toast.makeText(getApplicationContext(),"Quantum Computation",Toast.LENGTH_LONG).show();
        }
        else if(item.getTitle()=="Parallel Programming"){
            Intent in2 = new Intent(this,Emptylist.class);
            startActivity(in2);
            Toast.makeText(getApplicationContext(),"Parallel Programming",Toast.LENGTH_LONG).show();
        }
        else if(item.getTitle()=="Data Structures"){
            Intent in2 = new Intent(this,Emptylist.class);
            startActivity(in2);
            Toast.makeText(getApplicationContext(),"Data Structures",Toast.LENGTH_LONG).show();
        }
        else if(item.getTitle()=="Scheduling"){
            Intent in2 = new Intent(this,Emptylist.class);
            startActivity(in2);
            Toast.makeText(getApplicationContext(),"Scheduling",Toast.LENGTH_LONG).show();
        }
        else if(item.getTitle()=="Computer Architecture"){
            Intent in2 = new Intent(this,Emptylist.class);
            startActivity(in2);
            Toast.makeText(getApplicationContext(),"Computer Architecture",Toast.LENGTH_LONG).show();
        }
        else if(item.getTitle()=="Software and Programming Languages"){
            Intent in2 = new Intent(this,Emptylist.class);
            startActivity(in2);
            Toast.makeText(getApplicationContext(),"Software and Programming Languagess",Toast.LENGTH_LONG).show();
        }
        else if(item.getTitle()=="Compilers"){
            Intent in2 = new Intent(this,Emptylist.class);
            startActivity(in2);
            Toast.makeText(getApplicationContext(),"Compilers",Toast.LENGTH_LONG).show();
        }
        else if(item.getTitle()=="Operating Systems"){
            Intent in2 = new Intent(this,Emptylist.class);
            startActivity(in2);
            Toast.makeText(getApplicationContext(),"Operating Systems",Toast.LENGTH_LONG).show();
        }
        else if(item.getTitle()=="Software Engineering"){
            Intent in2 = new Intent(this,Emptylist.class);
            startActivity(in2);
            Toast.makeText(getApplicationContext(),"Software Engineering",Toast.LENGTH_LONG).show();
        }
        else if(item.getTitle()=="Networking"){
            Intent in2 = new Intent(this,Emptylist.class);
            startActivity(in2);
            Toast.makeText(getApplicationContext(),"Networking",Toast.LENGTH_LONG).show();
        }
        else if(item.getTitle()=="Performance"){
            Intent in2 = new Intent(this,Emptylist.class);
            startActivity(in2);
            Toast.makeText(getApplicationContext(),"Performance",Toast.LENGTH_LONG).show();
        }
        else if(item.getTitle()=="Computer Graphics"){
            Intent in2 = new Intent(this,Emptylist.class);
            startActivity(in2);
            Toast.makeText(getApplicationContext(),"Computer Graphics",Toast.LENGTH_LONG).show();
        }
        else if(item.getTitle()=="Optimisation"){
            Intent in2 = new Intent(this,Emptylist.class);
            startActivity(in2);
            Toast.makeText(getApplicationContext(),"Optimisation",Toast.LENGTH_LONG).show();
        }
        else if(item.getTitle()=="Boolean Satisfiability"){
            Intent in2 = new Intent(this,Emptylist.class);
            startActivity(in2);
            Toast.makeText(getApplicationContext(),"Boolean Satisfiability",Toast.LENGTH_LONG).show();
        }
        else if(item.getTitle()=="Artificial Intelligence"){
            Intent in2 = new Intent(this,Book2.class);
            startActivity(in2);
            Toast.makeText(getApplicationContext(),"Artificial Intelligence",Toast.LENGTH_LONG).show();
        }else if(item.getTitle()=="Machine Learning"){
            Intent in2 = new Intent(this,Emptylist.class);
            startActivity(in2);
            Toast.makeText(getApplicationContext(),"Machine Learning",Toast.LENGTH_LONG).show();
        }
        else if(item.getTitle()=="Computer Vision"){
            Intent in2 = new Intent(this,Emptylist.class);
            startActivity(in2);
            Toast.makeText(getApplicationContext(),"Computer Vision",Toast.LENGTH_LONG).show();
        }else if(item.getTitle()=="Image Processing"){
            Intent in2 = new Intent(this,Emptylist.class);
            startActivity(in2);
            Toast.makeText(getApplicationContext(),"Image Processing",Toast.LENGTH_LONG).show();
        }
        else if(item.getTitle()=="Natural Language processing"){
            Intent in2 = new Intent(this,Emptylist.class);
            startActivity(in2);
            Toast.makeText(getApplicationContext(),"Natural Language processing",Toast.LENGTH_LONG).show();
        }
        else if(item.getTitle()=="Knowledge Representation"){
            Intent in2 = new Intent(this,Emptylist.class);
            startActivity(in2);
            Toast.makeText(getApplicationContext(),"Knowledge Representation",Toast.LENGTH_LONG).show();
        }else if(item.getTitle()=="Big Data"){
            Intent in2 = new Intent(this,Emptylist.class);
            startActivity(in2);
            Toast.makeText(getApplicationContext(),"Big Data",Toast.LENGTH_LONG).show();
        }else if(item.getTitle()=="Internet of Things"){
            Intent in2 = new Intent(this,Emptylist.class);
            startActivity(in2);
            Toast.makeText(getApplicationContext(),"Internet of Things",Toast.LENGTH_LONG).show();
        }else if(item.getTitle()=="Hacking"){
            Intent in2 = new Intent(this,Emptylist.class);
            startActivity(in2);
            Toast.makeText(getApplicationContext(),"Hacking",Toast.LENGTH_LONG).show();
        }else if(item.getTitle()=="Computational Science"){
            Intent in2 = new Intent(this,Emptylist.class);
            startActivity(in2);
            Toast.makeText(getApplicationContext(),"Computational Science",Toast.LENGTH_LONG).show();
        }
        else if(item.getTitle()=="Super Computing"){
            Intent in2 = new Intent(this,Emptylist.class);
            startActivity(in2);
            Toast.makeText(getApplicationContext(),"Super Computing",Toast.LENGTH_LONG).show();
        }else if(item.getTitle()=="Simulation"){
            Intent in2 = new Intent(this,Emptylist.class);
            startActivity(in2);
            Toast.makeText(getApplicationContext(),"Simulation",Toast.LENGTH_LONG).show();
        }else if(item.getTitle()=="Human Computer Interaction"){
            Intent in2 = new Intent(this,Emptylist.class);
            startActivity(in2);
            Toast.makeText(getApplicationContext(),"Human Computer Interaction",Toast.LENGTH_LONG).show();
        }else if(item.getTitle()=="Virtual Reality"){
            Intent in2 = new Intent(this,Emptylist.class);
            startActivity(in2);
            Toast.makeText(getApplicationContext(),"Virtual Reality",Toast.LENGTH_LONG).show();
        }else if(item.getTitle()=="Augmented Reality"){
            Intent in2 = new Intent(this,Emptylist.class);
            startActivity(in2);
            Toast.makeText(getApplicationContext(),"Augmented Reality",Toast.LENGTH_LONG).show();
        }else if(item.getTitle()=="Teleprescence"){
            Intent in2 = new Intent(this,Emptylist.class);
            startActivity(in2);
            Toast.makeText(getApplicationContext(),"Teleprescence",Toast.LENGTH_LONG).show();
        }
        else if(item.getTitle()=="Robotics"){
            Intent in2 = new Intent(this,Emptylist.class);
            startActivity(in2);
            Toast.makeText(getApplicationContext(),"Robotics",Toast.LENGTH_LONG).show();
        }
        else{
            return false;
        }
        return true;
    }
    @Override
    public boolean onCreateOptionsMenu( Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.upload,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item ){
        switch(item.getItemId()){
            case R.id.optiona:
                Toast.makeText(this, "List the Book", Toast.LENGTH_SHORT).show();
                Intent book=new Intent(Library.this,Notavailable.class);
                startActivity(book);
                return true;
            case R.id.optionb:
                Toast.makeText(this, "Upload the Book", Toast.LENGTH_SHORT).show();
                Intent review=new Intent(Library.this,MainActivity.class);
                startActivity(review);
                return true;
            default: return super.onOptionsItemSelected(item);

        }
    }
}
