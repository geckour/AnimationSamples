package sample.satsukies.transitionsamples.simple_shared

import android.content.Intent
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.ActivityOptionsCompat
import android.support.v7.app.AppCompatActivity
import sample.satsukies.transitionsamples.R
import sample.satsukies.transitionsamples.databinding.ActivitySimpleSharedFirstBinding

class SimpleSharedFirstActivity : AppCompatActivity() {

    lateinit var binding: ActivitySimpleSharedFirstBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_simple_shared_first)

        binding.buttonGo.setOnClickListener {
            val compat = ActivityOptionsCompat.makeSceneTransitionAnimation(this,
                    binding.image, binding.image.transitionName)

            startActivity(Intent(this, SimpleSharedSecondActivity::class.java), compat.toBundle())
        }
    }
}
