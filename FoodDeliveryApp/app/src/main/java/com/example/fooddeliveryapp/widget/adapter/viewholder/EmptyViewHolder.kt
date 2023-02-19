package com.example.fooddeliveryapp.widget.adapter.viewholder

import com.example.fooddeliveryapp.databinding.ViewholderEmptyBinding
import com.example.fooddeliveryapp.model.Model
import com.example.fooddeliveryapp.screen.base.BaseViewModel
import com.example.fooddeliveryapp.util.provider.ResourcesProvider
import com.example.fooddeliveryapp.widget.adapter.listener.AdapterListener

class EmptyViewHolder(
    private val binding: ViewholderEmptyBinding,
    viewModel: BaseViewModel,
    resourcesProvider: ResourcesProvider
): ModelViewHolder<Model>(binding, viewModel, resourcesProvider) {
    override fun reset() = Unit

    override fun bindViews(model: Model, adapterListener: AdapterListener) = Unit
}