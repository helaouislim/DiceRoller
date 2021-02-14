package com.example.android.diceroller.dicefragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.android.diceroller.DiceObject
import com.example.android.diceroller.R
import kotlinx.android.synthetic.main.fragment_dice_one.*

class DiceOneFragment : Fragment(R.layout.fragment_dice_one) {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fr1_roll_button.setOnClickListener {
            fr1_dice_image1.setImageResource(DiceObject.rollDiceSix())
        }
    }
}