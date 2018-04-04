package sample.satsukies.transitionsamples.custom_shared

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import sample.satsukies.transitionsamples.R
import sample.satsukies.transitionsamples.databinding.ListItemBinding

class MyListAdapter(private val context: AppCompatActivity, private val items: List<String>,
                    private val listener: Listener) : ArrayAdapter<String>(context, LAYOUT_ID, items) {

    companion object {
        private const val LAYOUT_ID = R.layout.list_item
    }

    private lateinit var adapter: RecyclerAdapter
    private val manager: LinearLayoutManager by lazy {
        LinearLayoutManager(context).apply {
            orientation = LinearLayoutManager.HORIZONTAL
        }
    }

    interface Listener {
        fun onClickItem(v: View)
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val listItemBinding: ListItemBinding =
                convertView?.let {
                    DataBindingUtil.getBinding<ListItemBinding>(convertView)
                } ?: DataBindingUtil.inflate(LayoutInflater.from(context), LAYOUT_ID, parent, false)

        listItemBinding.listTitle.text = "${items[position]}番目のレイアウトだよ"

        adapter = RecyclerAdapter(context, position, items) { v -> listener.onClickItem(v) }

        listItemBinding.contentList.adapter = adapter
        listItemBinding.contentList.layoutManager = manager

        return listItemBinding.root
    }
}
