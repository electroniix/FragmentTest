package com.example.fragmenttest

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class ExampleFragment : Fragment() {

    companion object {
        fun newInstance(number: Int): ExampleFragment {
            val exampleFragment = ExampleFragment()
            val bundle = Bundle()

            bundle.putInt("number", number)
            exampleFragment.arguments = bundle

            return exampleFragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.example_fragment, container)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val numberView : TextView = view.findViewById(R.id.number)
        val arguments : Bundle? = arguments
        val number : Int? = arguments?.getInt("number")
        numberView.text = number.toString()
    }

}