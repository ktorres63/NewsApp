package com.tutorial.newsapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class HomeFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    private lateinit var  adapter: MyAdapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var newsArrayList: ArrayList<News>

    lateinit var imageId : ArrayList<Int>
    lateinit var heading: ArrayList<String>
    lateinit var news: ArrayList<String>


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dataInitialized()
        val layoutManager = LinearLayoutManager(context)
        recyclerView = view.findViewById(R.id.rv_News)
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)
        adapter = MyAdapter(newsArrayList)
        recyclerView.adapter = adapter

    }

    private fun dataInitialized(){
        newsArrayList = arrayListOf<News>()

        imageId = arrayListOf(
            R.drawable.img_test,
            R.drawable.img_test,
            R.drawable.img_test,
            R.drawable.img_test,
            R.drawable.img_test,
            R.drawable.img_test,
            R.drawable.img_test,
            R.drawable.img_test,
            R.drawable.img_test,
            R.drawable.img_test
        )
        heading = arrayListOf(
            getString(R.string.head_1),
            getString(R.string.head_2),
            getString(R.string.head_3),
            getString(R.string.head_4),
            getString(R.string.head_5),
            getString(R.string.head_6),
            getString(R.string.head_7),
            getString(R.string.head_8),
            getString(R.string.head_9),
            getString(R.string.head_10),

        )
        news = arrayListOf(
            getString(R.string.news_a),
            getString(R.string.news_b),
            getString(R.string.news_c),
            getString(R.string.news_d),
            getString(R.string.news_e),
            getString(R.string.news_f),
            getString(R.string.news_g),
            getString(R.string.news_h),
            getString(R.string.news_i),
            getString(R.string.news_j),
        )

        for (i in imageId.indices){
            val news = News(imageId[i],heading[i])
            newsArrayList.add(news)

        }

    }
}