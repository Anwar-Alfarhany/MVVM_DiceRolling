package com.anwaralfarhany.dicerolling.model

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.anwaralfarhany.dicerolling.R

@BindingAdapter(value = ["app:setImage"])
fun setImage(imageView: ImageView, diceSidesNumbers: DiceSidesNumbers?){
    when(diceSidesNumbers){
        DiceSidesNumbers.ONE -> imageView.setBackgroundResource(R.drawable.dice_1)
        DiceSidesNumbers.TWO -> imageView.setBackgroundResource(R.drawable.dice_2)
        DiceSidesNumbers.THREE -> imageView.setBackgroundResource(R.drawable.dice_3)
        DiceSidesNumbers.FOUR -> imageView.setBackgroundResource(R.drawable.dice_4)
        DiceSidesNumbers.FIVE -> imageView.setBackgroundResource(R.drawable.dice_5)
        DiceSidesNumbers.SIX -> imageView.setBackgroundResource(R.drawable.dice_6)
    }

}