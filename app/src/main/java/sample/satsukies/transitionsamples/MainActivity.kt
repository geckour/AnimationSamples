package sample.satsukies.transitionsamples

import android.content.Intent
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import sample.satsukies.transitionsamples.custom_shared.CustomSharedFirstActivity
import sample.satsukies.transitionsamples.databinding.ActivityMainBinding
import sample.satsukies.transitionsamples.simple.SimpleFirstActivity
import sample.satsukies.transitionsamples.simple_shared.SimpleSharedFirstActivity
import sample.satsukies.transitionsamples.simple_shared_code.SimpleSharedCodeFirstActivity
import sample.satsukies.transitionsamples.simple_shared_exclude.ExcludeSharedFirstActivity

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.buttonSimpleTransition.setOnClickListener { startActivity(Intent(this, SimpleFirstActivity::class.java)) }

        binding.buttonSimpleShared.setOnClickListener { startActivity(Intent(this, SimpleSharedFirstActivity::class.java)) }

        binding.buttonSimpleSharedCode.setOnClickListener { startActivity(Intent(this, SimpleSharedCodeFirstActivity::class.java)) }

        binding.buttonExcludeShared.setOnClickListener { startActivity(Intent(this, ExcludeSharedFirstActivity::class.java)) }

        binding.buttonCustomShared.setOnClickListener { startActivity(Intent(this, CustomSharedFirstActivity::class.java)) }
    }
}
