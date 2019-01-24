package com.example.myapplication.main

import com.example.myapplication.base.presenter.BasePresenterInterface
import com.example.myapplication.base.view.BaseViewInterface

interface MainContract {

    interface Presenter : BasePresenterInterface<MainContract.View>{

        fun loadHelloText()
    }

    interface View : BaseViewInterface {
        fun onTextLoaded(text: String)
    }
}