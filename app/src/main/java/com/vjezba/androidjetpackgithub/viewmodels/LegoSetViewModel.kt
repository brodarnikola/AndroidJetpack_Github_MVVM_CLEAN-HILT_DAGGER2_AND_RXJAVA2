

package com.vjezba.androidjetpackgithub.viewmodels

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.vjezba.data.di.lego.LegoNetwork
import com.vjezba.data.lego.repository.LegoSetRepository

/**
 * The ViewModel used in [LegoSetFragment].
 */
class LegoSetViewModel @ViewModelInject constructor( @LegoNetwork repository: LegoSetRepository) : ViewModel() {

    lateinit var id: String

    val legoSet by lazy { repository.observeSet(id) }

}
