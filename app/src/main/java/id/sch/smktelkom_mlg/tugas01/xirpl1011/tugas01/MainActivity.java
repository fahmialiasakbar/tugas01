package id.sch.smktelkom_mlg.tugas01.xirpl1011.tugas01;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etNama, etTelpon;
    Spinner spKelas;
    RadioGroup rgK;
    RadioButton rbL, rbP;
    CheckBox cbE, cbPr, cbU, cbP;
    Button bOK;
    TextView tvHasil, tvHasil2, tvHasil3, tvHasil4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNama = (EditText) findViewById(R.id.editTextNama);
        etTelpon = (EditText) findViewById(R.id.editTextTelpon);
        rgK = (RadioGroup) findViewById(R.id.rgKelas);
        rbP = (RadioButton) findViewById(R.id.radioButtonP);
        rbL = (RadioButton) findViewById(R.id.radioButtonL);
        spKelas = (Spinner) findViewById(R.id.spinner);
        cbE = (CheckBox) findViewById(R.id.checkBoxEssai);
        cbPr = (CheckBox) findViewById(R.id.checkBoxProsa);
        cbU = (CheckBox) findViewById(R.id.checkBoxUmum);
        cbP = (CheckBox) findViewById(R.id.checkBoxPelajaran);
        tvHasil = (TextView) findViewById(R.id.Hasil);
        tvHasil2 = (TextView) findViewById(R.id.textView4);
        tvHasil3 = (TextView) findViewById(R.id.textView5);
        tvHasil4 = (TextView) findViewById(R.id.textView6);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doClick();
            }
        });
    }

    private void doClick() {
        String nama;
        String telpon;
        String jenis;
        String hasil = "Minat\n";
        nama = etNama.getText().toString();
        telpon = etTelpon.getText().toString();

        if (nama.length() < 3) {
            etNama.setError("Nama minimal 3 karakter");
        }
        if (telpon.length() < 10) {
            etTelpon.setError("Nomor Telephone minimal 10 karakter");
        }
        tvHasil.setText("Nama   : " + nama + "\nKontak   : " + telpon);

        if (cbE.isChecked()) hasil += cbE.getText() + "\n";
        if (cbPr.isChecked()) hasil += cbPr.getText() + "\n";
        if (cbU.isChecked()) hasil += cbU.getText() + "\n";
        if (cbP.isChecked()) hasil += cbP.getText() + "\n";
        tvHasil2.setText(hasil);
        tvHasil3.setText("Kelas : " + spKelas.getSelectedItem().toString());

    }


}
