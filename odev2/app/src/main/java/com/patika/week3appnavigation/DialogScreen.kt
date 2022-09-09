package com.patika.week3appnavigation

import android.app.AlertDialog
import android.app.Dialog
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.DialogFragment
import androidx.navigation.fragment.findNavController

class DialogScreen: DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return activity?.let {
            val builder = AlertDialog.Builder(it)
            builder.setMessage("Giriş Başarılı. Menüye Yönlendiriliyorsunuz.")
                .setPositiveButton("OK") { dialog, id ->
                    findNavController().apply {
                        navigate(R.id.action_dialogScreen_to_homeActivity)
                        backQueue.clear()
                    }
                }
                .setNegativeButton("Cancel") { dialog, id ->

                }
            builder.create()
        }?: throw IllegalStateException("activity can not null")


    }

}