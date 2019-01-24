package com.example.myapplication.main

import com.example.myapplication.base.presenter.BasePresenter
import java.util.*

class MainPresenter : BasePresenter<MainContract.View>(), MainContract.Presenter {

    private val helloTexts = listOf("Bonjour" , "Hola", "Privet", "Hi")

    override fun loadHelloText() {

        val random = Random()
        val hello = helloTexts[random.nextInt(helloTexts.size)]
        view?.onTextLoaded(hello)
    }

}