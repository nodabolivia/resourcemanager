package com.cursoandroid.practico1.ui.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.cursoandroid.practico1.databinding.ItemListaRecursosBinding
import com.cursoandroid.practico1.models.Recurso

class RecursoArrayAdapter(context: Context
    ,var objects: MutableList<Recurso>
    , val listener: RecursoClickListener) :
    ArrayAdapter<Recurso>(context, android.R.layout.simple_list_item_1 , objects) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val binding:ItemListaRecursosBinding
        if (convertView == null){
            binding = ItemListaRecursosBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
            val holder = ViewHolder(binding)
            binding.root.tag =holder
        }else{
            val holder = convertView.tag as ViewHolder
            binding = holder.binding
        }
        val item =objects[position]
        binding.lbItemName.text = item.nombre
        binding.lbItemName.setOnClickListener {
            listener.recursoClicked(item)
        }
        binding.itemLayout.setOnClickListener{
            listener.recursoClicked(item)
        }
    return binding.root
    }


}
class ViewHolder(var binding: ItemListaRecursosBinding)
interface RecursoClickListener{
    fun recursoClicked( recurso:Recurso)
}
