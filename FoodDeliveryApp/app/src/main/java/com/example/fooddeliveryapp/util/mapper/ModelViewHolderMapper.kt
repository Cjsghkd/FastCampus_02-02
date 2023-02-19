package com.example.fooddeliveryapp.util.mapper

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.fooddeliveryapp.databinding.ViewholderEmptyBinding
import com.example.fooddeliveryapp.model.CellType
import com.example.fooddeliveryapp.model.Model
import com.example.fooddeliveryapp.screen.base.BaseViewModel
import com.example.fooddeliveryapp.util.provider.ResourcesProvider
import com.example.fooddeliveryapp.widget.adapter.viewholder.EmptyViewHolder
import com.example.fooddeliveryapp.widget.adapter.viewholder.ModelViewHolder

object ModelViewHolderMapper {

    @Suppress("UNCHECKED_CAST")
    fun <M: Model> map(
        parent: ViewGroup,
        type: CellType,
        viewModel: BaseViewModel,
        resourcesProvider: ResourcesProvider
    ): ModelViewHolder<M> {
        val inflater = LayoutInflater.from(parent.context)
        val viewHolder = when(type) {
            CellType.EMPTY_CELL -> EmptyViewHolder(
                ViewholderEmptyBinding.inflate(inflater, parent, false),
                viewModel,
                resourcesProvider
            )
        }
        return viewHolder as ModelViewHolder<M>
    }
}