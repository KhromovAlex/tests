package com.geekbrains.tests

import com.geekbrains.tests.presenter.details.DetailsPresenter
import com.geekbrains.tests.view.details.ViewDetailsContract
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations

class DetailsPresenterTest {

    private lateinit var presenter: DetailsPresenter

    @Mock
    private lateinit var viewContract: ViewDetailsContract

    @Before
    fun setUp() {
        MockitoAnnotations.openMocks(this)
        presenter = DetailsPresenter()
    }

    @Test
    fun onIncrement_Test() {
        presenter.onAttach(viewContract)
        presenter.onIncrement()
        Mockito.verify(viewContract, Mockito.times(1)).setCount(1)
    }

    @Test
    fun onDecrement_Test() {
        presenter.onAttach(viewContract)
        presenter.onDecrement()
        Mockito.verify(viewContract, Mockito.times(1)).setCount(-1)
    }

    @Test
    fun onAttach_Test() {
        presenter.onAttach(viewContract)
        presenter.onDecrement()
        Mockito.verify(viewContract, Mockito.times(1)).setCount(-1)
    }

    @Test
    fun onDetach_Test() {
        presenter.onAttach(viewContract)
        presenter.onDetach()
        presenter.onDecrement()
        Mockito.verify(viewContract, Mockito.never()).setCount(-1)
    }
}
