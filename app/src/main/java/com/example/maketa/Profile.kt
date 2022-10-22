package com.example.maketa

import android.app.Activity
import android.os.Bundle
import android.text.TextUtils.replace
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.FragmentManager
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.NavigationUI.setupActionBarWithNavController
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.coroutines.selects.select
import java.util.*


class Profile : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ):
            View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profil, container, false);


    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val firstName ="Петров"
        val compani ="compani"

        val nameS = view.findViewById<TextView>(R.id.title_name)
        val nameImg = view.findViewById<TextView>(R.id.textView3)
        val companiName = view.findViewById<TextView>(R.id.textView2)

        nameImg.text = firstName[0].toString()
        companiName.text =compani
        nameS.text = firstName

        val buttonAlert = view.findViewById<Button>(R.id.button)
        buttonAlert.setOnClickListener{
            val builder = AlertDialog.Builder(view.context)
                .setMessage("Вы действительно хотите выйти?")
                .setPositiveButton("Да выйти", null)
                .setNegativeButton("Отмена", null)

                // Create the AlertDialog
                .create()

            builder.setOnShowListener {
                builder.getButton(AlertDialog.BUTTON_NEGATIVE).setOnClickListener {
                    builder.cancel()
                }
            }
            builder.setOnShowListener {
                builder.getButton(AlertDialog.BUTTON_POSITIVE).setOnClickListener {
                    builder.cancel()
                    findNavController().navigate(R.id.action_profil_to_obrasenie)
                }
            }

            builder.show()
        }
        }
    }




