package com.example.myapplication.main

import android.os.BaseBundle
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.R
import com.example.myapplication.base.view.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity(), MainContract.View {




    private lateinit var presenter: MainContract.Presenter

    override val layoutResId = R.layout.activity_main

    override fun init(savedInstanceState: Bundle?) {

        presenter = MainPresenter()
        presenter.attach(this)
        presenter.loadHelloText()
        main_tv.setOnClickListener{
            presenter.loadHelloText()
        }



    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.detach()
    }

    override fun onTextLoaded(text: String) {

        main_tv.text = text

    }
}
