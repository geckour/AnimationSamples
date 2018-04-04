package sample.satsukies.transitionsamples.simple_shared_code

import android.content.Intent
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.ActivityOptionsCompat
import android.support.v7.app.AppCompatActivity
import sample.satsukies.transitionsamples.R
import sample.satsukies.transitionsamples.databinding.ActivitySimpleSharedCodeFirstBinding

class SimpleSharedCodeFirstActivity : AppCompatActivity() {

    lateinit var binding: ActivitySimpleSharedCodeFirstBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_simple_shared_code_first)

        //add transition name (= android:transitionName)
        binding.image.transitionName = "image_code"

        binding.buttonGo.setOnClickListener { v ->
            val compat = ActivityOptionsCompat.makeSceneTransitionAnimation(this, binding.image,
                    binding.image.transitionName)

            startActivity(Intent(this, SimpleSharedCodeSecondActivity::class.java), compat.toBundle())
        }
    }
}
