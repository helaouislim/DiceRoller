
package com.example.android.diceroller

import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.android.diceroller.dicefragment.DiceFourFragment
import com.example.android.diceroller.dicefragment.DiceOneFragment
import com.example.android.diceroller.dicefragment.DiceThreeFragment
import com.example.android.diceroller.dicefragment.DiceTwoFragment
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity() {

    /*
        Add unit test
        Add different kind of dice (need images)
        Improve architecture
        Improve Design
        Add UI test
        Delete Toast ??
        Splash screen ??
        Logo mipmap ??

     */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val diceOneFragment: Fragment = DiceOneFragment()
        val diceTwoFragment: Fragment = DiceTwoFragment()
        val diceThreeFragment: Fragment = DiceThreeFragment()
        val diceFourFragment: Fragment = DiceFourFragment()


        spNbrDice.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                when (parent?.getItemAtPosition(position).toString()) {
                    "1 dice" -> displayFragment(
                        diceOneFragment,
                        parent?.getItemAtPosition(position).toString()
                    )
                    "2 dices" -> displayFragment(
                        diceTwoFragment,
                        parent?.getItemAtPosition(position).toString()
                    )
                    "3 dices" -> displayFragment(
                        diceThreeFragment,
                        parent?.getItemAtPosition(position).toString()
                    )
                    else -> displayFragment(
                        diceFourFragment,
                        parent?.getItemAtPosition(position).toString()
                    )
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
            }

        }
    }

    private fun displayFragment(fragment: Fragment, optionSelected: String) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fl_fragment, fragment)
            addToBackStack(null) // to add a stck to not close the app when back arrow pressed
            commit()
        }
        Toast.makeText(
            this@MainActivity,
            "You selected $optionSelected",
            Toast.LENGTH_SHORT
        ).show()
    }

}
