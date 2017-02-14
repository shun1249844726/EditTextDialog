package com.lexinsmart.retrofit.edittextdialog;

import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements EditTextDialog.LoginInputListener {

    private TextView tvText;
    EditTextDialog dialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button BtnEditDialog = (Button) findViewById(R.id.btn_edittext);
        tvText = (TextView) findViewById(R.id.textView);
        BtnEditDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 dialog = new EditTextDialog();
                dialog.show(getSupportFragmentManager(), "NoticeDialogFragment");
            }
        });
    }

    @Override
    public void onLoginInputComplete(String username, String password)
    {
        Toast.makeText(this, "帐号：" + username + ",  密码 :" + password,
                Toast.LENGTH_SHORT).show();
    }

}
