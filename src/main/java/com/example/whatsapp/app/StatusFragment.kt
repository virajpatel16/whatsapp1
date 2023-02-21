package com.example.whatsapp.app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.whatsapp.R
import com.example.whatsapp.R.drawable.*
import com.example.whatsapp.databinding.FragmentStatusBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [StatusFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class StatusFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    var status = arrayOf(pro1, pro2, pro3,pro4,pro5,pro6,pro7,pro8,pro9,pro10,pro11,pro12,pro13)
    var statusname= arrayOf("viraj","sahrukh khan","salaman khan","pathan","jay","sudir patel","mayank italiya","chetan","vasu","krunal dhola","vastal","prince","naitik",)
    var date = arrayOf("2:33 pm","2:00 pm","29/1/2023","yestrday","today"," 5 hours","4 hours","4 miniute","2 miniute","10 hourse","3:00 pm","6:09 pm","5:00 pm","1:00 pm")


    var arrayList = ArrayList<Statusdata>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var binding=FragmentStatusBinding.inflate(layoutInflater)

        for ( a in 0 .. status.size-1){
            var info=Statusdata(status.get(a),statusname.get(a),date.get(a))
            arrayList.add(info)
        }

        binding.statuslist.layoutManager=LinearLayoutManager(context)
        binding.statuslist.adapter=StatusAdepter(arrayList)
        return binding.root
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment StatusFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            StatusFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}