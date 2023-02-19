package com.example.fooddeliveryapp.widget.adapter


import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.example.fooddeliveryapp.model.CellType
import com.example.fooddeliveryapp.model.Model
import com.example.fooddeliveryapp.screen.base.BaseViewModel
import com.example.fooddeliveryapp.util.mapper.ModelViewHolderMapper
import com.example.fooddeliveryapp.util.provider.ResourcesProvider
import com.example.fooddeliveryapp.widget.adapter.listener.AdapterListener
import com.example.fooddeliveryapp.widget.adapter.viewholder.ModelViewHolder

class ModelRecyclerAdapter<M: Model, VM: BaseViewModel>(
    private var modelList: List<Model>,
    private val viewModel: VM,
    private val resourcesProvider: ResourcesProvider,
    private val adapterListener: AdapterListener
): ListAdapter<Model, ModelViewHolder<M>>(Model.DIFF_CALLBACK) {

    override fun getItemCount(): Int = modelList.size

    override fun getItemViewType(position: Int): Int = modelList[position].type.ordinal

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ModelViewHolder<M> {
        return ModelViewHolderMapper.map(parent, CellType.values()[viewType], viewModel, resourcesProvider)
    }

    @Suppress("UNCHECKED_CAST")
    override fun onBindViewHolder(holder: ModelViewHolder<M>, position: Int) {
        with(holder) {
            bindData(modelList[position] as M)
            bindViews(modelList[position] as M, adapterListener)
        }
    }

    override fun submitList(list: MutableList<Model>?) {
        list?.let { modelList = it }
        super.submitList(list)
    }

}