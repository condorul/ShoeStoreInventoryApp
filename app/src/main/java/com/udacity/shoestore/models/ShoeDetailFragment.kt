package com.udacity.shoestore.models

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.FragmentShoeDetailBinding
import com.udacity.shoestore.databinding.FragmentShoeListBinding


/**
 * A simple [Fragment] subclass.
 * Use the [ShoeDetailFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ShoeDetailFragment : Fragment() {

    private lateinit var binding: FragmentShoeDetailBinding
    private val shoeListViewModel: ShoeListViewModel by activityViewModels()


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
       //return inflater.inflate(R.layout.fragment_shoe_detail, container, false)
        /*val binding: FragmentShoeDetailBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_shoe_detail, container, false)
        binding.lifecycleOwner = this
        binding.shoeViewModel = viewModel*/
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_shoe_detail, container, false)
        binding.shoeViewModel = shoeListViewModel
        binding.lifecycleOwner = this

        binding.cancelButton.setOnClickListener { view: View ->
            Navigation.findNavController(view).navigate(R.id.action_shoeDetailFragment_to_shoeListFragment)
        }
        return binding.root
    }
}