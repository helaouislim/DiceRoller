package com.example.android.diceroller.dicefragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.android.diceroller.DiceObject
import com.example.android.diceroller.R
import kotlinx.android.synthetic.main.fragment_dice_three.*

class DiceThreeFragment : Fragment(R.layout.fragment_dice_three) {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        roll_button.setOnClickListener {
            dice_image1.setImageResource(DiceObject.rollDiceSix())
            dice_image2.setImageResource(DiceObject.rollDiceSix())
            dice_image3.setImageResource(DiceObject.rollDiceSix())
        }
    }
}