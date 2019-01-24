package com.example.myapplication.base.presenter

import com.example.myapplication.base.view.BaseViewInterface

interface BasePresenterInterface<V : BaseViewInterface> {

    val isAttached: Boolean

    fun attach(view: V)

    fun detach()
}