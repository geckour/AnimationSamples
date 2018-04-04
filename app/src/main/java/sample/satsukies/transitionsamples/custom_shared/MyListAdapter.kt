package sample.satsukies.transitionsamples.custom_shared

import android.content.Context
import android.databinding.DataBindingUtil
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import sample.satsukies.transitionsamples.R
import sample.satsukies.transitionsamples.databinding.ListItemBinding

class MyListAdapter(
        context: Context,
        private val items: List<String>,
        private val listener: Listener)
    : ArrayAdapter<String>(context, LAYOUT_ID, items) {

    companion object {
        private const val LAYOUT_ID = R.layout.list_item
    }

    interface Listener {
        fun onClickItem(v: View)
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val listItemBinding =
                convertView?.let {
                    DataBindingUtil.getBinding<ListItemBinding>(convertView)
                }
                        ?: DataBindingUtil.inflate<ListItemBinding>(
                                LayoutInflater.from(context),
                                LAYOUT_ID,
                                parent,
                                false
                        ).apply {
                            listTitle.text = "${items[position]}番目のレイアウトだよ"

                            val adapter =
                                    RecyclerAdapter(context, position, items, object : RecyclerAdapter.MyViewHolder.Listener {
                                        override fun onClickItem(v: View) {
                                            listener.onClickItem(v)
                                        }
                                    })

                            val manager = LinearLayoutManager(context).apply {
                                orientation = LinearLayoutManager.HORIZONTAL
                            }

                            contentList.adapter = adapter
                            contentList.layoutManager = manager
                        }

        return listItemBinding.root
    }
}
