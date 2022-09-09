package com.akinayhan.week3

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.akinayhan.week3.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var fragmentHomeBinding: FragmentHomeBinding

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.v("TEST", "onAttach called.")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.v("TEST", "onCreated called")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.v("TEST", "onCreateView called")

        fragmentHomeBinding = FragmentHomeBinding.inflate(inflater)
        return fragmentHomeBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        /*  buton tıklama eventimizi çağırıyoruz.
            önce edit text'ten ismi çekiyoruz.
            sonra textview a ismi yazıyoruz.
         */
        Log.v("TEST", "onViewCreated called")
        fragmentHomeBinding.apply {
            btnChange.setOnClickListener {
                val name = edtName.getText().toString()
                txtName.setText(name)
            }
        }
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        Log.v("TEST", "onViewStateRestored called")

        //onSaveInstanceState metodunda kaydedilen değeri atıyoruz.
        val name = savedInstanceState?.getString("name")
        fragmentHomeBinding.txtName.setText(name)
    }

    override fun onStart() {
        super.onStart()
        Log.v("TEST", "onStart called")
    }

    override fun onResume() {
        super.onResume()
        Log.v("TEST", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.v("TEST", "onPause")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.v("TEST", "onSaveInstanceState called")

        //name i bundle tipindeki parametreye geçirip korumaya alıyoruz.
        fragmentHomeBinding.txtName
        outState.putString("name", fragmentHomeBinding.txtName.getText().toString())
    }


    override fun onDestroy() {
        super.onDestroy()
        Log.e("TEST", "onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.e("TEST", "onDetach called")
    }
}