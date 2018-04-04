package sample.satsukies.transitionsamples.custom_shared

import android.content.Intent
import android.databinding.DataBindingUtil
import android.support.v4.app.ActivityOptionsCompat
import android.support.v4.util.Pair
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import sample.satsukies.transitionsamples.R
import sample.satsukies.transitionsamples.databinding.ActivityCustomSharedFirstBinding

class CustomSharedFirstActivity : AppCompatActivity() {

    private val adapter: MyListAdapter by lazy {
        MyListAdapter(this, mutableList) { v ->
            val optionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(this,
                    Pair(v, v.transitionName))

            val intent = Intent(this, CustomSharedSecondActivity::class.java)
            startActivity(intent, optionsCompat.toBundle())
        }
    }
    private val mutableList: MutableList<String> = mutableListOf("1", "2", "3", "4", "5", "6", "7", "8", "9", "10")

    lateinit var binding: ActivityCustomSharedFirstBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_custom_shared_first)

        binding.listView.adapter = adapter
    }
}
