package app.lat2_akbif9_10116417_gilangpanjiwanengpaticom.lat2_akbif9_10116417_gilangpanjiwanengpati;

/*Nama : Gilang Panji Waneng Pati
NIM  : 10116417
KELAS : AKB-IF9
Tanggal Pengerjaan : 16 April 2019*/
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void athere(View view){
        Intent intent = new Intent(Main2Activity.this,Main3Activity.class);
        startActivity(intent);
    }

}
