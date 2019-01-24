package com.example.myapplication.base.presenter

import com.example.myapplication.base.view.BaseViewInterface

open class BasePresenter<V : BaseViewInterface>: BasePresenterInterface<V> {


    override val isAttached: Boolean
        get() = view != null

    var view: V? = null

    override fun attach(view: V) {

        this.view = view
    }

    override fun detach() {
        this.view = null
    }
}