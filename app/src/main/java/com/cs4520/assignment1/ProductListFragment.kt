package com.cs4520.assignment1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.cs4520.assignment1.databinding.FragmentLoginBinding
import com.cs4520.assignment1.databinding.FragmentProductListBinding

class ProductListFragment : Fragment() {

    //fragment that is being binded
    private var _binding: FragmentProductListBinding? = null
    //data binding
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        //reading the XML and painting the UI with the components in the XML
        _binding = FragmentProductListBinding.inflate(inflater, container, false)
        return binding.root
    }


}