package com.example.androidanimation.ui.modelviewer

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.androidanimation.R
import com.example.androidanimation.databinding.FragmentModelViewerBinding
import com.example.androidanimation.utils.viewbinding.viewBinding

class ModelViewerFragment : Fragment(R.layout.fragment_model_viewer) {

    private val binding by viewBinding(FragmentModelViewerBinding::bind)

    @SuppressLint("SetJavaScriptEnabled")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding.modelWebView) {
            loadUrl(getString(R.string.model_viewer_location))
            settings.apply {
                javaScriptEnabled = true
                loadWithOverviewMode = true
            }
        }





    }
}



