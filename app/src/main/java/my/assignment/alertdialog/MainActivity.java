package my.assignment.alertdialog;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.app.FragmentManager;
import android.support.v7.app.AlertDialog;
import android.widget.Button;
import android.widget.Toast;
import android.app.Dialog;

import static my.assignment.alertdialog.R.styleable.View;

public class MainActivity extends AppCompatActivity {

    LayoutInflater inflater;
    Button byes,bno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inflater=inflater = ( LayoutInflater )this.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);


    }
    public void openDialog(View view){
        final Dialog dialog=new Dialog(MainActivity.this,android.R.style.Theme_Translucent);

        dialog.setContentView(R.layout.dialog_main);
        dialog.setCancelable(false);
        dialog.show();
        byes=(Button)dialog.findViewById(R.id.button);
        bno=(Button)dialog.findViewById(R.id.button2);
        byes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                dialog.dismiss();

            }
        });
        bno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });

     /*   final AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setIcon(android.R.drawable.ic_delete);
        builder.setTitle(R.string.dialog_alert_title);
        builder.setMessage(R.string.dialog_alert)
                .setPositiveButton(R.string.yes_btn, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Toast.makeText(getApplicationContext(),"Item deleted",Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton(R.string.no_btn, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // User cancelled the dialog

                    }
                });
        builder.show();*/




    }
}
