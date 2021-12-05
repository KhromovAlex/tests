package com.geekbrains.tests.presenter.search

import com.geekbrains.tests.presenter.PresenterContract
import com.geekbrains.tests.view.ViewContract

internal interface PresenterSearchContract<V : ViewContract> : PresenterContract<V> {
    fun searchGitHub(searchQuery: String)
    //onAttach
    //onDetach
}
