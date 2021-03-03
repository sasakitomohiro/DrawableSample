package com.github.sasakitomohiro.drawablesample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.github.sasakitomohiro.drawablesample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy {
        DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
    }

    private val drawableResList = listOf(
            R.drawable.double_color_circle_gradient,
            R.drawable.triple_color_circle_gradient,
            R.drawable.triple_color_circle_diagonally_gradient
    )

    private val drawableListAdapter = DrawableListAdapter(drawableResList)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.recycler.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.recycler.adapter = drawableListAdapter
    }
}
