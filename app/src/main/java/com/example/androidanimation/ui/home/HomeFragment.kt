package com.example.androidanimation.ui.home

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.androidanimation.R

import com.example.androidanimation.databinding.FragmentHomeBinding
import com.example.androidanimation.utils.viewbinding.viewBinding

class HomeFragment : Fragment(R.layout.fragment_home) {


    private val binding by viewBinding(FragmentHomeBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding) {
            modelViewerButton.setOnClickListener { modelViewerButtonClicked() }
            arCoreButton.setOnClickListener { arCoreButtonClicked() }
            button1.setOnClickListener { button1Clicked() }
            button2.setOnClickListener { button2Clicked() }
            brain.setOnClickListener { brainCliicked() }
            bottle.setOnClickListener { bottleCliicked() }


        }

    }

    private fun bottleCliicked() {
        findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToViewerFragment())
    }

    private fun brainCliicked() {
        findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToViewerFragment())
    }

    private fun button1Clicked() {
        findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToRobotFragment())
    }

    private fun button2Clicked() {
        findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToHorseFragment())
    }

    private fun modelViewerButtonClicked() {
        findNavController().navigate(HomeFragmentDirections.actionModelViewerFragmentToModelViewerFragment())

    }



    private fun arCoreButtonClicked() {
        val sceneViewerIntent = Intent(Intent.ACTION_VIEW)
        sceneViewerIntent.data =
            Uri.parse(getString(R.string.model_url))
        sceneViewerIntent.setPackage(getString(R.string.scene_viewer_package))
        startActivity(sceneViewerIntent)
    }

}







