package com.geekbrains.tests.presenter.details

import com.geekbrains.tests.presenter.PresenterContract
import com.geekbrains.tests.view.ViewContract

internal interface PresenterDetailsContract<V : ViewContract> : PresenterContract<V> {
    fun setCounter(count: Int)
    fun onIncrement()
    fun onDecrement()
}
