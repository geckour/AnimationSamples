package sample.satsukies.transitionsamples.custom_shared

import android.content.Context
import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import sample.satsukies.transitionsamples.R
import sample.satsukies.transitionsamples.databinding.ItemContentBinding

class RecyclerAdapter(
        private val context: Context,
        private val parentPosition: Int,
        private val items: List<String>,
        private val listener: MyViewHolder.Listener)
    : RecyclerView.Adapter<RecyclerAdapter.MyViewHolder>() {

    class MyViewHolder(val binding: ItemContentBinding) : RecyclerView.ViewHolder(binding.root) {

        interface Listener {
            fun onClickItem(v: View)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding: ItemContentBinding =
                DataBindingUtil.inflate(LayoutInflater.from(parent.context), LAYOUT_ID, parent, false)

        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.binding.contentImage.setOnClickListener {
            Toast.makeText(context, "toast:$parentPosition-$position", Toast.LENGTH_SHORT)
                    .show()

            listener.onClickItem(holder.binding.contentImage)
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    companion object {

        private const val LAYOUT_ID = R.layout.item_content
    }
}
