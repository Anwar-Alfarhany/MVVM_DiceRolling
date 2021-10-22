package com.anwaralfarhany.dicerolling.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.anwaralfarhany.dicerolling.model.DiceSidesNumbers

class DiceViewModel : ViewModel() {
    val diceSideNumber = MutableLiveData<DiceSidesNumbers>()

    fun getSideNumberRandomly(){
        diceSideNumber.postValue(DiceSidesNumbers.values().random())
    }
}
