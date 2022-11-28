package ru.yacevyuk.r.r.company.home_work_8

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import ru.yacevyuk.r.r.company.home_work_8.databinding.FragmentFourthBinding

class BlankFragment4 : Fragment() {
private lateinit var binding: FragmentFourthBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
           binding = FragmentFourthBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
       binding.buttonRed.setOnClickListener{
           Navigation.findNavController(it).navigate(R.id.action_blankFragment4_to_blankFragment35)

       }
        binding.buttonGreen.setOnClickListener{
            Navigation.findNavController(it).navigate(R.id.action_blankFragment4_to_blankFragment8)
        }
        binding.buttonBlue.setOnClickListener{
            Navigation.findNavController(it).navigate(R.id.action_blankFragment4_to_blankFragment25)
        }

    }


}