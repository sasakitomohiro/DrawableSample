package com.github.sasakitomohiro.drawablesample

import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.GroupieViewHolder

class DrawableListAdapter(
    drawableResList: List<Int>
) : GroupAdapter<GroupieViewHolder>() {
    init {
        update(
            drawableResList.map { DrawableItem(it) }
        )
    }
}
