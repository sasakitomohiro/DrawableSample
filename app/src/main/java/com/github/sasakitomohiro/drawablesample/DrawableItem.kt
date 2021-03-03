package com.github.sasakitomohiro.drawablesample

import android.view.View
import androidx.annotation.DrawableRes
import com.github.sasakitomohiro.drawablesample.databinding.ItemDrawableBinding
import com.xwray.groupie.viewbinding.BindableItem

class DrawableItem(
    @DrawableRes private val drawableRes: Int
) : BindableItem<ItemDrawableBinding>() {
    override fun getLayout(): Int = R.layout.item_drawable

    override fun initializeViewBinding(view: View) = ItemDrawableBinding.bind(view)

    override fun bind(viewBinding: ItemDrawableBinding, position: Int) {
        viewBinding.root.setBackgroundResource(drawableRes)
    }
}
