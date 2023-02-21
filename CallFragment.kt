package com.example.whatsapp.app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.whatsapp.R.drawable.*
import com.example.whatsapp.databinding.FragmentCallBinding


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class CallFragment : Fragment(){
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    var photo = arrayOf(pro1, pro2,pro3,pro4,pro5,pro6,pro7,pro8,pro9,pro10,pro11,pro12,pro13)
    var callname= arrayOf("viraj","raj","tarun","dhruvil","jayaraj","sidharth","naitik","adit","akash","aryan","shubham","kirtan","dhruv")
    var aerrow= arrayOf(rightt,up, rightt,up, rightt,up, rightt, rightt,up,up,up, rightt,up)
    var late= arrayOf("14 minute ago","5 hourse ago","13 jan 2022 ,12:33 pm" ,"12 feb 2022 ,2:22 pm","5 minute ago","1 hours ago","Today,8:08pm","23 jan ,5:03pm","24 jan ,8:00","26 january ,12:22 pm","1 minute ago","4 hourse ago","10 minute hourse")
    var voicecall= arrayOf(call, videocall,call, videocall,call, videocall,call,call, videocall,call,
        videocall,call,call,)
    var arrayList=ArrayList<Calldata>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        var binding=FragmentCallBinding.inflate(layoutInflater)


for ( i in 0..photo.size-1){
    var  miscall=Calldata(photo.get(i),callname.get(i),aerrow.get(i),late.get(i),voicecall.get(i))
    arrayList.add(miscall)
}
        binding.calllist.layoutManager=LinearLayoutManager(context)
        binding.calllist.adapter=CallAdepter(arrayList)


        return binding.root
    }



    companion object {

        // TODO: Rename and change types and number of parameters
        @JvmStatic fun newInstance(param1: String, param2: String) =
                CallFragment().apply {
                    arguments = Bundle().apply {
                        putString(ARG_PARAM1, param1)
                        putString(ARG_PARAM2, param2)
                    }
                }
    }
}