package id.sch.smktelkom_mlg.tugas01.xirpl1011.tugas01;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etNama, etTelpon;
    Spinner spKelas;
    RadioGroup rgJK;
    CheckBox cbE, cbPr, cbU, cbP;
    Button bOK;
    TextView tvHasil, tvHasil2, tvHasil3;
    int Minat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNama = (EditText) findViewById(R.id.editTextNama);
        etTelpon = (EditText) findViewById(R.id.editTextTelpon);
        rgJK = (RadioGroup) findViewById(R.id.rgKelas);
        spKelas = (Spinner) findViewById(R.id.spinner);
        cbE = (CheckBox) findViewById(R.id.checkBoxEssai);
        cbPr = (CheckBox) findViewById(R.id.checkBoxProsa);
        cbU = (CheckBox) findViewById(R.id.checkBoxUmum);
        cbP = (CheckBox) findViewById(R.id.checkBoxPelajaran);
        tvHasil2 = (TextView) findViewById(R.id.textView4);
        tvHasil3 = (TextView) findViewById(R.id.textView5);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
                                                         @Override
                                                         public void onClick(View v) {
                                                             doClick();
                                                         }
                                                     }
        );
    }

    private void doClick() {
        String nama = etNama.getText().toString();
        String Telpon = etTelpon.getText().toString();
        if (nama.length() < 3) {
            etNama.setError("Nama minimal 3 karater");
        }
        if (Telpon.length() < 10) {
            etTelpon.setError("Nomor Telephone minimal 10 digit");
        }
        tvHasil.setText("Nama   : " + nama + "\nNomor   : " + Telpon);
    }
}
