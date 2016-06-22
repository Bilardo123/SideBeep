package com.example.user.sidebeep;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{

    LinearLayout layoutLoginAct, linearLogin, linearRegistrasi, linearForgotPass, linearPassConf, linearRegConf, linearWelcomeConf;
    ImageView imgLogin;
    Button btnMasuk, btnDaftar, btnNewPassword, btnRegConf, btnDaftarRegister, btnWelcomeConf;
    CheckBox chkRememberMe;
    TextView txtLupaPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        setView();
    }

    public void setView()
    {
        layoutLoginAct = (LinearLayout) findViewById(R.id.layoutLoginParent);
        imgLogin = (ImageView) findViewById(R.id.imgLogin);
        linearLogin = (LinearLayout) findViewById(R.id.layoutLogin);
        linearRegistrasi = (LinearLayout) findViewById(R.id.layoutRegistrasi);
        linearForgotPass = (LinearLayout) findViewById(R.id.layoutForgotPassword);
        linearPassConf = (LinearLayout) findViewById(R.id.layoutPasswordConfimation);
        linearRegConf = (LinearLayout) findViewById(R.id.layoutRegistrationConfirmation);
        linearWelcomeConf = (LinearLayout) findViewById(R.id.layoutWelcomeConfirmation);


        btnMasuk = (Button) findViewById(R.id.btnLogIn);
        btnDaftar = (Button) findViewById(R.id.btnDaftar);
        btnNewPassword = (Button) findViewById(R.id.btnNewPassword);
        btnRegConf = (Button) findViewById(R.id.btnRegConf);
        btnDaftarRegister = (Button) findViewById(R.id.btnDaftarRegistrasi);
        btnWelcomeConf = (Button) findViewById(R.id.btnWelcomeConf);
        chkRememberMe = (CheckBox) findViewById(R.id.chkRemember);
        txtLupaPassword = (TextView) findViewById(R.id.txtLupaPassword);
        btnMasuk.setOnClickListener(this);
        btnDaftar.setOnClickListener(this);
        btnNewPassword.setOnClickListener(this);
        btnRegConf.setOnClickListener(this);
        btnDaftarRegister.setOnClickListener(this);
        btnWelcomeConf.setOnClickListener(this);
        chkRememberMe.setOnClickListener(this);
        txtLupaPassword.setOnClickListener(this);

        hideAllLayout();
        changeLayout(1);
    }

    public void hideAllLayout() {
        linearLogin.setVisibility(View.GONE);
        linearRegistrasi.setVisibility(View.GONE);
        linearForgotPass.setVisibility(View.GONE);
        linearPassConf.setVisibility(View.GONE);
        linearRegConf.setVisibility(View.GONE);
        linearWelcomeConf.setVisibility(View.GONE);
    }

    public void changeLayout(int option)
    {
        if (option == 1)
            linearLogin.setVisibility(View.VISIBLE);
        else if(option == 2)
            linearForgotPass.setVisibility(View.VISIBLE);
        else if(option == 3)
            linearPassConf.setVisibility(View.VISIBLE);
        else if(option == 4)
            linearRegConf.setVisibility(View.VISIBLE);
        else if(option == 5)
            linearWelcomeConf.setVisibility(View.VISIBLE);
        else if(option == 6)
            linearRegistrasi.setVisibility(View.VISIBLE);
    }

    @Override
    public void onClick(View v)
    {
        if(v == btnMasuk)
        {
            hideAllLayout();
            changeLayout(3);
        }
        else if(v == btnDaftar)
        {
            hideAllLayout();
            changeLayout(6);
        }
        else if(v == chkRememberMe)
        {
        }
        else if(v == txtLupaPassword)
        {
            hideAllLayout();
            changeLayout(2);
        }
        else if(v == btnNewPassword)
        {
            hideAllLayout();
            changeLayout(5);
        }
        else if(v == btnDaftarRegister)
        {
            hideAllLayout();
            changeLayout(4);
        }
        else if(v == btnRegConf)
        {
            hideAllLayout();
            changeLayout(1);
        }
        else if(v == btnWelcomeConf)
        {
            Intent intent = new Intent(this, HomeActivity.class);
            startActivity(intent);
        }
    }

    @Override
    public void onBackPressed()
    {

        if(linearWelcomeConf.getVisibility() == View.VISIBLE)
        {
            hideAllLayout();
            changeLayout(3);
        }
        else if(linearLogin.getVisibility() == View.VISIBLE)
        {
            finish();
        }
        else
        {
            hideAllLayout();
            changeLayout(1);
        }
    }

}
