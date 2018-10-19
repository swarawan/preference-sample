package com.swarawan.binar9.ui.main.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.swarawan.binar9.R
import kotlinx.android.synthetic.main.fragment_main.*

/**
 * Created by Rio Swarawan on 10/17/18.
 */
class FragmentA : Fragment() {

    private var count = 0

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        buttonCounter.setOnClickListener {
            count += 1
            text1.text = "Hitung: $count"
        }
    }
}