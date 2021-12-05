package com.geekbrains.tests.presenter

import com.geekbrains.tests.view.ViewContract

internal interface PresenterContract<V : ViewContract> {
    fun onAttach(viewContract: V)
    fun onDetach()
}
